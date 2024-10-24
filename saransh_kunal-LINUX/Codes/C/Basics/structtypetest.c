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


typedef unsigned short int tinyint;

tinyint z;
//Declaration
//void PrintStudentData(struct Student);
void PrintStudentData(stud);

//implementation
void PrintStudentData(stud s1)
{
  printf("Printing Student Data\n");
  printf("=====================\n");
  printf("Rollno : %d\n", s1.Rollno);
  printf("Age : %d\n", s1.age);
  printf("Fees : %lf\n", s1.fees);
  printf("Percentage : %f\n", s1.percentage);

}
//
int main()
{
  int x;     //x is of integer type
  int y[5];  //y is integer array type
  //variable s1 of struct type Student
  
  struct Student s1;
  struct Student s2 = {102, 24, 30000, 65.70};

  stud students[5];


  // scanf("%d", &s1.Rollno);
  s1.Rollno = 101;
  s1.age = 23;
  s1.fees = 25000;
  s1.percentage = 56.89;
  PrintStudentData(s1);
  PrintStudentData(s2);
  return 0;
}
