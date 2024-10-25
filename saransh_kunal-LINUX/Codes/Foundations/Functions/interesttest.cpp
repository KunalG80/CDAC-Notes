#include "interst.h"
#include <cstdio>


int main(void)
{
	
	long p;
	long r;
	long t ;

	printf("Enter the valid values\n");
	scanf("%ld%ld%ld",&p,&r,&t);

	try
	{
		printf("Here your SIMPLE INTEREST %ld\n",  GetInterest(p,r,t));
	}

	catch(long err)
	{
		printf("Invalid principle amount : %ld\n",err);
	}
}

