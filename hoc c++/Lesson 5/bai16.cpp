#include <stdio.h>
#include <math.h>
#include <stdbool.h>

bool isPrime(int x)
{
    if (x < 2)
        return false;
    for (int i = 2; i <= sqrt(x); i++)
    {
        if (x % i == 0)
            return false;
    }
    return true;
}

int isBeautifulNumber(int n)
{
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (isPrime(i))
        {
            if (n % (i * i) == 0)
                return 1;
        }
    }
    return 0;
}

int main()
{
    int a, b;
    printf("nhap 2 so a va b: ");
    scanf("%d %d", &a, &b);

    for (int i = a; i <= b; i++)
    {
        if (isBeautifulNumber(i))
            printf("%d ", i);
    }

    return 0;
}