namespace DemoApp.Services;

public class SimpleIntrest: IIntrest
{

    public double Intrest(double p , double t , double r)
    {
        return p * t * r/100;
    }
}