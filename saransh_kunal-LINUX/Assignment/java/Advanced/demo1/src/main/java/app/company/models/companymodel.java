package app.company.models;

import app.company.data.DepartmentEntity;
import app.company.data.EmployeeEntity;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class companymodel {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("app.data");

    public Iterable<Candidate> getCandidates() {
        try(var em = emf.createEntityManager()){
            var query = em.createQuery("SELECT t FROM EmployeeEntity t ", EmployeeEntity.class);
            return query.getResultStream()
                .map(Candidate::fromEmployee)
                .toList();
        }
    }

    public boolean acceptCandidate(int candidateid, String candidatename, String candidatejob, DepartmentEntity candidatedeptno)
    {
    try(var em = emf.createEntityManager()){
        var employer = new EmployeeEntity();
        employer.setEmpno(candidateid);
        employer.setEname(candidatename);
        employer.setJob(candidatejob);
        employer.setDepartmentEntityId(candidatedeptno);
        var tx = em.getTransaction();
        tx.begin();
        em.persist(employer);
        tx.commit();
        return true;
    }
    }
    
}
