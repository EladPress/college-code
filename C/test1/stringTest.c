#include <stdio.h>
//working test
void main()
{
    char str[20] = "hello there";
    char *p;
    for(p = str; *p; p++)
    {
        printf("%c", *p);
    }
    printf("\n%c", str[10]);
}