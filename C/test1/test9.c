#include <stdio.h>

void main()
{
    int a[10], i ;
int k=5 ;
for (i=0 ; i<10 ; i++)
    scanf("%d", &a[i]) ;
*a = k ;
for (i=k ; i>=0 ; i--)
   printf("%d, ", a[i]) ;
}