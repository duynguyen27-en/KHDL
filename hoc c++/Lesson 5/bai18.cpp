#include <stdio.h>
#include <math.h>
int isprime(int n)
{
    if (n < 2)
        return 0;
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (n % i == 0)
            return 0;
    }
    return 1;
}
void listPrimeDigits(long long n)
{
    int sum = 0;
    while (n > 0)
    {
        int digit = n % 10;
        n /= 10;
        if (isprime(digit))
        {
            while (n > 0)
            {
                int second = digit % 10;
                if (digit == second)
                {
                    sum++;
                    printf("%d %d", digit, sum);
                }
                digit /= 10;
            }
        }
    }
}

int main()
{
    long long n;
    scanf("%lld", &n);
    listPrimeDigits(n);
    return 0;
}