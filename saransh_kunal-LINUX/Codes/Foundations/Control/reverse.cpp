#include <cstdio>

int reverse_number(int num)
{
	int rev=0;

	while (num>0)
	{
		int n = num%10;
		rev = (rev *10) + n;
		num = num/10;
	}
	return rev;
}
int main (void)
{

	int p;
	printf("Positive Integer: ");
	scanf("%d",&p);

	printf("%d\n",reverse_number(p));
}
