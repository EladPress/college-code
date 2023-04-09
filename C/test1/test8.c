//שם זוגיים בתחילת המערך ואי זוגיים בסוף המערך
#include <stdio.h>
#define N 10
void what(int *v) ;
void pelet(int *v) ;
void main()
{
    int vec[N] = {5,19,42,8,13,6,12,17,29,22} ;
    what(vec) ;
    pelet(vec) ;
}
void what(int *v) // void what(int v[])
{
    int *p, tmp ;
    for (p=v+N-1 ; v<p ; )
    {
        if (*v%2==0) v++ ;
        if (*p%2!=0) p-- ;
        if (*v%2 && !(*p%2))
        {
            tmp = *v ;
            *v = *p ;
            *p = tmp ;
            v++ ;
            p-- ;
        }
    }
}
void pelet(int *v)
{
    int *p ;
    for (p=v ; p-v<N ; p++)
    printf("%d \t", *p) ;
}