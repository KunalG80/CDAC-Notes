package app.company.data;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMP")
public class EmployeeEntity {
    
    @Id
    @Column(name = "EMPNO")
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Empno;

    @Basic
    @Column(name = "ENAME")
    private String Name;

    @Column
    private String JOB;

    @Column(name = "SAL")
    private double Sal;

   @ManyToOne
    @JoinColumn(name ="DEPTNO")
    private DepartmentEntity Deptno;

    public int getEmpno() {
        return Empno;
    }

    public void setEmpno(int empno) {
        Empno = Empno;
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

    public DepartmentEntity getDeptno() {
        return Deptno;
    }

    public void setDeptno(DepartmentEntity deptno) {
        Deptno = deptno;
    }

    

}
