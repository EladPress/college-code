#include <stdio.h>
#define LEN 10
//working
void bubbleSort(int *arr);
void main()
{
	
	int arr[LEN] = s
	bubbleSort(arr);
	int i = 0;
	for( i = 0; i < LEN; i++)
	{
		printf("%d, ", arr[i]);
	}

}

void bubbleSort(int *arr)
{
	
	
	int N = LEN, i, j;
	for(i = 1; i <= N; i++)
	{
		for(j = 0; j < N - 1; j++)
		{
			if(arr[j] > arr[j + 1])
			{
				int temp = arr[j + 1];
				arr[j + 1] = arr[j];
				arr[j] = temp;
			}
		}
	}
	
}
