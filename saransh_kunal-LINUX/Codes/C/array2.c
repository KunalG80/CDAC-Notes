#include<stdio.h>

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
		printf("yeaahhhhhhhhhh\n");
	else
		printf("duck duck duck\n");
	
	return 0;

}
