#include <stdio.h>

#include <math.h>

int main()
{

        double principle;
        float rate;
        short int period;
        double Sinterest;
	double Cinterest;
	double amount;

        printf("Enter the principle amount \n");
        scanf("%lf",&principle);
        printf("Enter the rate\n");
        scanf("%f",&rate);
        printf("Enter the period\n");
        scanf("%hd",&period);

        Sinterest = (principle * rate * period)/100;
	
	amount = principle * pow((1+rate)/100,period);

	Cinterest = amount - principle;
	
        printf("The simple interest is %lf\n",Sinterest);
	printf("The compund interest is %lf\n",Cinterest);
	
	return 0;

}
