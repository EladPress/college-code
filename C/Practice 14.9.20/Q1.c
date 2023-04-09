#include <stdio.h>

void main()
{
	int num;
	scanf("%d", &num);
	int b = 1;
	int i;
	for(i = 2; i < num; i++)
	{
		if(num / i != 0 && num % i == 0)
		{
			b = 0;
		}
		
	}
	(b) ? printf("Prime") : printf("Not prime");
}
