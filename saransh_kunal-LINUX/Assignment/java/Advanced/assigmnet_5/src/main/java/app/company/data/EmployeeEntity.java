package app.company.data;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMP")
@NamedQuery(name = "findAllEmployee", query = "SELECT e FROM EmployeeEntity e WHERE e.Deptno = ?1")
public class EmployeeEntity {
    
    @Id
    @Column(name = "EMPNO")
    private int Empno;

    @Basic
    @Column(name = "ENAME")
    private String Name;

    @Column
    private String JOB;

    @Column(name = "SAL")
    private double Sal;

    @Column(name = "DEPTNO")
    private int Deptno;

    public int getEmpno() {
        return Empno;
    }

    public void setEmpno(int empno) {
        Empno = empno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getJob() {
        return JOB;
    }

    public void setJob(String job) {
        JOB = job;
    }

    public double getSal() {
        return Sal;
    }

    public void setSal(int sal) {
        Sal = sal;
    }

    public int getDeptno() {
        return Deptno;
    }

    public void setDeptno(int deptno) {
        Deptno = deptno;
    }

    

}
