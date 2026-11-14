#include <stdio.h>
void findPrimeFactors(int n)
{
    for (int i = 2; i <= n; i++)
    {
        if (n % i == 0)
        {
            printf("%d ", i);

            while (n % i == 0)
            {
                n /= i;
            }
        }
    }
}

int main()
{
    int n;
    scanf("%d", &n);
    findPrimeFactors(n);
    return 0;
}