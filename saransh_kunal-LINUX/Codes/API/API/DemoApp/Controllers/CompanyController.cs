using Microsoft.AspNetCore.Mvc;
using Company.Data;
using Company.Models;

namespace DemoApp.Controllers;

[ApiController]
public class CompanyController : ControllerBase
{
    [HttpGet("/api/home")]
    public IActionResult ReadCandidates(CompanyModel model)
    {
        var candidate = model.GetCandidates();
        if(candidate.Any())
            return Ok(candidate);
        return NotFound();
    }

     [HttpGet("/api/home/dept")]
    public IActionResult ReadDepartments(CompanyModel model)
    {
        var depart = model.GetDepartments();
        if(depart.Any())
            return Ok(depart);
        return NotFound();
    }

    [HttpPost("/api/home/emp/add")]
    public IActionResult WriteCandidate(Employee input, CompanyModel model)
    {
        model.AcceptCandidate(input.Id,input.Name,input.Job,input.Salary,input.DepartmentId);
        return Ok();
    }

    [HttpPost("/api/home/dept/add")]
    public IActionResult WriteDepartment(Department input, CompanyModel model)
    {
        model.AcceptDepartment(input.Id,input.DeptName,input.Location);
        return Ok();
    }
}