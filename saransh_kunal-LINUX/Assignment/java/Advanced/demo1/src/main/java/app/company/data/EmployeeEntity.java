package app.company.data;

import jakarta.persistence.*;

@Entity
@Table(name = "EMP")
@NamedQuery(name = "EmployeeEntity.findAll", query = "SELECT e FROM EmployeeEntity e")
public class EmployeeEntity {
    @Id
    @Column(name = "EMPNO")
    private int empno;

    @Column(name="ENAME")
    private String ename;

    @Column(name="JOB")
    private String job;

    @ManyToOne
    @JoinColumn(name = "DEPTNO")
    private DepartmentEntity DepartmentEntityId;

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public DepartmentEntity getDeptno() {
        return deptno;
    }

    public void setDeptno(DepartmentEntity Deptno) {
        this.Dept = Deptno;
    }
}
