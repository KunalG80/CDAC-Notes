using System.ComponentModel.DataAnnotations.Schema;

namespace Shopping.Data;

[Table("DepartmentDetails")]
public class Department
{
    [Column("deptno")]
    public decimal Id { get; set; }

    public string dname { get; set; }

    public string loc { get; set; }

    
    public List<Employee> det { get; set; }

}