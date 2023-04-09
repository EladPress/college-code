#include <stdio.h>

int linearSearch(int *arr, int num)
{//working
	int i;
	for(i = 0; i < 100; i++)
	{
		if(arr[i] == num)
		{
			return i;
		}
	}
	return -1;
}

void main()
{
	int arr[] = {12, 143, 32, 98, 2};
	printf("%d", linearSearch(arr, 98));
//	int arr[] = {5, 3, 2, 5, 6, 234, 12354, 124};
//	printf("%d", sizeof(arr)/sizeof(arr[0]));

}
