#include <stdio.h>

int main()
{
   float percentage;
   printf("Enter the percentage of marks\n");
   scanf("%f", &percentage);

   printf("====Displaying Result ====\n");
   if (percentage > 40)
	   printf("Passed\n");
   else 
	   printf("Failed\n");
   printf("Value = %d\n", (percentage > 40));
   return 0;
}
