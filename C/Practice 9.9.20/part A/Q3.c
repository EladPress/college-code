#include <stdio.h>
#include <math.h>
void main()
{
	printf("insert a, b and c\n");
	float a, b, c;
	scanf("%f  %f  %f", &a, &b, &c);
	printf("a = %.0f, b = %.0f, c = %.0f\n", a, b, c);
	
	float discriminant = (b*b) - (4*a*c);
	//printf("%f", discriminant);
    if(discriminant < 0)
    {
    	printf("no solution");
	}
	if(discriminant == 0)
	{
		float x = (-b) / (2*a);
		printf("x = %f", x);
	}
	else
	{
		float x1 = (-b + sqrt(discriminant)) / (2*a);
		float x2 = (-b - sqrt(discriminant)) / (2*a);
		printf("x1 = %f, x2 = %f", x1, x2);
	}
}
