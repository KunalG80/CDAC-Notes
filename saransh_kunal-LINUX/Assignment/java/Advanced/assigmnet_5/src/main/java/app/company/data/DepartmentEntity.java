package app.company.data;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "DEPT")
public class DepartmentEntity {
    
    @Id
    @Column(name = "DEPTNO")
    private int deptno;

    @Column
    private String DNAME;

    @Column
    private String LOC;

    @OneToMany
    @JoinColumn(name = "DEPTNO")
    private List<EmployeeEntity> Employee;

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDNAME() {
        return DNAME;
    }

    public void setDNAME(String dNAME) {
        DNAME = dNAME;
    }

    public String getLOC() {
        return LOC;
    }

    public void setLOC(String lOC) {
        LOC = lOC;
    }

    public List<EmployeeEntity> getEmployee() {
        return Employee;
    }

    public void setEmployee(List<EmployeeEntity> employee) {
        Employee = employee;
    }
    
}
