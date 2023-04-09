#include <stdio.h>
#define SIZE 4
void main()
{
	int mat[SIZE][SIZE] = {0} ;
	int i,j;
	for(i=0 ; i<SIZE ; i++)
		for(j=0 ; j<SIZE ; j++)
		{
			*(*mat+i*SIZE) += i+j;
			if (j<SIZE-1)
			{
				*(*mat+j+1) += j;
			}
				
			if ((i==j) && (i!=0))
			{
				mat[i][j] = i*j;
			}
				
		}
			
	for (i=0 ; i<SIZE ; i++)
	{
		printf("\n");
		for(j=0 ; j<SIZE ; j++)
			printf("%3d ", mat[i][j]);
	}
}