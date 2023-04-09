#include <stdio.h>
//working
void Q1(int left, int right)
{
	int tempNum, max = 0, tempSum = 0, maxNum=0;
	while(left <= right)
	{
		tempNum = left;
		while(tempNum != 0)
		{
			tempSum += tempNum % 10;
			tempNum /= 10;
		}
		if(tempSum >  max)
		{
			max = tempSum;
			maxNum = left;
		}
		left++;
		tempSum = 0;
	}
	printf("%d", maxNum);
}

void main()
{
	int left, right;
	printf("left and then right:");
	scanf("%d %d", &left, &right);
	Q1(left, right);
}
