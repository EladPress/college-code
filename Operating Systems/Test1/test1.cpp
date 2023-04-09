#include <stdio.h>
#include <conio.h>
#include <stack>

//#include "test1.h"
void a_main()
{
	std::stack<int> s;
	int temp = 0;
	for (int i = 0; i < 4; i++)
	{
		printf("\nenter number:");
		int temp;
		scanf_s("%d", &temp);
		s.push(temp);
	}
	while (!s.empty())
	{
		printf("%d, ", s.top());
		s.pop();
	}
}

