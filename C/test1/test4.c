#include <stdio.h>

void calc(int *x, int *y)
{
//int *x, *y, *z ;
int *z;
z = *y ;
*y = *x ;
*x = z ;
}
void main()
{
int x = 100 ;
int y = 200 ;
calc (&x, &y) ;
printf("x is %d and y = %d", x, y) ;
}