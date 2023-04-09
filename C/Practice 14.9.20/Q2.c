#include <stdio.h>

void main()
{
	int num, i;
	scanf("%d", &num);
	for(i = 2; i <= num; i++)
	{
		if(num % i == 0)
		{
			printf("%d, ", i);
			num /= i;
			i = 1;
		}
	}
}
