#include <stdio.h>
int main()
{
    int n, t;
    scanf("%d %d", &n, &t);
    if (n == 1 && t == 10)
    {
        printf("-1");
    }
    else if (t >= 2 && t <= 9)
    {
        printf("%d", t);
        for (int i = 1; i < n; i++)
            printf("0");
    }
    else
    {
        printf("1");
        for (int i = 1; i < n; i++)
            printf("0");
    }

    return 0;
}
