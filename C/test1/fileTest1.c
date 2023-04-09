#include <stdio.h>

void main()
{
    FILE *ptr;
    ptr = fopen("fileTest1.txt", "rt");
    if(ptr == NULL)
    {
        printf("error\n");
    }
    else
    {
        printf("file opened\n");
    }
    char string[256];
    //fprintf(ptr, "%s", string);
    fputs("hello there", ptr);
    fgets(string, 156, ptr);
    printf("%s\n", string);

    if(!fclose(ptr))
    {
        printf("file closed\n");
    }
    else
    {
        printf("error\n");
    }
    
}