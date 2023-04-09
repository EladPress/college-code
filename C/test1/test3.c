#include <stdio.h>

void main()
{
    char c[];
    scanf("%c", c);
    int i;
    for(i = 0; i < 11; i++)
    {
        printf("%c", c[i]);
    }
}