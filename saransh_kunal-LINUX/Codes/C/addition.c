#include <stdio.h>

int main()
{

	int a;
	int b;
	int result;
	
	printf("Enter the first number\n");
	scanf("%d",&a);
	printf("Enter the second number\n");
	scanf("%d",&b);

	result = a + b;
	printf("The addition of %d and %d is %d\n",a,b,result);
       	return 0;	
}
