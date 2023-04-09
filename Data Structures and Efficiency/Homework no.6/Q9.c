#include <stdio.h>

void Q9a(int num)
{
	if(num != 0)
	{
		Q9a(num / 10);
		if((num % 10) != 0)
		{
			printf("%d", (num % 10) - 1);
		}
		else
		{
			printf("%d", 9);
		}
	}
}

void Q9b(int num)
{
	if(num != 0)
	{
		Q9b(num / 10);
		printf("%d", (num + 1) % 10);
	}
}

void main()
{
	printf("enter a number for Q8a:");
	int num;
	scanf("%d", &num);
	Q9a(num);
	printf("\n");
	Q9b(num);
}
