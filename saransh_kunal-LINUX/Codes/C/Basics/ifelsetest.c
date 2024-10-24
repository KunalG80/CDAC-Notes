#include <stdio.h>

int main()
{
   float percentage;

   printf("Enter the percentage\n");
   scanf("%f", &percentage);

   if (percentage >= 75)
	printf("Distinction\n");
   else if (percentage >= 60)
	   printf("First Class \n");
   else if (percentage >= 40)
	   printf("Second class\n");
   else 
	printf("Failed Try again\n"); 
   return 0;

}
