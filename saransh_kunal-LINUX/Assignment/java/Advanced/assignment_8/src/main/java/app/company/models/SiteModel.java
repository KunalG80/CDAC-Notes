package app.company.models;

import app.company.data.DepartmentEntity;
import app.company.data.EmployeeEntity;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class SiteModel {
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("app.data");

    public Iterable<Candidate> getEmployee() {
        try(var em = emf.createEntityManager()){
            var query = em.createQuery("SELECT t FROM DepartmentEntity t", DepartmentEntity.class);
            return query.getResultStream()
                .map(Candidate::fromTraveler)
                .toList();
        }
    }

    public boolean acceptVisit(int deptno, String dname, String loc) {
      
        try(var em = emf.createEntityManager()){
            var department = em.find(DepartmentEntity.class, deptno);
            if(department == null){
                department = new DepartmentEntity();
                department.setDeptno(deptno);
            }
            department.setDNAME(dname);
            department.setLOC(loc);
            var emp = new EmployeeEntity();
            emp.setDeptno(department);
            department.getEmployee().add(emp);
            var tx = em.getTransaction();
            tx.begin();
            em.persist(department);
            tx.commit();
            return true;
        }
    }

}
