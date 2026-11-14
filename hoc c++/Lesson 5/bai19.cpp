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
    int sum = 0;
    while (n > 0)
    {
        int digit = n % 10;
        sum = sum * 10 + digit;
        n /= 10;
    }
    return sum;
}
int isReversedPrime(int n)
{
    int sum = isBeautifulNumber(n);
    return isprime(n) && isprime(sum) && (n != sum);
}
int main()
{
    int a, b;
    printf("nhap vao hai phan tu a va b la :");
    scanf("%d %d", &a, &b);
    for (int i = a; i <= b; i++)
    {
        if (isReversedPrime(i))
        {
            printf("%d ", i);
        }
    }
    return 0;
}