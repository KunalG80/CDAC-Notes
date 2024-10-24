using DemoApp.Endpoints;
using DemoApp.Services;

var builder = WebApplication.CreateBuilder(args);
builder.Services.AddSingleton<IIntrest, SimpleIntrest>();
// builder.Services.AddSingleton<IIntrest, CoumpondIntrest>();
var app = builder.Build();
app.Map("/Home", Greeting.Welcome);
app.Run();
