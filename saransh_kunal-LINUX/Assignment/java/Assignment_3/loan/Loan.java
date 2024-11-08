package loan;
// import java.util.List;

public abstract class Loan{
    public double principle;
    public double period;


    public Loan(double p, double n){
        principle = p;
        period  = n;
    }
    public void SetPrinciple(double p){
        principle = p;
    }

    public double GetPrinciple() {
        return principle;
    }

    public void SetPeriod(double n){
            period = n;
    }

    public double GetPeriod() {
        return period;
    }

    public abstract double GetInterestRate();

    public double GetEMI(){
        double p = principle;
        double r = GetInterestRate()/(12*100);
        double n = period * 12;
        double EMI;
        EMI = (p * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
        return EMI;
    }

}