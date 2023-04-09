#include <stdio.h>
//working
void Q2(int num)
{
	int evenSum = 0, oddSum = 0;
	while(num != 0)
	{
		if((num % 10) % 2)
		{
			oddSum++;
		}
		else
		{
			evenSum++;
		}
		num /= 10;
	}
	if(evenSum > oddSum)
	{
		printf("bigger");
	}
	if(evenSum < oddSum)
	{
		printf("smaller");
	}
	if(evenSum == oddSum)
	{
		printf("equals");
	}
}

void main()
{
	int num;
	printf("enter num:");
	scanf("%d", &num);
	Q2(num);
}
