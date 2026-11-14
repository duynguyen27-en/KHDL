#include <stdio.h>
void primeFactorization(int n)
{
    for (int i = 2; i <= n; i++)
    {

        while (n % i == 0)
        {
            printf("%d ", i);
            n /= i;
        }
    }
}

int main()
{
    int n;
    scanf("%d", &n);
    primeFactorization(n);
    return 0;
}