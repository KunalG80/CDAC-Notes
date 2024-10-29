using Microsoft.AspNetCore.Mvc;
using Tourism.Models;

namespace DemoApp.Controllers;

public class HomeController(SiteModel model) : Controller
{
    public IActionResult Index()
    {
        var candidates = model.GetCandidate();
        return View(candidates); //renders ~/Views/{current-controller-name}/{current-method-name}.cshtml
    }

    public IActionResult Register()
    {
        return View();
    }

    [HttpPost]
    public IActionResult Register(decimal empid , string empname , string empjob ,decimal empdeptid)
    {
        model.AddEmployee(empid,empname,empjob,empdeptid);
        return RedirectToAction("Index");
    }
}