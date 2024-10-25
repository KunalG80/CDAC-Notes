#include <stdio.h>

struct student
{
	int RollNo;
	int age;
	double fees;
	float percentage;
};

typedef struct student stud;

void PrintStudentData(stud);

void PrintStudentData(stud s1)
{

      printf("==========Presenting student data=======================\n");
      printf("RollNo : %d\n", s1.RollNo);
      printf("Age : %d\n",s1.age);
      printf("Fees : %lf\n",s1.fees);
      printf("Percentage : %f\n",s1.percentage);
}

int main()
{
	struct student s1;
	struct student s2 = {102,24,30000,65.70};

	s1.RollNo=101;
	s1.age=23;
	s1.fees=25000;
	s1.percentage=57;

	//printf("==========Presenting student data=======================\n");
	//printf("RollNo : %d\n", s1.RollNo);
	//printf("Age : %d\n",s1.age);
	//printf("Fees : %lf\n",s1.fees);
	//printf("Percentage : %f\n",s1.percentage);

	//printf("==========Presenting student data=======================\n");
        //printf("RollNo : %d\n", s2.RollNo);
        //printf("Age : %d\n",s2.age);
        //printf("Fees : %lf\n",s2.fees);
        //printf("Percentage : %f\n",s2.percentage);
	
	PrintStudentData(s1);
	PrintStudentData(s2);

	return 0;
}

