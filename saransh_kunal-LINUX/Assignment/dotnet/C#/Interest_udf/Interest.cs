using System;

//Interest is a user-defined value type
struct Interest
{
    //instance fields
    private double principle;
    private float rate;
    private int period;

    //constructor
    
    public Interest(double principle, float rate, int period)
    {
        this.principle = principle;
        this.rate = rate;
        this.period = period;
    }

    public double SInterest()
    {
        double interest = (principle * rate * period) /100;
        return interest;
    }
}