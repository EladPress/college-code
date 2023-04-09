#include <stdio.h>
#define N 3

int findMax(int *arr)
{
    int max = 0, i;
    for(i = 0; i < (N * N * N); i++)
    {
        if(*(arr + i) >= max)
        {
            max = *(arr + i);
            //printf("%d\n", i);
        }
            
    }
    return max;
    
}
void ColumnWithMax(int arr[N][N][N])
{
    int max = findMax((int *)arr), i, j, k;//, tempArr[N] = {-1}, n;
    int x, y;

    for(i = 0; i < N; i++)
    {
        for(j = 0; j < N; j++)
        {
            for(k = 0; k < N; k++)
            {
                if(arr[i][j][k] == max)
                {
                    //tempArr[n++] = 
                    for(x = 0; x < N; x++)
                    {
                        printf("%d  ", arr[i][x][k]);
                    }
                    printf("\n");
                    
                }
            }
        }
    }
    
}
void main()
{    
    int arr[N][N][N]=
    {
        {
        {11, 12, 13},
        {14, 100, 16},
        {17, 18, 19}
        },
        {
        {100, 22, 23},
        {24, 25, 26},
        {27, 28, 29}
        },
        {
        {31, 32, 33},
        {34, 35, 36},
        {37, 38, 100}
        }
    };
    printf("%d\n", findMax((int *)arr));
    ColumnWithMax(arr); // קריאה לפונקציה להדפסת טורים עם ערך מקסימלי
}