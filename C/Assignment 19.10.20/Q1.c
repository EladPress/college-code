
#include <stdio.h>
#define N 5
//working
int matIsLegal(int mat[N][N])
{
	int ret = 1;
	int i = 0, j = 0;
	for(j = 0; j < N; j++)
	{
		for(i = 0; i < N; i++)
		{
			if(mat[j][i] != 0 && mat[j][i] != 1)
			{
				ret = 0;
			}
		}
	}
	return ret;
}

void fun(int mat[N][N])
{
	int currentVCounter = 0, currentHCounter = 0, maxVCounter = 0, maxHCounter = 0,
	i = 0, j = 0;
	
	for(j = 0; j < N; j++)
	{
		for(i = 0; i < N; i++)
		{
			currentVCounter = mat[i][j] == 1 ? currentVCounter + 1: 0;
			currentHCounter = mat[j][i] == 1 ? currentHCounter + 1: 0;
		}
		if(currentVCounter > maxVCounter)
		{
			maxVCounter = currentVCounter;
		}
		if(currentHCounter > maxHCounter)
		{
			maxHCounter = currentHCounter; 
		}
		currentHCounter = 0;
		currentVCounter = 0;
	}
	printf("longest horizontal sequence: %d, longest vertical sequence: %d", maxHCounter, maxVCounter);
}

int main()
{
    int mat[N][N] = {   0, 0, 1, 1, 1, 
                        1, 1, 0, 0, 1,
                        1, 0, 0, 0, 0, 
                        1, 1, 1, 1, 1, 
                        1, 0, 1, 1, 0} ;
    if (matIsLegal(mat)==1)
        fun(mat) ;
    else
        printf("The matrix is illegal !");   
               
}


