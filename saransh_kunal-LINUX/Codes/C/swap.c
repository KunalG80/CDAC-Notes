#include <stdio.h>

void swap(int* a, int* b)
{
	int temp;
	temp = *a;
	*a = *b;
	*b = temp;
}

int main()
{
	int first = 100;
	int second = 200;
	
	printf("Original values are %d and %d\n",first,second);

	swap(&first,&second);
	
	printf("Swapped values are %d and %d\n",first,second);

	return 0;
}
