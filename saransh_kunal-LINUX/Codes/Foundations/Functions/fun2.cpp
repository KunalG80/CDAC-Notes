#include "fun4.h"
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

