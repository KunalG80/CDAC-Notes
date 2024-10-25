#include <stdio.h>

int main()
{
	int num1;
	int num=100;
	
	num1 = num + 10;
	printf("%d\n",num1);

	int* p = &num1;
	
	*p = *p + 10;
	printf("%d\n",*p);

	return 0;
}

