#include <stdio.h>

long long C(int n, int k)
{
    long long res = 1;
    for (int i = 1; i <= k; i++)
    {
        res = res * (n - k + i) / i;
    }
    return res;
}

int main()
{
    int n, m;
    scanf("%d %d", &n, &m);

    // số cách = C(n-1, m-1)
    printf("%lld\n", C(n - 1, m - 1));

    return 0;
}
