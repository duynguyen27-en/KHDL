#include <stdio.h>
int factorial(int n)
{
    int result = 1;
    for (int i = 1; i <= n; i++)
    {
        result *= i;
    }
    return result;
}
int sumFactorial(int n)
{
    int sum = 0;
    int temp = n;
    while (n > 0)
    {
        sum += factorial(n % 10);
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
    int n;
    printf("mhap vao so mguyen duong n :");
    scanf("%d", &n);
    if (sumFactorial(n))
    {
        printf("1");
    }
    else
    {
        printf("0");
    }
    return 0;
}