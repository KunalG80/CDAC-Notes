#include <stdio.h>

struct student
{
	int RollNo;
	int age;
	double fees;
	float percentage;
};

typedef struct student stud;

void PrintStudentData(const stud*);
void WriteStudentData(stud*);

void WriteStudentData(stud* s1)
{
	printf("insert Student data (Roll No, Age, Fees, Percentage)\n");
	scanf("%d %d %lf %f",&(*s1).RollNo,&(*s1).age,&(*s1).fees,&(*s1).percentage);
	printf("student data updated\n");
}

void PrintStudentData(const stud* s1)
{
      printf("==========Presenting student data=======================\n");
      printf("RollNo : %d\n", s1->RollNo);
      printf("Age : %d\n",s1->age);
      printf("Fees : %lf\n",s1->fees);
      printf("Percentage : %f\n",s1->percentage);
}

int main()
{
	struct student s1;
	
	WriteStudentData(&s1);
	PrintStudentData(&s1);
	
	return 0;
}

