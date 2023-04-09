#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

int dynamicTree(int* arr, int len)
{
	int N, i, cpid, status;
	int* pids;

	if (len == 0)
		return 1;

	N = arr[1];
	pids = (int*)malloc(sizeof(int) * N);

	for (i = 0; i < N; i++)
	{
		cpid = fork();

		if (cpid == 0)
		{
			printf("father pid:%d ,child pid:%d\n", getppid(), getpid());
			if (i == 0)
			{
				pids[i] = getpid();
				dynamicTree(arr + 1, len - 1);
			}
			wait(&status);
			return 0;
		}
	}
	for (i = 0; i < N; i++)
	{
		wait(&status);
	}
	return 0;//
}
int main(int argc, char** argv)
{
	int size, num, i;
	int* arr;

	printf("Enter len arr:\n");
	scanf("%d", &size);
	while (size % 2 == 1)
	{
		printf("try again, Enter len arr:\n");
		scanf("%d", &size);
	}
	arr = (int*)malloc(sizeof(int) * size);

	for (i = 0; i < size; i += 2)
	{
		printf("Enter number:\n");
		scanf("%d", &num);
		arr[i] = i / 2;
		arr[i + 1] = num;
	}
	dynamicTree(arr, size / 2);
}