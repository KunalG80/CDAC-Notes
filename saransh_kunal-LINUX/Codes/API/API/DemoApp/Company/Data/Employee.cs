using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Company.Data;

[Table("EMPLOYEE")]
public class Employee
{

    [Column("empno")]
    public decimal Id { get; set;}

    [Column("ename")]
    public string Name { get; set;}

    [Column("job")]
    public string Job { get; set;}

    [Column("sal")]
    public decimal Salary {get; set;}

    [Column("deptno")]
    public decimal DepartmentId { get; set;}

    //public Department Dept { get; set;}
}