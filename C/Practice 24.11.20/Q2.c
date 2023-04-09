#include <stdio.h>
#define LEN1 12
#define LEN2 4
int *findVec (int *v1, int *v2) ;
void main()
{
    int V1[] = {4,3,7,6,1,9,0,6,10,3,4,9} ;
    int V2[] = {6,1,9,0} ;
    int *p=findVec(V1,V2) ;
    if (p)
        printf("Found!");z
    else
        printf("Not found!");

    printf("\n%d", V2);
    printf("\n%d", p);

}

int *findVec(int *v1, int *v2)
{
    int i, j, *num;
    for(i = 0; i < (LEN1 - LEN2); i++)
    {
        for(j = 0; j < LEN2; j++)
        {
            if(*(v1 + i + j) == *(v2 + j))
            {
                if(j == 0)
                    num = v2;
                if(j == (LEN2 - 1))
                    return num;
            }
            else
            {
                num = 0;
                break;
            }
            
        }
    }
    return NULL;
}