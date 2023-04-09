#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

int main()
{
    //printf("%d\n", getpid());
    printf("hello\n");
    printf("fork: %d\n", fork());
    //fork();
    printf("pid: %d\n", getpid());
    wait(NULL);
    //printf(getid());
    //getpid();
    
    
    //return 0;
}