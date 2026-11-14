#include <stdio.h>
int sodep(int n)
{
    int sum = 0;
    for (int i = 1; i <= n / 2; i++)
    {
        if (n % i == 0)
        {
            sum += i;
        }
    }
    return sum == n;
}

int main()
{
    int a, b;
    scanf("%d %d", &a, &b);
    int count = 0;
    for (int i = a; i <= b; i++)
    {
        if (sodep(i))
        {
            printf("%d\n", i);
            count++;
        }
    }
    if (count == 0)
    {
        printf("0");
    }

    return 0;
}