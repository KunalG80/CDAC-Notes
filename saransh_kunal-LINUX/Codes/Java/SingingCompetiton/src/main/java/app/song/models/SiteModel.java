package app.song.models;
import app.song.data.SingerEntity;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class SiteModel{
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("app.data");

    public Iterable<Contestant> getContestant(){
        try(var em = emf.createEntityManager()){
            var query = em.createQuery("SELECT t FROM SingerEntity t",SingerEntity.class);
            return query.getResultStream()
            .map(Contestant::Candidate)
            .toList();
       
        }
    }
    public boolean acceptCandidate(int id , String name, int age, int salary){
        try(var em =emf.createEntityManager()){
            var cand = new SingerEntity();
            cand.setId(id);
            cand.setName(name);
            cand.setAge(age);
            cand.setSalary(salary);
            em.getTransaction().begin();
            em.persist(cand);
            em.getTransaction().commit();
            return true;
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }



}