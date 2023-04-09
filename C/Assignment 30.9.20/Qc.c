#include <stdio.h>

int sortedSearch(int *arr, int num)
{
	int min = 0, max = 99;
	while(max - min != 1)
	{
		int i = (min + max) / 2;
		if(arr[i] == num)
		{
			return i;
		}
		if(arr[i] < num)
		{
			min = i;
		}
		if(arr[i] > num)
		{
			max = i;
		}
		
	}
	if(arr[min] == num)
	{
		return min;
	}
	if(arr[max] == num)
	{
		return max;
	}
	else
	{
		return -1;
	}
}

void main()
{
	int arr[] = {1, 3, 5, 10, 12, 14, 20, 30, 40, 54};
	printf("%d", sortedSearch(arr, 60));
}
