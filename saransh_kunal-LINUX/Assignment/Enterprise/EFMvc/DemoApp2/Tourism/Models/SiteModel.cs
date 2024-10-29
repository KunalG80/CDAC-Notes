using Shopping.Data;
// using Tourism.Data;

namespace Tourism.Models;

public class SiteModel
{
    public IEnumerable<Candidate2> GetCandidate()
    {
        using var site = new EmployeeDbContext();
        var selection = from t in site.Employees
                        select new Candidate2
                        {
                              Id = t.Id,
                            Name = t.name,
                           Job = t.job,
                           Department = t.DepartmentId
                        };
        return selection.ToList();
    }

     public IEnumerable<Candidate> GetCandidate2()
    {
        using var site = new EmployeeDbContext();
        var selection = from t in site.departments
                        select new Candidate
                        {
                              DeptId = t.Id,
                            Dname = t.dname,
                           Loc = t.loc
                        };
        return selection.ToList();
    }

    public void AddEmployee(decimal id, string name , string job ,decimal deptid )
    {
        using var site = new EmployeeDbContext();
        var dept = site.Employees.Find(id);
        if(dept is null)
        {
            dept = new Employee { Id = id };
            site.Employees.Add(dept);
        }
        // dept.det.Add(new Employee());
        dept.name = name;
        dept.DepartmentId=deptid;
        dept.job = job;
        site.SaveChanges();
    }

     public void AddDepartment(decimal id, string name,string loc )
    {
        using var site = new EmployeeDbContext();
        var dept = site.departments.Find(id);
        if(dept is null)
        {
            dept = new Department { Id = id };
            site.departments.Add(dept);
        }
        // dept.det.Add(new Employee());
        dept.dname = name;
        dept.loc = loc;
       
        site.SaveChanges();
    }
}