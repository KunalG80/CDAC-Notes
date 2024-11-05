using Microsoft.AspNetCore.Mvc;
using Shopping.Data;
using Tourism.Models;

namespace DemoApp.Controllers;

public class HomeController() : ControllerBase
{
    [HttpGet("/api/site")]
    public IActionResult ReadEmployee(SiteModel model)
    {
        var candidates = model.GetCandidate();
        if(candidates.Any())
           return Ok(candidates);
        return NotFound();
    }
  [HttpGet("/api/white")]
    public IActionResult ReadDepartment(SiteModel model)
    {
        var candidates1 = model.GetCandidate();
        if(candidates1.Any())
           return Ok(candidates1);
        return NotFound();
    }



    [HttpPost("/api/site/")]
    public IActionResult WriteCandidate(Employee input,SiteModel model)
    {
        model.AddEmployee(input.Id,input.name,input.job,input.DepartmentId);
        return Ok();
    }
     [HttpPost("/api/white")]
    public IActionResult WriteCandidate1(Department input,SiteModel model)
    {
        model.AddDepartment(input.Id,input.dname,input.loc);
        return Ok();
    }
}