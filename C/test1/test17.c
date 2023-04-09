#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main()
{
    char *p[2][3] = {"question", "number", "4", "good", "luck", "!!!"};
    printf("%s\n", *p[0] + 5);
    printf("%c\n", *(p[1][2]+2));
    printf("%c\n", **p[1]);
}