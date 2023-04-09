#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
	int N, i, cpid, fpid, status;
	int *pids;
	
	printf("Enter number:\n");
	scanf("%d", &N);

    pids = (int*)malloc(sizeof(int) * N);

	fpid = getpid();
	printf("I am father and my PID is %d\n", fpid );
	
	for (i = 0; i < N; i++)
	{
		cpid = fork();
		
		if(cpid != 0)
		{
			break;
		}
		else
		{
			printf("I am a child and my PID is:%d, and my father's PID is %d:\n", getpid(), getppid());
		}
	}

	wait(&status);		
	
    free(pids);
	return 0;
	
}