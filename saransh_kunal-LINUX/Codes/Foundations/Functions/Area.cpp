#include <cstdio>
#include <cmath>

long Area(long length , long breath , long* perimeter, long* digonal)
{
	*perimeter = 2 * (length + breath);

	*digonal = sqrt(length*length+breath*breath);

	return length * breath;

}

int main(void)

{
	long x , y;
	long p;
	long d;

	printf("enter the valid value (length,breath) \n");
	scanf("%ld %ld",&x,&y);

	printf("here are the area %ld\n",Area(x,y,&p,&d));
	printf("here are the perimeter %ld\n",p);

	printf("here are the digonal %ld\n",d);

}


