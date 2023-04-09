#include <stdio.h>
//working
unsigned long reverse(unsigned int x);
void main()
{
	printf("enter number:");
	int num;
	scanf("%d", &num);
	reverse(num);
}

unsigned long reverse(unsigned int x)
{
	unsigned int num = 0;
	while(x != 0)
	{
		num *= 10;
		num += x % 10;
		x /= 10;
	}
	return num;
}
