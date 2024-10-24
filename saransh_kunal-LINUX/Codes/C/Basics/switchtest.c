#include <stdio.h>

int main()
{  
    char grade;
    printf("Enter the valid Grade (A/B/C/D) \n");
    scanf("%c", &grade);

    switch (grade)
    {
	case 'A':
		printf("Distinction\n");
		break;
	case 'B':
		printf("First Class\n");
		break;
	case 'C':
		printf("Second Class\n");
		break;
	case 'D':
		printf("Pass Class\n");
		break;
	default :
		printf("Failed -- Try Again\n");
    }

}
