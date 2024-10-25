# include <stdio.h>

int main()
{
	int num;
	int count;

	printf("enter the number for multiplication table\n");
	scanf("%d",&num);

	printf("Multiplication table of: %d \n",num);
	
	printf("===================================\n");

	for (count=1;count<=10;count++)
	{
		printf("%d * %d = %d \n", num, count, num * count);
	}
	
	return 0;
}
