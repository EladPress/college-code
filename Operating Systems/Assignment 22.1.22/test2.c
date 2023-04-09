#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("father pid: %d\n", getpid());
    int cpid = fork();
    wait(NULL);
    if(cpid == 0)
        printf("I am child %d and my parent is %d\n", getpid(), getppid());
    cpid = fork();
    if(cpid == 0)
        printf("middle node: %d", getppid());
    
}

