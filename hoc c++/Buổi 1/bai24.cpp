#include <stdio.h>
long long c(int n, int k)
{
    long long s = 1;
    for (int i = 1; i <= k; i++)
    {
        s = s * (n - k + i) / i;
    }
    return s;
}
int main()
{
    int n, m;
    scanf("%d %d", &n, &m);
    printf("%lld", c(n + m - 1, n - 1));
    return 0;
}