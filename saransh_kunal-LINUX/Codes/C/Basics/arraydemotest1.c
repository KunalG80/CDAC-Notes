#include <stdio.h>
int main()
{
   int subjects[4]; // Array Declaration => 4 values of int type, contiguous memory
   int subjects2[] = {44, 55, 66};
   
   subjects[0] = 66;
   subjects[1] = 77;
   subjects[2] = 55;
   subjects[3] = 44;

   printf("Displaying subject marks of student\n"); 
   for(int count = 0; count < 4; count++)
   {
  	printf("Subject no:%d marks is %d\n", count + 1, subjects[count]); //index 0 to 3 
   }


   return 0;
}
