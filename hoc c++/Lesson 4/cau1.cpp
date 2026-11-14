#include <stdio.h>
#include <math.h>
int demso(long long n)
{
    if (n == 0)
        return 0;
    while (n)
    {
        int digit = n % 10;
        if (digit < 2)
            return 0;
        else
        {
            for (int i = 2; i <= sqrt(digit); i++)
            {
                if (digit % i == 0)
                    return 0;
            }
        }
        n = n / 10;
    }
    return 1;
}
int tongsont(long long n)
{
    int tong = 0;
    while (n)
    {
        tong += n % 10;
        n = n / 10;
    }
    if (tong < 2)
        return 0;
    else
    {
        for (int i = 2; i <= sqrt(tong); i++)
        {
            if (tong % i == 0)
                return 0;
        }
    }
    return 1;
}

int main()
{
    long long a, b;
    scanf("%lld %lld", &a, &b);
    for (long long i = a; i <= b; i++)
    {
        if (demso(i) && tongsont(i))
        {
            printf("%lld ", i);
        }
    }
    return 0;
}