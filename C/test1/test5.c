#include <stdio.h>
#define N 128
typedef enum{FALSE, TRUE} boolean;

void searchAndReplace(char *str, char *search, char *replace)
{
    int dict[N] = {0};
    char *ptr = str;
    while(*search)
    {
        dict[*search] = *replace;
        search++;
        replace++;
    }
    while(*str)
    {
        if(dict[*str] != 0)
        {
            *str = dict[*str];
        }
        str++;
    }
    //printf("%s", ptr);
}


void main()
{
    char arr[] = "Good luck in the exam";
    char replace[] = "yk";
    char search[] = "oe";
    searchAndReplace(arr, search, replace);
    printf("%s", arr);
}
