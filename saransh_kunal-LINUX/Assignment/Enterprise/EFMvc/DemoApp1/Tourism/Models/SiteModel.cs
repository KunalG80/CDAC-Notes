using Shopping.Data;
// using Tourism.Data;

namespace Tourism.Models;

public class SiteModel
{
    public IEnumerable<Candidate> GetCandidate()
    {
        using var site = new EmployeeDbContext();
        var selection = from t in site.departments
                        // where t.Id.Length > 1
                        select new Candidate
                        {
                              deptId = t.Id,
                            dname = t.dname,
                           loc = t.loc
                        };
        return selection.ToList();
    }

    public void AcceptVisit(decimal candidateId)
    {
        using var site = new EmployeeDbContext();
        var dept = site.departments.Find(candidateId);
        if(dept is null)
        {
            dept = new Department { Id = candidateId };
            site.departments.Add(dept);
        }
        dept.det.Add(new Employee());
        site.SaveChanges();
    }
}