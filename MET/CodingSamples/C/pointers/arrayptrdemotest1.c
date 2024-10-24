#include <stdio.h>

int main()
{
  int marks[4] = {100, 200, 300, 400};
  int* p = marks;
  p++;
  p = p + 2;

  printf("Value is %d\n", *p);



  //marks++;  marks = marks + 1 

  for(int i = 0; i < 4; i++)
  {
      //printf("Element at index %d is %d\n", i, marks[i]);
   //:w    printf("Element at index %p is %d\n", p, *(p++));
  }


  return 0;

}
