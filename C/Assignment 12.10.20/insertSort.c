#include <stdio.h>
#define LEN 5
//working
void insertSort()
{
	int arr[LEN];
	int i, j;
	
	printf("number 1:");
	scanf("%d", &arr[0]);
	for(i = 1; i < LEN; i++)
	{
		printf("\nnumber %d:", i+1);
		scanf("%d", &arr[i]);
		for(j = i; j >= 0; j--)
		{
			if(arr[j] < arr[j - 1])
		    {
			    int temp = arr[j];
			    arr[j] = arr[j - 1];
			    arr[j - 1] = temp;
		    }
		}
		
	}
	for(i = 0; i < LEN; i++)
	{
		printf("%d, ", arr[i]);
	}
}

void main()
{
	insertSort();
}
