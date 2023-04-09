#include <stdio.h>
#define LEN 10
//working
void maxSort(int *arr)
{
	int i, j, N = LEN, max = 0, maxIndex;
	for(i = 0; i < LEN; i++)
	{
		max = -1;
		maxIndex = -1;
		for(j = 0; j < N; j++)
		{
			if(arr[j] > max)
			{
				max = arr[j];
				maxIndex = j;
			}
		}
		int temp = arr[N - 1];
		arr[N - 1] = arr[maxIndex];
		arr[maxIndex] = temp;
		N--;
	}
}

void main()
{
	int arr[LEN] = {4, 2, 5, 2, 6, 2, 21, 534, 1, 0};
	maxSort(arr);
	int i = 0;
	for( i = 0; i < LEN; i++)
	{
		printf("%d, ", arr[i]);
	}
}
