#include <stdio.h>

int main()
{
   int num1 = 100;
   // pointer variable stores address
   // address of some integer
   int* p = &num1 ;
   float* q; //address of some float value
   q = (float*) &num1;
   num1 = num1 + 10;
   printf("Value of num1 is %d\n", num1);

   *p = *p + 10;
   printf("Value of num1 is %d\n", num1);
   printf("Value at pointer p is %d\n", *p);


   return 0;

}
