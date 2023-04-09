#include <stdio.h>

int linearSortedSearch(int *arr, int num)
{
	int i;
	for(i = 0; i < 100; i++)
	{
		if(arr[i] > num)
		{
			return -1;
		}
		if(arr[i] == num)
		{
			return i;
		}
		
	}
	return -1;
	
}

void main()
{
	int arr[] ={1, 2, 5, 32, 54};
	printf("\n%d", linearSortedSearch(arr, 3));
}
