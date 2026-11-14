#include <stdio.h>
int isPerfectNumber(int n)
{
    int sum = 0;
    int temp = n;
    for (int i = 1; i < n; i++)
    {
        if (n % i == 0)
            sum += i;
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
    int n;
    printf("nhap vao so nguyen duong n :");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++)
    {
        if (isPerfectNumber(i))
        {
            printf("%d ", i);
        }
    }
    return 0;
}