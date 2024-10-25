#include<stdio.h>

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
}
