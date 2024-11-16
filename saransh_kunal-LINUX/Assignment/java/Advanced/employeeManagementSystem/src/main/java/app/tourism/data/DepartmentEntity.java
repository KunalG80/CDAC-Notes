package app.tourism.data;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "DEPT")
public class DepartmentEntity {
    
    @Id
    @Column(name = "DEPTNO")
    private int deptno;

    @Column(name = "DNAME")
    private String Dname;

    @Column(name = "LOC")
    private String loc;

    @OneToMany
    @JoinColumn(name = "DEPTNO")
    private List<EmployeeEntity> emps;

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public List<EmployeeEntity> getEmps() {
        return emps;
    }

    public void setEmps(List<EmployeeEntity> emps) {
        this.emps = emps;
    }

   
}

