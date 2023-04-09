#include <stdio.h>
#define LEN 5
#define K 10
//working
void bucketSort(int *arr)
{
	int i;
	int counter[K] = {0};
	for(i = 0; i < LEN; i++)
	{
		counter[arr[i]]++;
	}
	int x = 0;
	for(i = 0; i < LEN; i++)
	{
		while(counter[x] == 0)
		{
			x++;
		}
		if(counter[x] != 0)
		{
			arr[i] = x;
			counter[x]--;
		}
		else
		{
			x++;
		}
	}
	for(i = 0; i < LEN; i++)
	{
		printf("%d, ", arr[i]);
	}
}

void main()
{
	int arr[LEN] = {9, 8, 4, 5, 2};
	bucketSort(arr);
}
