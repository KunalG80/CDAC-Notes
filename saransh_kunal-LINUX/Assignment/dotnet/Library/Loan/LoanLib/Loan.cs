namespace Loaning;

public abstract class Loan{
    public double principle {get; set;}
    public float period {get; set;}
    public abstract float Rate (double amount);
    public abstract double EMI();
}
