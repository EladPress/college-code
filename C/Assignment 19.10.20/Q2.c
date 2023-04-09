#include <stdio.h>
#define n 4
//more efficient, not like was asked.
int fun(int mat[n][n])
{
	int i = 0, j = 0, mainBool = 2, secBool = 1;
	
	for(i = 0; i < n; i++)
	{
		for(j = 0; j < n; j++)
		{
			if(mat[i][j] != mat[j][i])
		    {
				mainBool = 0;
			}
			if(mat[i][j] != mat[n - 1 - j][n - 1 - i])
			{
				secBool = 0;
			}
		}
	}
	return mainBool + secBool;
}

void main()
{
	int mat1[n][n] = {67, 45, 12, 1,
	                 45, 56, 23, 52,
					 12, 23, 54, 75,
					 1, 52, 75, 98};
					 
	int mat2[n][n] = {98, 75, 52, 1,
	                  45, 54, 23, 52,
					  12, 23, 54, 75,
					  1, 12, 45, 98};
					  
	int mat3[n][n] = {98, 75, 53, 1,
	                  45, 54, 23, 52,
					  12, 23, 54, 75,
					  12, 12, 45, 78};
	printf("%d", fun(mat3));
}
