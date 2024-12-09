package app.model;

import java.util.List;

import app.entities.Department;
import app.entities.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeModel {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("app.data");
    private static EntityManager em = emf.createEntityManager();
    private static EntityTransaction et = em.getTransaction();

    public static List<Employee> getAllEmployees(){
        return em.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
    }

    public static void deleteEmployee(double empno){
        et.begin();
        em.remove(em.find(Employee.class, empno));
        et.commit();
    }

    public static void saveEmployee(Employee emp,double deptno){
        Department department = em.find(Department.class, deptno);
        Employee highestEmp = em.createQuery("SELECT e FROM Employee e ORDER BY e.empno DESC", Employee.class)
                        .setMaxResults(1) 
                        .getSingleResult();
        if(department!=null){
            emp.setEmpno(highestEmp.getEmpno()+1);
            emp.setDepartment(department);
            et.begin();
            em.persist(emp);
            et.commit();
        }else{
            throw new RuntimeException("department not found");
        }
    }



    public List<Employee> getEmployeesByDeptId(double deptId){
        return em.createQuery("SELECT e FROM Employee e WHERE e.department.deptno = :deptId", Employee.class).setParameter("deptId", deptId).getResultList();
    }


    private double deptno;
    private List<Employee> employees;

    public double getDeptno() {
        return deptno;
    }

    public void setDeptno(double deptno) {
        this.deptno = deptno;
        this.employees = getEmployeesByDeptId(deptno);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
