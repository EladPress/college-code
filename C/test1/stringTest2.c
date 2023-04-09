#include <stdio.h>
#include <string.h>

void shrinkStr(char *str1);
void main()
{
    // char str[] = "morning";
    // char *p;
    // for(p = str; *p; p++)
    // {
    //     if(*p == 'n')
    //     {
    //         *p = '\0';
    //         strcat(str, p+1);
    //     }
    // }
    // printf("%s", str);

    char str[] = "abccadaaab";
    shrinkStr(str);
}

void shrinkStr(char *str1)
{
    char str2[50];
    char *p1, *p2;
    p1 = str1;
    p2 = str2;
    while(*p1)
    {
        p1 = str1;
        *p2 = *p1;
        
        while(*p1)
        {
            if(*p1 == *p2)
            {
                *p1 = '\0';
                strcat(str1, p1+1);
            }
            p1++;
        }
        p2++;
        p1 = str1;

        
        

    }
    printf("%s", str2);
}