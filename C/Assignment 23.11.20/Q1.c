//working
#include <stdio.h>
#define N 4
void main()
{
    int arr[N][N] = {7, 2, 5, 6,
                     2, 3, 8, 7,
                     8, 9, 11, 45,
                     3, 75, 79, 23};
    int *p, i;
    p = *arr;

    for(i= 0; i < N*N; i++)
    {
        if(*(p + 1) - *p == 1)
        {
            printf("%d, ", *p);

            while(*(p + 1) - *p == 1)
            {
                i++;
                p++;
                printf("%d, ", *p);
            }
            printf("\n");
        }
        p++;
    }

    
}