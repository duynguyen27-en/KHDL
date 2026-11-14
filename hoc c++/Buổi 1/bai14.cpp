#include <stdio.h>
int main()
{
    long long n;
    scanf("%lld", &n);
    long long chan = 0, le = 0;
    if (n == 0)
    {
        chan += 0;
    }
    while (n != 0)
    {

        int r = n % 10;
        if (r % 2 == 0)
            chan += r;

        else if (r % 2 != 0)
            le += r;
        n /= 10;
    }
    printf("%lld %lld", chan, le);
    return 0;
}