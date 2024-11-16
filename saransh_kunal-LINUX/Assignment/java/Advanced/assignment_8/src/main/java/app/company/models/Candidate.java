package app.company.models;

import java.util.Date;

import app.company.data.DepartmentEntity;
import app.company.data.EmployeeEntity;

public record Candidate(int deptno, String dname, String loc) {
    
    public static Candidate fromTraveler(DepartmentEntity entity){
        var trips = entity.getEmployee();
        return new Candidate(
            entity.getDeptno(), 
            entity.getDNAME(),
            entity.getLOC()
        );
    }
}
