#include <stdio.h>

void func(int num, int *max_divider, int *min_divider)
{
    int counter = 0;
    int i;
    for(i = (num - 1); i > 1; i--)
    {
        if(num % i == 0)
        {
            if(counter == 0)
            {
                *max_divider = i;
                
            }
            else
            {
                *min_divider = i;
            }
            counter++;
        }
    }
}

void main()
{
    int num, max_divider, min_divider;
    printf("Enter a number :");
    scanf("%d", &num);
    func(num, &max_divider, &min_divider);
    printf("\n max_divider = %d, min_divider = %d", max_divider, min_divider);
}