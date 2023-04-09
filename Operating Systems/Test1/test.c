#include <stdio.h>

void main()
{
    int num = 12, * ptr;
    ptr = &num;

    printf("%d", *ptr);
}