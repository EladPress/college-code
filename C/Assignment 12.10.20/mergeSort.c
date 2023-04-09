#include <stdio.h>
#define LEN 5
//working

void mergeSort(int *arr1, int *arr2)
{
	int arr3[2* LEN] = {0};
	int min1 = 0, min2 = 0, i = 0;
	for(i = 0; i < (2 * LEN); i++)
	//while(min1 <= LEN || min2 <= LEN || i < (2*LEN))
	{
		if(min1 != LEN && min2 != LEN) {
			if(arr1[min1] < arr2[min2])
			{
				arr3[i] = arr1[min1];
				min1++;
				
			}
			else if(arr1[min1] > arr2[min2])
			{
				arr3[i] = arr2[min2];
				min2++;	
			}
			else if(arr1[min1] == arr2[min2])
		    {
			    arr3[i] = arr1[min1];
			    min1++;
		    }
		}
		else if(min1 == LEN) 
		{
			arr3[i] = arr2[min2];
			min2++;
		} 
		else if(min2 == LEN)
		{
			arr3[i] = arr1[min1];
			min1++;
		}
		
		
		
	}
	
	for(i = 0; i < (2* LEN); i++)
	{
		printf("%d, ", arr3[i]);
	}
	
}

void main()
{
	//printf("%d",2*  LEN);
	int arr1[LEN] = {2, 3, 6, 8, 123};
	int arr2[LEN] = {0, 6, 12, 567, 568};
	mergeSort(arr1, arr2);
}
