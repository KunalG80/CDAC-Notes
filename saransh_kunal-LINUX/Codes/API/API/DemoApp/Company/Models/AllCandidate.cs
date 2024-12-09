namespace Company.Models;

public readonly record struct AllCandidate(decimal Id, string EmpName, string Jobs, decimal Sal, decimal DeptId);

//public readonly record struct Dept(decimal DeptId, string DeptName,string Loc);