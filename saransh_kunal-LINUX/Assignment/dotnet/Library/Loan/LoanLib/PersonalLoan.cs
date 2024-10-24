namespace Loaning;

sealed class PersonalLoan : Loan
{
    public override float Rate(double amount)
    {
        return principle <= 500000 ? 0.15f:0.16f ;
    }

    public override double EMI()
    {
        return principle*(1+ Rate(principle) * period/100) / (12*period);
        //emi = p * (1 + r * n / 100) / (12 * n)
    }

    public double GetTax()
    {
        return principle > 100000 ? 0.1 - (100000 - principle) : 0;
    }

    public double GetTotalTax()
    {
        return 0.0;    
    }
};
