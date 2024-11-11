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
  student* p[3];  
  
  for(int i = 0; i < 3; i++)
  {
    p[i] = malloc(sizeof(student));
    p[i]->Rollno = 102;
    p[i]->age = 23;
    p[i]->fees = 55000;
    p[i]->percentage = 66.66;
  }

  for(int i = 0; i < 3; i++)
  {
    printf("Displaying Student Rollno %d Age %d\n", p[i]->Rollno, p[i]->age);
  }

  free(p[0]);
  free(p[1]);
  free(p[2]);
  return 0;
}
