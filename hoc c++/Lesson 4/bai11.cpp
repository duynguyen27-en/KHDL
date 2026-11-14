#include <stdio.h>
int findStrongNumbers(int n)
{
    int sum = 0;
    int temp = n;
    while (n > 0)
    {
        int digit = n % 10;
        int factorial = 1;
        for (int i = 1; i <= digit; i++)
        {
            factorial *= i;
        }
        sum += factorial;
        n /= 10;
    }
    if (sum == temp)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int main()
{
    int a, b;
    scanf("%d %d", &a, &b);
    for (int i = a; i <= b; i++)
    {
        if (findStrongNumbers(i))
        {
            printf("%d ", i);
        }
        else
        {
            continue;
        }
    }
    return 0;
}