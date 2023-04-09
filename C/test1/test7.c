#include <stdio.h>
#define N 5
int what(int *v) ;
void main()
{
    int vec[N] = {5,19,42,8,13} , result ;
    result = what(vec) ;
    printf("result = %d", result) ;
}
int what(int *v) // int what(int v[])
{
    int *p, res=0 ;
    // p = v + N ;
    // printf("%d", *p);
    for (p=v+N ; v<p ; v++)
    {    
        //printf("%d\n", p - v);
        *v += p-v ;
        printf("%d\n", *v);
        res += *v ;
    }
    return(res) ;
}