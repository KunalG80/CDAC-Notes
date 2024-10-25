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
	int i;
	student* p[i];
		
	for (i=0;i<3;i++)
	{
		p = malloc(sizeof(student));
		p->Rollno = 102;
		p->age = 23;
		p->fees = 59000;
		p->percentage = 56.99;
	};
	
	for (i=0;i<3;i++)
	{
		printf("Displaying Student Rollno %d Age %d\n",p->Rollno,p->age);
	};

	free(p);

	return 0;
}
