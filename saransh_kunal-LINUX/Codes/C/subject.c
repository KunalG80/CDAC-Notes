#include <stdio.h>
int main()
{

	short int math;
	short int physics;
	short int science;
	short int english;
	float percentage;

	printf(" Enter the marks for subject math, physics, science, english\n");
	scanf("%hd %hd %hd %hd",&math,&physics,&science,&english);

	if (math>40 && physics>40 && science>40 && english>40)
		printf(" PASSED\n ");
	else
		printf("DUCK....DUCK....DUCK! Try in Next Life\n");
	
	return 0;

}


