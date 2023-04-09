#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
	int N, i, cpid, status;
	int* pids;
	
	printf("Enter number:\n");
	scanf("%d", &N);

	pids = (int*)malloc(sizeof(int) * N);
	
	printf("I am father and my PID is %d\n", getpid() );
	
	for (i = 0; i < N; i++)
	{
		cpid = fork();
		
		if( cpid == 0 )
		{
			printf("I am child and my PID is %d, my father's PID is:%d\n", getpid(), getppid() );
			return 0;
		}
		else
		{
			pids[i] = cpid;
		}
	}

	for (i = 0; i< N; i++ )
	{
		wait(&status);
		
	}
	
	printf("I am father and my sons are:");	
	for (i = 0; i< N; i++ )
	{
		printf("%d\n", pids[i]);
		
	}
	
	free(pids);
	return 0;
	
}