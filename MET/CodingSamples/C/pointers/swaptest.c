#include <stdio.h>

void Swap(int* p, int* q)
{
   int temp;
   temp = *p;
   *p = *q;
   *q = temp;
   printf("In Function Swap values are %d/%d\n", *p, *q);
}

int main()
{
   int first, second;
   first = 100;
   second = 200;
   printf("Before Swapping values are %d/%d\n", first, second);
   Swap(&first, &second);
   printf("After Swapping values are %d/%d\n", first, second);
   return 0;
}
