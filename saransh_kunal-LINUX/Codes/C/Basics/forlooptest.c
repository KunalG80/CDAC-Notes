#include <stdio.h>

int main()
{
  int num;
  int count;

  printf("Enter the number for Multiplication Table\n");
  scanf("%d", &num);

  printf("Multiplication Table of : %d\n", num);
  printf("===============================\n");
  //  initialisation , checking final condition, incrementing loop variable
  for(count = 1; count <= 10; count++)
  {
     printf("%d * %d = %d\n", num, count, num * count);
  }
  
  return 0;

}
