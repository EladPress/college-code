#include <stdio.h>
//working
unsigned long merge(unsigned int a, unsigned int b);
unsigned long reverse(unsigned int x);
void main()
{
	unsigned a, b;
	printf("enter a and then b:");
	scanf("%d %d", &a, &b);
	merge(a, b);
}

unsigned long merge(unsigned int a, unsigned int b)
{
	a = reverse(a);
	b = reverse(b);
	unsigned int num = 0;
	while(a != 0 || b != 0)
	{
		if(a != 0)
		   num *= 10;
		
		num += a % 10;
		if(b != 0)
		   num *= 10;
		
		num += b % 10;
		a /= 10;
		b /= 10;
	}
	printf("%d", num);
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
