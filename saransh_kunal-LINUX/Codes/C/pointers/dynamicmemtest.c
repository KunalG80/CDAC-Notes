#include <stdio.h>
#include <malloc.h>
struct Student
{
   int Rollno;
   int age;
   double fees;
   float percentage;
};

typedef struct Student student;

int main()
{
  student s1 = {101, 22, 440000, 55.55};
  student* p = NULL;  
  
  p = malloc(sizeof(student));
  p->Rollno = 102;
  p->age = 23;
  p->fees = 55000;
  p->percentage = 66.66;
  printf("Displaying Student Rollno %d Age %d\n", p->Rollno, p->age);
  free(p);
  return 0;
}
