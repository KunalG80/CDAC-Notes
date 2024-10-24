using Microsoft.Extensions.FileProviders.Physical;
namespace DemoApp.Services;

public class CoumpondIntrest : IIntrest
{

    public double Intrest(double p , double t , double r)
    {
        return (double)(p * ((Math.Pow((1 + r /100),t))));
         }
}