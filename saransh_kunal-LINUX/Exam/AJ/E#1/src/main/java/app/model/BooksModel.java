package app.model;

import java.util.List;

import app.entities.Books;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class BooksModel {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("app.data");
    private static EntityManager em = emf.createEntityManager();
    private static EntityTransaction et = em.getTransaction();

    public static List<Books> getAllBooks(){
        return em.createQuery("SELECT b FROM books b", Books.class).getResultList();
    }

    // public static void deleteBooks(int isbn){
    //     et.begin();
    //     em.remove(em.find(Books.class, isbn));
    //     et.commit();
    // }

    public static void saveBooks(int isbn){
        Books books = bk.find(Books.class, isbn);
        Employee highestIsbn = bk.createQuery("SELECT b FROM books b ORDER BY b.id DESC", Books.class)
                        .setMaxResults(1) 
                        .getSingleResult();
        if(books!=null){
            bk.setId(highestIsbn.getId()+1);
            et.begin();
            em.persist(books);
            et.commit();
        }else{
            throw new RuntimeException("Book not found");
        }
    }



    public List<Books> getBooksByname(varchar name){
        return em.createQuery("SELECT b FROM books b WHERE b.name = :name", Books.class).setParameter("name", name).getResultList();
    }


    private double deptno;
    private List<Books> books;

    public int Id() {
        return id;
    }

    public void setIsbn(int id) {
        this.id = id;
        this.books = getBooksByname(name);
    }

    public List<Books> getBookList() {
        return books;
    }
}
