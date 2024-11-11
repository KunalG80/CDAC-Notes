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
  stud students[3];
  
  for(int i=0; i < 3; i++)
  {
	printf("Enter Student data (Rollno/age/fees/percentage)\n");
	scanf("%d %d %lf %f", &students[i].Rollno, &students[i].age, &students[i].fees, &students[i].percentage);
  }


  for(int i=0; i < 3; i++)
  {
  	PrintStudentData(students[i]);
  }
  return 0;
}
