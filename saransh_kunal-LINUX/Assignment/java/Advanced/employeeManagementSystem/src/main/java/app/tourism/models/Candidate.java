package app.tourism.models;

import app.tourism.data.EmployeeEntity;

public record Candidate(int Empno,String Ename,String Job,int deptno) {
    
    public static Candidate fromEmployee(EmployeeEntity entity){
        
        return new Candidate(
            entity.getEmpno(), 
            entity.getEname(),
            entity.getJob(),
            entity.getDeptno()
        );
    }
}

