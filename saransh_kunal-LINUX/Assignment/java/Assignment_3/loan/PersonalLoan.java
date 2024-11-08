package loan;

public final class PersonalLoan extends Loan implements Taxable {

    public PersonalLoan(double p, double n){
        super(p, n);
    }

    @Override
    public double GetTax() {
        return 0.10;
    }

    @Override
    public double GetInterestRate() {
        return principle<=5000000 ? 15:16;
    }
}
