#include <stdio.h>
#include <math.h>
int isPrime(int n)
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

int main()
{
    int n;
    printf("nhap so luong phan tu n :");
    scanf("%d", &n);
    if (isPrime(n) == 1)
    {
        printf("1");
    }
    else
    {
        printf("0");
    }
    return 0;
}