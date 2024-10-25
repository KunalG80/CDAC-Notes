#include <stdio.h>

void main()
{

	int principle;
	int rate;
	int period;
	int interest;

	printf("Enter the principle amount \n");
	scanf("%d",&principle);
	printf("Enter the rate\n");
	scanf("%d",&rate);
	printf("Enter the period\n");
	scanf("%d",&period);

	interest = (principle * rate * period)/100;

	printf("Thw simple interest is %d\n",interest);

}
