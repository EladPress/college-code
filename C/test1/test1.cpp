#include <stdio.h>

void main()
{
	int a, b;
	b = 5;
	a=b + 1;
	printf("1)  a = %d, b = %d \n\n", a, b);
	
	int c;
	printf("insert b, c:");
	scanf("%d  %d", &b, &c);
//	b = 5; int c = 7;
	a = (b>1) || ++c;
	printf("4) a = %d, b = %d, c = %d \n\n", a, b, c);
}
