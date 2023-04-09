#include <stdio.h>
//working
#include <math.h>
void main()
{
	int num;
	scanf("%d", &num);
//	printf("%f", pow(5, 3));
    if((num >= 100 && num <=999) || (num <= -100 && num >= 999))
    {
    	int tempNum = num; int sum = 0;
    	while(tempNum != 0)
    	{
    		sum += pow(tempNum % 10, 3);
    		tempNum /= 10;
		}
		if(sum == num)
		{
			printf("yes");
		}
		else
		{
			printf("no");
		}
	}
	else
	    printf("ERROR");
}
