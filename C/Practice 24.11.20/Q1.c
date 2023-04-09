#include <stdio.h>
#include <string.h>

#define LEN2 12
#define LEN1 4
int *string(char *s1, char *s2);
void main()
{
    char s1[]="abc", s2[]="aghbfecf";
    if (string(s1,s2))
    {
        printf("YES!");
    }
    
    else
    {
        printf("NO!");
    }
    

}

int *string(char *s1, char *s2)
{
    char *ptr1, *ptr2;
    ptr1 = s1;
    ptr2 = s2;
}