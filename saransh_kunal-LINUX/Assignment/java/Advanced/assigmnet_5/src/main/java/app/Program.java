package app;

import app.company.data.EmployeeEntity;
import jakarta.persistence.Persistence;

public class Program {
    
    public static void main(String[] args) throws Exception {
        // var emf = Persistence.createEntityManagerFactory("app.data");
        // var em = emf.createEntityManager();
        var emf = Persistence.createEntityManagerFactory("app.data");
        var em = emf.createEntityManager();
        if(args.length==0){
            var EmployeeList = em.createNamedQuery("findAllEmployee",EmployeeEntity.class)
            .setParameter(1,20)
            .getResultList();
            for(var item : EmployeeList)
                System.out.printf("%d\t%s\t%d%n", item.getEmpno(), item.getName(), item.getDeptno());
            
        }
    }
}

