#include <stdio.h>
#include <math.h>
int palindrome(int n)
{
    int temp = n;
    int sum = 0;
    while (temp > 0)
    {
        sum = sum * 10 + temp % 10;
        temp /= 10;
    }
    if (sum == n)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
int sumDigitsDivisibleBy10(int n)
{
    int sum = 0;
    while (n > 0)
    {
        sum += n % 10;
        n /= 10;
    }
    if (sum % 10 == 0)
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
    int a;
    scanf("%d", &a);
    int count = 0;
    int start = pow(10, a - 1);
    int end = pow(10, a) - 1;
    for (int i = start; i <= end; i++)
    {
        if (palindrome(i) && sumDigitsDivisibleBy10(i))
        {
            count++;
        }
    }
    printf("%d", count);
    return 0;
}