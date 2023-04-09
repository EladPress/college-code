#include <stdio.h>

void printGrades(int *grades);
int excellentGrades(int *grades, int n);
double belowAverage(int *grades, int n);
void maxAppearance(int *grades, int n);
void main()
{
	int grades[10] = {100, 85, 70, 85, 45, 100, 28, 85, 40, 90};
	int n = 9;
	printGrades(grades);
	printf("excellentGrades: %d\n", excellentGrades(grades, n));
	printf("belowAverage: %.2f", belowAverage(grades, n));
	maxAppearance(grades, n);
}

void printGrades(int *grades)
{
	int i;
	for(i = 0; i < 10; i++)
	{
		printf("Grade no. %d : %d\n", i + 1, grades[i]);
	}
}

int excellentGrades(int *grades, int n)
{
	if(n == -1)
	{
		return 0;
	}
	else
	{
		if(grades[n] > 85)
		    return 1 + excellentGrades(grades, n - 1);
		else
		    return excellentGrades(grades, n - 1);
		
	}
}

double belowAverage(int *grades, int n)
{
	int i;
	double average = 0;
	for(i = 0; i <= n; i++)
	{
		average += grades[i];
	}
	average /= (n + 1);
	
	for(i = 0; i <= n; i++)
	{
		if(grades[i] < average)
		{
			printf("Below average grade no. %d : %d\n", i, grades[i]);
		}
	}
	return average;
}

void maxAppearance(int *grades, int n)
{
	int i;
	int counter[101]= {0}; 
	for(i = 0; i <= n; i++)
	{
		counter[grades[i]]++;
	}
	for(i = 0; i <= 100; i++)
	{
		if(counter[i] != 0)
		{
			printf("%d : %d times\n", i, counter[i]);
		}
	}
}
