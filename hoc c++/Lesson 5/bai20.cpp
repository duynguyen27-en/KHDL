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
int isBeautifulNumber(int n)
{
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (isprime(i))
        {
            if (n % i == 0 && n % (i * i) == 0)
                return 1;
                }
    }
    return 0;
}

int main()
{
    int a, b;
    printf("nhap so tu a den b la :");
    scanf("%d %d", &a, &b);
    for (int i = a; i <= b; i++)
    {
        if (isBeautifulNumber(i) == 1)
            printf("%d ", i);
    }
    return 0;
}