#include <stdio.h>

double GetSimpleInterest(double, float, short int);
//Implementation of Function 
double GetSimpleInterest(double p, float r, short int n)
{
	double i = 0;
	i = ( p * r * n) / 100;
	return i;
}

int main()
{
   double principle;
   float rate;
   short int period;
   double interest;

   printf("Enter Principle\n");
   scanf("%lf",&principle);
   printf("Enter Rate / Period\n");
   scanf("%f %hd", &rate, &period);
   //function call is happening
   interest = GetSimpleInterest(principle, rate, period);

   printf("Calculated Interest is %lf\n", interest);

}
