#include <stdio.h>
#define N 6

int checkMat(int mat[N][N])
{
	int mat2[N + 1][N + 1] = {0};
	int i = 0, j = 0;
	for(i = 1; i < N; i++)
	{
		for(j = 1; j < N; j++)
		{
			mat2[i][j] = mat[i - 1][j - 1];
		}
	}
	for(i = 0; i < N + 1; i++)
	{
		for(j = 0; j < N + 1; j++)
		{
			printf("%d, ", mat2[i][j]);
		}
		printf("\n\n");
	}
}

int main()
{
int mat[N][N] = { {3,2,2,1,1,0},
                {2,2,2,2,0,0},
                {2,2,1,2,1,1},
                {2,2,2,2,0,0},
                {2,2,1,2,1,1},
                {2,2,2,1,0,0} };
                
printf("%d", checkMat(mat));
}  
