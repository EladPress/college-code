#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

int main()
{  
    int length, i;
    printf("enter length:");
    scanf("%d", &length);

    for(i = 0; i < length; i++)
    {
        int newPid = fork();
        if(newPid == 0)
        {
            printf("I am a child and my PID is %d, my father is %d\n", getpid(), getppid());
        }
        else
        {
            break;
        }
    }
    wait(NULL);
}