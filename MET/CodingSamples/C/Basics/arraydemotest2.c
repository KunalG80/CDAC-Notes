#include <stdio.h>
double GetPercentage(int[], int);
double GetSimpleInterest(double, float, short int);
int IsPassed(int[], int);


double GetPercentage(int sub[],int size)
{
  double total = 0;
  for(int count = 0; count < size; count++)
  {
     total = total + sub[count];
  }
  return total / 4;
}

int IsPassed(int sub[], int size)
{
	if ((sub[0] >= 40) && (sub[1] >= 40) && (sub[2] >= 40) && (sub[3] >= 40))
	   return 1;
	else
	   return 0;
}

int main()
{
   int subjects[4]; // Array Declaration => 4 values of int type, contiguous memory
   
   printf("Initialising Subjects data\n");

   for(int count1 = 0; count1 < 4; count1++)
   {
  	printf("Enter data for Subject no:%d\n", count1 + 1); //index 0 to 3 
	scanf("%d" , &subjects[count1]);
   }

   printf("Displaying subject marks of student\n"); 
   for(int count = 0; count <= 4; count++)
   {
  	printf("Subject no:%d marks is %d\n", count + 1, subjects[count]); //index 0 to 3 
   }

   if (IsPassed(subjects, 4))
      printf("Student Passed with %lf percentage\n", GetPercentage(subjects, 4));
   else
      printf("Student has failed\n");

   return 0;
}
