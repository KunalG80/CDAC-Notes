package loan;

public final class HomeLoan extends Loan implements Discountable {
    public HomeLoan(double p, double n){
        super(p, n);
    }

    @Override
    public double GetDiscount() {
        return 0.05;
    }

    @Override
    public double GetInterestRate() {
        return principle <= 2000000 ? 10 : 11;
    }
}
