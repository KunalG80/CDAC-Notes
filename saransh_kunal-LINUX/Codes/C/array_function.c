#include<stdio.h>

double GetPercentage(int[],int);
double GetPercentage(int sub[], int size)
{
	double total;
	for (int count=0;count < size;count++)
	{
		total=total+sub[count];
	}
	return total/4;

}

int IsPass(int[],int);
int IsPass(int sub[],int size)
{

	if((sub[0]>=40)&&(sub[1]>=40)&&(sub[2]>=40)&&(sub[3]>=40))
		return 1;
	else
		return 0;
	
}



int main()
{

	int sub[4];

	printf("intialize the sub data\n");

	for(int i =0;i<4;i++){
		printf("enter the subject no:%d\n",i+1);
		scanf("%d",&sub[i]);
	}

	printf("displaying=========\n");

     	for(int u =0;u<4;u++){
        	printf("subject no: %d and marks is %d\n",u+1,sub[u]);
        
   	}


	if (IsPass(sub,4))
		printf("student has passed with %lf percentage\n", GetPercentage(sub,4));
	else
		printf("duck duck duck!!! Try Next Time\n");

	return 0;

}
