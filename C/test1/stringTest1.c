#include <stdio.h>

void func(char *s, char c)
{
    char *ptr;
    ptr = s;
    while(*s)
    {
        if(*s != c)
        {
            *ptr = *s;
            ptr++;
            
        }
        //printf("%c", *ptr);
        s++;

    }
    *ptr = '\0';
    return;
}

void main()
{
    char string[10] = "morning";
    func(string, 'n');
    printf("\n\n%s\n", string);
    
}