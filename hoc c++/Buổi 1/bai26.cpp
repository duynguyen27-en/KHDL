#include <stdio.h>
int main()
{
    long long n;
    scanf("%lld", &n);
    long long s = 0;
    while (n > 0)
    {
        n /= 5;
        s += n;
    }
    printf("%lld", s);
    return 0;
}