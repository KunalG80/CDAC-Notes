using Company.Data;

namespace Company.Models;

public class CompanyModel
{
    public IEnumerable<AllCandidate> GetCandidates()
    {
        using var site = new CompanyDbContext();
        var selection = from n in site.Employees
                        //where n.Name.Length > 1
                        select new AllCandidate
                        {
                            Id = n.Id,
                            EmpName = n.Name,
                            Jobs = n.Job,
                            Sal = n.Salary,
                            DeptId = n.DepartmentId
                        };
        return selection.ToList();
    }

     public IEnumerable<AllDept> GetDepartments()
    {
        using var site = new CompanyDbContext();
        var selection = from n in site.Departments
                        //where n.DeptName.Length > 1
                        select new AllDept
                        {
                            Id = n.Id,
                            DeptName = n.DeptName,
                            Loc = n.Location,
                        };
        return selection.ToList();
    }

    public void AcceptCandidate(decimal candidateId, string candidateName, string candidateJob, decimal candidateSal,  decimal candidateDeptId)
    {
        using var site = new CompanyDbContext();
        var employer = site.Employees.Find(candidateId);
        if(employer is null)
        {
            employer = new Employee { Id = candidateId};
            site.Employees.Add(employer);
        }
        
        //employer.DepartmentId.Add(new Department());
        employer.Id = candidateId;
        employer.Name = candidateName;
        employer.Job = candidateJob;
        employer.Salary = candidateSal;
        employer.DepartmentId = candidateDeptId;
        site.SaveChanges();
    }

    public void AcceptDepartment(decimal departmentId, string departmentName,string departmentLoc)
    {
        using var site = new CompanyDbContext();
        var depart = site.Departments.Find(departmentId);
        if(depart is null)
        {
            depart = new Department { Id = departmentId};
            site.Departments.Add(depart);
        }
        
        //depart.EMPS.Add(new Employee());
        depart.Id = departmentId;
        depart.DeptName = departmentName;
        depart.Location = departmentLoc;
        site.SaveChanges();
    }
}