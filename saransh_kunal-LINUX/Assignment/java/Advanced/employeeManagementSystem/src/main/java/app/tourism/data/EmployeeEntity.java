package app.tourism.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMP")
public class EmployeeEntity {
    
    @Id
    @Column( name = "EMPNO")
    private int Empno;

    @Column (name = "ENAME")
    private String Ename;

    @Column (name = "JOB")
    private String Job;

    @Column(name = "DEPTNO")
    private int deptno;

    public int getEmpno() {
        return Empno;
    }

    public void setEmpno(int empno) {
        Empno = empno;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

   
    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    
    
}
