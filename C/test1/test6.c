#include <stdio.h>
#define MAX 10
void func1 (int v[]) ;
void func2 (int v[], int *big, int *small) ;
void main()
{
int v[MAX], max, min ;
func1(v) ;
func2(v, &max, &min) ;
printf("max = %d\nmin = %d", max, min);
}
void func1 (int v[])
{
int i ;
printf("\nenter %d values :\n",MAX );
for ( i=0 ; i<MAX ; ++i )
scanf("%d", &v[i]) ;
}
void func2 (int v[], int *big, int *small)
{
int i, delta, x ;
*big = *small = x = v[0] ;
for ( i=1 ; i<MAX ; ++i )
{
x+= v[i] ;
if (x > *big)
*big = x ;
else
if (x < *small)
*small = x ;
}
}
