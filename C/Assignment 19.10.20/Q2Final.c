#include <stdio.h>
#include <conio.h>
#define N 10

//working
int isSymmetrical (int m[][N]) ;
int primaryDiagonal(int m[][N]) ;
int secondaryDiagonal (int m[][N]) ;

int main()
{
    int res, mat1[N][N] = {67,45,12,1,
					      45,56,23,52,
					      12,23,54,75,
				          1,52,75,98};
	
	int mat2[N][N] = {98, 75, 52, 1,
	                  45, 54, 23, 52,
					  12, 23, 54, 75,
					  1, 12, 45, 98};
					  
	int mat3[N][N] = {98, 75, 53, 1,
	                  45, 54, 23, 52,
					  12, 23, 54, 75,
					  12, 12, 45, 78};
    res = isSymmetrical (mat3) ;
    switch (res)
    {
	    case 2 : 	printf("Symmetrical to primary diagonal") ;
		    	break ;
	    case 1 : 	printf("Symmetrical to secondary diagonal") ;
			      break ;
	    case 0 : 	printf("Not a symmetrical matrix") ;
    }
    //getch();
}

int isSymmetrical (int m[][N])
{
	if (primaryDiagonal(m))
		return (2) ;
	if (secondaryDiagonal(m))
		return (1) ;
	
	return (0) ;
}

int primaryDiagonal(int m[][N])
{
	int i = 0, j = 0, bool = 1;
	
	for(i = 0; i < N; i++)
	{
		for(j = 0; j < N; j++)
		{
			if(m[i][j] != m[j][i])
		    {
				bool = 0;
			}
			
		}
	}
	return bool;
}

int secondaryDiagonal (int m[][N])
{
		int i = 0, j = 0, bool = 1;
	
	for(i = 0; i < N; i++)
	{
		for(j = 0; j < N; j++)
		{
			
			if(m[i][j] != m[N - 1 - j][N - 1 - i])
			{
				bool = 0;
			}
		}
	}
	return bool;
}
