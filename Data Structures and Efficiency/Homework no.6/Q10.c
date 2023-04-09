#include <stdio.h>

int Q10(int num)
{
	int sum = 0;
	if(num != 0)
	{
		sum += (num % 10) + Q10(num / 10);
		//zreturn sum;
	}
	
	else
	{
		return sum % 2 == 0;
	}
}

void main()
{
	printf("%d", Q10(779075));
}
