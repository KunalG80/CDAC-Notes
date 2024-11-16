package app.tourism.models;

import app.tourism.data.EmployeeEntity;
import jakarta.persistence.*;
import jakarta.persistence.EntityManagerFactory;

public class SiteModel {
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("app.data");

    public Iterable<Candidate> getCandidate()
    {
        try(var em = emf.createEntityManager()){
            var query = em.createQuery("SELECT t FROM EmployeeEntity t ", EmployeeEntity.class);
            return query.getResultStream()
                .map(Candidate::fromEmployee)
                .toList();
        }
    }

    public boolean acceptCandidate(int Empno, String Ename, String Job, int deptno)
    {
        try(var em = emf.createEntityManager()){
            var cand = new EmployeeEntity();
            cand.setEmpno(Empno);
            cand.setEname(Ename);
            cand.setJob(Job);
            cand.setDeptno(deptno);
            em.getTransaction().begin();
            em.persist(cand);
            em.getTransaction().commit();
            return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }           
    }

}
