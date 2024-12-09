using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Company.Data;

[Table("DEPARTMENT")]
public class Department
{
    [Column("deptno")]
    public decimal Id { get; set;}

    [Column("dname")]
    public string DeptName { get; set;}

    [Column("loc")]
    public string Location {get; set;}

    //public List<Employee> EMPS {get; set;} 
}