#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

void recurse(int *arr, int length)
{
    int cpid;
    if(length == 0)
        return;
    else
    {
        int i;
        printf("level %d\n", *arr);
        
        for(i = 0; i < *(arr+1) - 1; i++)
        {
            cpid = fork();
            
            if(cpid == 0)
            {
                printf("child number %d, my PID is: %d, my father is: %d\n", i, getpid(), getppid());
                wait(NULL);
                return;
            }
            
        }
        cpid = fork();
        if(cpid == 0)
        {
            printf("child number %d, my PID is: %d, my father is: %d\n", i, getpid(), getppid());
            recurse(arr+2, length-2);
        }
        wait(NULL);
        
    }
}

int main()
{
    int *arr, cpid, i, j = 0, length;
    printf("enter array length: ");
    scanf("%d", &length);
    arr = (int*)malloc(sizeof(int) * length);
    for(i = 0; i < length/2; i++)
    {
        arr[j] = i;
        j++;
        //arr[j] = i;
        printf("enter level %d: ", i);
        scanf("%d", &arr[j]);
        j++;
    }

    recurse(arr, length);
}

