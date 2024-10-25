#include <cstdio>

int SumOfAll(int lower, int higher, int (*check)(int))
{
	int total = 0;
	for(int i = lower; i <= higher; ++i)
	{
		if (check(i))
			total = total + i;
	}
	return total;
}	

int EvenCheck(int n)
{
	return ((n%2)==0) ? 1 : 0;
}

int OddCheck(int n)
{
	return ((n!=2)==0) ? 1 : 0;
}

int main()
{
	int lower,higher;
	printf("Enter the lower / higher number: \n");
	scanf("%d %d",&lower,&higher);

	printf("Sum of all even numbers: %d\n", SumOfAll(lower,higher,&EvenCheck));
	printf("Sum of all odd numbers: %d\n",SumOfAll(lower,higher,&OddCheck));
}
