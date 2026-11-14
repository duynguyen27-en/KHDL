#include <stdio.h>
int main()
{
    long long n;
    scanf("%lld", &n);
    long long ask = 0;
    while (n != 0)
    {
        ask++;
        n /= 10;
    }
    printf("%lld", ask);
    return 0;
}