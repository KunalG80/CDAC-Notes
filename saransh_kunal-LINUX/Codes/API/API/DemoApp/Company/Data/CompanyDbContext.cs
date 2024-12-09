using Microsoft.EntityFrameworkCore;

namespace Company.Data;

public class CompanyDbContext : DbContext
{
    public DbSet<Department> Departments { get; set;}

    public DbSet<Employee> Employees { get; set;}

    // public CompanyDbContext()
    // {
    //     Database.EnsureCreated();
    // }
    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        optionsBuilder.UseSqlServer("Data Source=iitdac.met.edu;Database=Shop10; User Id=dac10; Password = Dac10@1234; Encrypt=False");
    }
}