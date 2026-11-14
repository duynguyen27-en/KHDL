#include <stdio.h>
int isLocphatnumbers(long long n)
{
    if (n == 0)
        return 0;
    while (n > 0)
    {
        int digit = n % 10;
        if (digit != 6 && digit != 8 && digit != 0)
        {
            return 0;
        }
        n /= 10;
    }
    return 1;
}

int main()
{
    long long n;
    scanf("%lld", &n);
    if (isLocphatnumbers(n))
    {
        printf("1");
    }
    else
    {
        printf("0");
    }
    return 0;
}