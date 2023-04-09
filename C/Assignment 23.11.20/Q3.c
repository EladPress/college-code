#include <stdio.h>

int mat[4][4]={ {7,4,5,1},
				{34,78,43,1},
				{9,23,76,89},
				{56,2,8,13} };

int v[16]={0};

void sort(int *vec, int size);

void merge(int *vec1, int *vec2, int *dest, int size);


void main()
{
	int vt[2][8]={0};
	int i;
	
	for(i=0 ; i<4 ; i++)
		sort(mat[i], 4);
		
	for(i=0 ; i<4 ; i++)
		merge(mat[i++], mat[i], vt[i/2], 4);
		
	merge(vt[0], vt[1], v, 8);
}


void sort(int *vec, int size)
{
	int i, j, temp;
	
	for(i=0 ; i<size-1 ; ++i)
		for(j=size-1 ; j>i ; --j)
			if (vec[j-1]>vec[j])
			{
				temp=vec[j];
				vec[j]=vec[j-1];
				vec[j-1]=temp;
			}

}

void merge(int *a, int *b, int *c, int size)
{
	int i=0, j=0, k=0;
	
	while (i<size && j<size)
		if (a[i]<b[j])
			c[k++]=a[i++];
		else
			c[k++]=b[j++];

	while (i<size)
		c[k++]=a[i++];
		
	while (j<size)
		c[k++]=b[j++];

}