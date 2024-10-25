#include <stdio.h>

#include <math.h>

double GetSimpleInterest(double,float,short int);
double GetSimpleInterest(double p, float r, short int t)
{
	double si;
	si = (p * r * t)/100;
	return si;
}

double GetCompoundInterest(double,float,short int);
double GetCompoundInterest(double p, float r, short int t)
{
	double a;
	double ci;
	a = p * pow((1+r)/100,t);
	ci= a - p;
	return ci;
}

int main()
{
	
	double principle;
	float rate;
	short int period;
	double Sinterest;
	double Cinterest;

	printf(" Enter the principle amount\n");
	scanf("%lf", &principle);
	printf(" Enter the rate\n");
	scanf("%f",&rate);
	printf(" Enter the period\n");
	scanf("%hd",&period);

	Sinterest = GetSimpleInterest(principle,rate,period);
	printf(" the simple interest is %lf\n",Sinterest);
	
	Cinterest = GetCompoundInterest(principle,rate,period);
	printf(" the compound interest is %lf\n",Cinterest);

	return 0;

}
