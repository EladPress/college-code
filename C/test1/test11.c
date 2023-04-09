#include <stdio.h>
int vec[9]={30,98,39,67,45,34,23,76,96};
int i;
float average, tot;
void main()
{
    tot=0;
    for (i=0 ; i<10 ; i++)
    tot+=*(vec+i);
    average=(float)(tot/9);
    printf("the total sum of the numbers is %.0f, and the average is %.2f", tot, average);
}