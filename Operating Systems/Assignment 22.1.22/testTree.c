#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int length;
    printf("enter length:");
    scanf("%d", &length);
    //printf("%d", length);
    printf("I am a father and my PID is %d\n", getpid());
    int i;
    for(i = 0; i < length; i++)
    {
        //printf("test\n");
        int cpid = fork();
        //wait(NULL);
        if(cpid == 0)
        {
            printf("This is child %d and my parent is %d\n", getpid(), getppid());
            //return 0;
            break;
        }
            
        
    }
    wait(NULL);
    
    /*for(i = 0; i < length; i++)
    {
        wait(NULL);
    }*/
}