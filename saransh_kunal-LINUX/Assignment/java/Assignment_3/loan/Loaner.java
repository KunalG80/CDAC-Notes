//Factory class

package loan;

public class Loaner {
        public static Loan Ploan(double p, double n){
            var l = new PersonalLoan(p, n);
            l.SetPrinciple(p);
            l.SetPeriod(n);
            return l;
        } 
    
        public static Loan Hloan(double p, double n){
            var l = new HomeLoan(p,n);
            l.SetPrinciple(p);
            l.SetPeriod(n);
            return l;
        } 
    
        public static double getEMI(Loan L) throws Throwable{
            if(L instanceof HomeLoan || L instanceof PersonalLoan){
                return L.GetPrinciple() * (1 + L.GetInterestRate() * L.GetPeriod()/100) / (12 * L.GetPeriod());
            // }else if(L instanceof PersonalLoan){
            //     return L.GetPrinciple() * (1 + L.GetInterestRate() * L.GetPeriod()/100) / (12 * L.GetPeriod());
            }else{
                throw new Exception();
            }
    }
}
