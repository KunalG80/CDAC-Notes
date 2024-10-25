#include "fun4.h"
#include <cstdio>

int main()
{
	int lower,higher;
	printf("Enter the lower / higher number: \n");
	scanf("%d %d",&lower,&higher);

	printf("Sum of all even numbers: %d\n", SumOfAll(lower,higher,&EvenCheck));
	printf("Sum of all odd numbers: %d\n",SumOfAll(lower,higher,&OddCheck));
}
