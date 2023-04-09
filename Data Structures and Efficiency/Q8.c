#include <stdio.h>



void Q8b(int *arr, int n)
{
//	int i;
//	for(i = 0; i < n; i++)
//	{
//		printf("number %d = %d", i, arr[i]);
//	}
    if(n != 0)
    {
    	printf("number %d = %d, ", n, arr[n - 1]);
    	Q8b(arr, n-1);
	}
}

void Q8a(int *arr, int n)
{
	printf("%d, ", arr[0]);
	if(n != 1)
	{
		Q8a(arr + 1, n - 1);
	}
}

void main()
{
	int arr[] = {0, 1, 3, 5, 1};
	Q8b(arr, 5);
	printf("\n");
	Q8a(arr, 5);
}
