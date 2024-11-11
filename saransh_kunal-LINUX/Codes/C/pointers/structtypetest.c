#include <stdio.h>
//Student is new user defined type
//Struct data type with a name Student
//It is not a variable
struct Student
{
   int Rollno;
   int age;
   double fees;
   float percentage;
};

typedef struct Student stud;

//void PrintStudentData(struct Student);
void PrintStudentData(const stud*);
void WriteStudentData(stud*);

void WriteStudentData(stud* s1)
{
   printf("Input student data (rollno/age/fees/percentage\n");
   //scanf("%d %d %lf %f", &s1->Rollno, &s1->age, &s1->fees, &s1->percentage);
   scanf("%d %d %lf %f", &(*s1).Rollno, &(*s1).age, &(*s1).fees, &(*s1).percentage);
   printf("Student Data updated\n");
}
//implementation
void PrintStudentData(const stud* s1)
{
  printf("Printing Student Data\n");
  printf("=====================\n");
  printf("Rollno : %d\n", s1->Rollno);
  printf("Age : %d\n", s1->age);
  printf("Fees : %lf\n", s1->fees);
  printf("Percentage : %f\n", s1->percentage);
  //s1->fees = 10000; //not allowed as s1 is pointer to constant 

}
//
int main()
{
  //variable s1 of struct type Student
  
  struct Student s1;
  WriteStudentData(&s1);

  PrintStudentData(&s1);
  return 0;
}
