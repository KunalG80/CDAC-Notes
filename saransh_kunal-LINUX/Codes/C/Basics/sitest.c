#include <stdio.h>
#include <math.h>
int main()
{
   double principle;
   float rate;
   short int period;
   double interest;
   double amount = 0;
   double cinterest = 0;

   printf("Enter Principle\n");
   scanf("%lf",&principle);
   printf("Enter Rate / Period\n");
   scanf("%f %hd", &rate, &period);

   interest = (principle * rate * period ) / 100;
   amount = principle * pow((1 + rate/100), period);
   cinterest = amount - principle;
   printf("Calculated Interest is %lf\n", interest);
   printf("Calculated Compound Interest is %lf\n", cinterest);

}
