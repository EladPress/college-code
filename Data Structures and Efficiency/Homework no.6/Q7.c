#include <stdio.h>
//working

void binary(int num)
{
	if(num / 2 == 0)
	   printf("%d", num % 2);
	   
	else
	{
		binary(num / 2);
		printf("%d", num % 2);
	}
}

void main()
{
	int num;
	scanf("%d", &num);
	binary(num);
}


