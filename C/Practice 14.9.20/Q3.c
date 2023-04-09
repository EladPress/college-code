#include <stdio.h>

void main()
{
	int num;
	scanf("%d", &num);
	int x1 = 1, x2 = num - x1;
	while(x1 < num)
	{
		x2 = num - x1;
		if(checkPrime(x2) && checkPrime(x1))
		{
			printf("%d + %d = %d\n", x1, x2, num);
		}
		x1++;
	}
	
	
	
}

int checkPrime(int num)
	{
		int b = 1;
	    int i;
	    for(i = 2; i < num; i++)
	    {
		   if(num / i != 0 && num % i == 0)
		   {
			    b = 0;
		   }
	    }
	    return b;
	
	}
