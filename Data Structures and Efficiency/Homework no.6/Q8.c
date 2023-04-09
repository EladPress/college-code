#include <stdio.h>

void Q8(int num, char c1, char c2)
{
	if(num == 1)
	    printf("%c%c%c", c1, c2, c2);
	   
	else
	{
		printf("%c", c1);
		Q8(num - 1, c1, c2);
		printf("%c%c", c2, c2);
	}
}

void main()
{
	printf("enter a number, and two characters:");
	int num;
	char c1, c2;
	scanf("%d %c %c", &num, &c1, &c2);
	Q8(num, c1, c2);
}


