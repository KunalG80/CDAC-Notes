package app.model;

import java.util.List;

import app.entities.Department;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DepartmentModel {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("app.data");
    private static EntityManager em = emf.createEntityManager();
    private static EntityTransaction et = em.getTransaction();

     public List<Department> getDepartments(){
        return em.createQuery("SELECT d FROM Department d", Department.class).getResultList();
    }
}
