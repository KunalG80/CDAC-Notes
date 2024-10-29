using System.ComponentModel.DataAnnotations.Schema;

namespace Shopping.Data;

[Table("EmployeDetails")]
public class Employee
{
    [Column("empno")]
    public decimal Id { get; set; }

    [Column("ename")]
    public string name { get; set; }

    public string job{get; set;}


    [Column("deptno")]
    public decimal DepartmentId{get; set;}

    
}
