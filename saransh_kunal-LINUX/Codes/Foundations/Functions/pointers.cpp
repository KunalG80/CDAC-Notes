#include <cstdio>

long Average(long first , long second, long* deviation)
{
	*deviation = first>second ? (first-second)/2 : (second-first)/2;
	return (first + second)/2;
	
}

int main(void)
{
	long x,y;
	long d;

	printf("Enter the first values\n");
	scanf("%ld %ld",&x,&y);

	printf("here are the average %ld \n",Average(x,y,&d));
	printf("here are the deviation %ld\n",d);

}

