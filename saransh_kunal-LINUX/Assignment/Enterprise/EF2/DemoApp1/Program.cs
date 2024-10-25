using Microsoft.EntityFrameworkCore;
using Shopping.Data;

using var dept = new EmployeeDbContext();
if(args.Length == 0)
{
    foreach(var E in dept.departments)
        Console.WriteLine("{0, -8}{1, 16:0.00}{2}", E.Id, E.dname, E.loc);
}
else
{
    var emp = dept.departments
        .Where(c => c.Id == Convert.ToDecimal(args[0]))
        .Include(c => c.det) 
        .FirstOrDefault();
    if(emp != null)
    {
        foreach(var entry in emp.det)
            Console.WriteLine("{0, -6}{1, 8}{2, 10}", entry.Id, entry.name, entry.job);
    }
}