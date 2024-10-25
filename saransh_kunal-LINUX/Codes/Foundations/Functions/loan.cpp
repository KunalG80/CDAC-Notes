#include <cstdio>
#include <cmath>

double HomeLoan(double p, short t)
{
	float rate;
    	rate = p<6000000 ? 16.0:15.0;
	return rate;
}

double EducationLoan(double p, short t)
{
	float rate;
        rate = p<4000000 ? 12.0:14.0;
	return rate;
}

double CarLoan(double p, short t)
{
	float rate;
        rate = t<30 ? 13.0:13.5;
        return rate;	
}

double EMI(double p, short t, double (*loan)(double,short))
{
	double emi=0;
	double r = loan(p,t);
	emi = (p* r * pow(1 + r, t)) / (pow(1 + r, t) - 1);
	return emi;

}

int main(void)
{	
	double principle;
	short period;

	printf("Enter the Values: (Principal,Time) ");
	scanf("%lf%hd", &principle, &period);
	
	printf("Total Home Loan EMI per month: %.2f\n", EMI(principle,period,&HomeLoan));
	printf("Total Education Loan EMI per month: %.2f\n", EMI(principle,period,&EducationLoan));
	printf("Total Car Loan EMI per month: %.2f\n", EMI(principle,period,&CarLoan));
}
