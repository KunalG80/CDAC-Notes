#include <stdio.h>

int main()
{
  int num;
  int count = 1;

  printf("Enter the number for Multiplication Table\n");
  scanf("%d", &num);

  printf("Multiplication Table of : %d\n", num);
  printf("===============================\n");
  //  initialisation at the start
  //
  //  checking final condition
  
  do
  {
     printf("%d * %d = %d\n", num, count, num * count);
     count = count + 1;  // incrementing loop variable
  }
  while (count <= 10);
  
  return 0;

}
