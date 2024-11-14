package app.components;

public class CalInterestBean {
    
    private double principle;

    private double rate;

    private double period;

    public double getPrinciple() {
        return principle;
    }

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getPeriod() {
        return period;
    }

    public void setPeriod(double period) {
        this.period = period;
    }

    public double getIntrest(){
        return (principle * period * rate)/100;
    }
}