#include <stdio.h>
int ispalindrome(int n)
{
    int sum = 0;
    int temp = n;
    while (n > 0)
    {
        int digit = n % 10;
        sum = sum * 10 + digit;
        n /= 10;
    }
    if (temp == sum)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
int sDigit6(int n)
{
    while (n > 0)
    {
        int digit = n % 10;
        if (digit == 6)
        {
            return 1;
        }
        n /= 10;
    }
    return 0;
}
int hasdigitsumEndingWith8(int n)
{
    int sum = 0;
    while (n > 0)
    {
        int digit = n % 10;
        sum += digit;
        n /= 10;
    }
    if (sum % 10 == 8)
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
    long long b;
    scanf("%d %lld", &a, &b);
    for (long long i = a; i < b; i++)
    {
        if (ispalindrome(i) && sDigit6(i) && hasdigitsumEndingWith8(i))
        {
            printf("%lld ", i);
        }
    }

    return 0;
}