#include <stdio.h>
int isPerfectNumber(int n)
{
    int sum = 0;
    for (int i = 1; i < n; i++)
    {
        if (n % i == 0)
        {
            sum += i;
        }
    }
    if (sum <= n)
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
    int n;
    printf("nhap so nguyen duong n :");
    scanf("%d", &n);
    if (isPerfectNumber(n))
    {
        printf("1");
    }
    else
    {
        printf("0");
    }
    return 0;
}