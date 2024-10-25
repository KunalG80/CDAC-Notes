#include<stdio.h>

struct Employee
{
	 int empid;
	char ename[40];
	double sal;
	double comm;
	int age;
	int deptno;
};


//GetAnnualSal(double)
//GetAnnualSal()
//{
//	int annsal;
//	annsal = sal*12;
//	return annsal;
//}

//GetTotalAnnualSal()
//{
//	int total;
//	for (int i;i<n;i++)
//		{
//			total = 



void PrintAllEmployeeData(struct Employee e2)
{
  printf("Printing Employee Data\n");
  printf("=====================\n");
  printf("Employee ID : %d\n", e2.empid);
  printf("Name : %s\n", e2.ename);
  printf("Salary : %lf\n", e2.sal);
  printf("Commission : %lf\n", e2.comm);
  printf("Age : %d\n", e2.age);
  printf("Department no. : %d\n", e2.deptno);
}

int main()
{

	struct Employee e1[1];

	char ch;
	printf("");
	
	for(int i=0;i<1;i++)
	{
		printf("Enter the Employees Details (empid, ename, sal, comm, age, deptno(10/20/30/40))\n");
		scanf("%d %s %lf %lf %d %d",&e1[i].empid,e1[i].ename,&e1[i].sal,&e1[i].comm,&e1[i].age,&e1[i].deptno);
	}

	for(int i=0; i<1; i++)
  	{
  		PrintEmployeeData(e1[i]);
  	}

  	return 0;
}
