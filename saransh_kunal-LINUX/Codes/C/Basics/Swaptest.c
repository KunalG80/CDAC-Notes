#include <stdio.h>

void Swap(int a, int b)
{
   int temp;
   temp = a;
   a = b;
   b = temp;
   printf("In Function Swap values are %d/%d\n", a, b);
}

int main()
{
   int first, second;
   first = 100;
   second = 200;
   printf("Before Swapping values are %d/%d\n", first, second);
   Swap(first, second);
   printf("After Swapping values are %d/%d\n", first, second);
   return 0;
}
