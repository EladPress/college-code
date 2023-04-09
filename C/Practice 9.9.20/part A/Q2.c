#include <stdio.h>

void main()
{
	float a, b, c;
	printf("insert angle a, b and c:");
	scanf("%f  %f  %f", &a, &b, &c);
//	printf("%d  %d  %d\n", a, b, c);
	
	if(a + b + c == 180)
	{
		if(a == b && b == c)
	printf("Equitateral triangle.\n");
	
	if(a == b || b == c || a == c)
	printf("Isosceles triangle\n");
	
	if(a != b && b != c && a != c)
	printf("Scalene triangle\n");
	
	if(a == 90 || b == 90 || c == 90)
	printf("Right angled triangle\n");
	}
	
	else
	{
		printf("ERROR");
	}
	
}
