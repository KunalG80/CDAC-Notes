using DemoApp.Endpoints;

var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();
app.MapGet("/Home", Greeting.Welcome);
app.MapPost("/intrest", Greeting.Hello);
app.Run();
