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
	int a;
	printf("Enter the numbers of student data:\n");
	scanf("%d",&a);
	
	stud student[a];

	for (int i=0; i<a; i++)
	{
		printf("Enter Student Data (Roll No / Age / Fees / Percentage\n");
		scanf("%d %d %lf %f", &student[i].RollNo, &student[i].age, &student[i].fees,&student[i].percentage);
	}

	for (int i=0; i<a; i++)
	{
		PrintStudentData(student[i]);
	}

	return 0;

}

