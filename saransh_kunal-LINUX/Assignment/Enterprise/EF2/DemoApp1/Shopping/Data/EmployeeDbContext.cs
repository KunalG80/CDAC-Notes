using Microsoft.EntityFrameworkCore;

namespace Shopping.Data;

public class EmployeeDbContext : DbContext
{
    public DbSet<Department> departments { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        optionsBuilder.UseSqlServer("Data Source=iitdac.met.edu;Database=Shop4;User Id=dac4;Password=Dac4@1234;Encrypt=False");
    }
}
