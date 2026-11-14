#include <stdio.h>
int main()
{
    long long n;
    scanf("%lld", &n);
    long long nt = 0;
    while (n != 0)
    {
        if ((n == 2 || n % 2 != 0) && n > 1)
            nt++;
        n /= 10;
    }
    printf("%lld", nt);
    return 0;
}