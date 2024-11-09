import java.util.ArrayList;
import java.util.List;
import java.lang.Throwable;

import loan.Loaner;
import loan.Loan;
import loan.HomeLoan;
import loan.Discountable;
import loan.PersonalLoan;
import loan.Taxable;


public class Main {

    public static double getTotalDiscount(Loan... loan) throws Throwable {
        double totaldiscount = 0;
        for (Loan loans : loan) {
            if (loans instanceof Discountable d) {
                totaldiscount = totaldiscount + (Loaner.getEMI(loans) * (1 - d.GetDiscount()))/12;
            }
        }
        return totaldiscount;
    }

    public static double getTotalTax(Loan... loans) throws Throwable {
        double totalTax = 0;
        for (Loan loan : loans) {
            if (loan instanceof Taxable t) {
                totalTax = totalTax + (Loaner.getEMI(loan) * t.GetTax())/12;
            }
        }
        return totalTax;
    }
    public static void main(String[] args) throws Throwable {

        PersonalLoan personalLoan = new PersonalLoan(400000, 5);
        // personalLoan.SetPrinciple(400000);
        // personalLoan.SetPeriod(5);

        HomeLoan homeLoan = new HomeLoan(2500000, 10);
        // homeLoan.SetPrinciple(2500000);
        // homeLoan.SetPeriod(10);

        List<Loan> loans = new ArrayList<>();
        loans.add(personalLoan);
        loans.add(homeLoan);

        System.out.printf("Personal Loan Emi is : %.2f\n", Loaner.getEMI(personalLoan));
        System.out.printf("HomeLoan Loan Emi is : %.2f\n", Loaner.getEMI(homeLoan));
    
        System.out.printf("Total Tax applied is : %.2f\n",getTotalTax(personalLoan));
        System.out.printf("Total Discount given is : %.2f\n",getTotalDiscount(homeLoan));
    
    }
}
