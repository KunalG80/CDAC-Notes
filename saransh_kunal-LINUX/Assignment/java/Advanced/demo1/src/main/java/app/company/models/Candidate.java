package app.company.models;


import app.company.data.*;

public record Candidate(int Empno, String Ename, String Job, DepartmentEntity Deptno) {
    public static Candidate fromEmployee(EmployeeEntity entity) {
        var depts = entity.getDepartmentEntityId();
        return new Candidate(
            entity.getEmpno(),
            entity.getEname(),
            entity.getJob(),
            entity.getDepartmentEntityId()
        );
}
}
