#include <stdio.h>
int main()
{
    long n;
    scanf("%ld", &n);
    if (n % 2 == 0)
    {
        long s = n / 2;
        printf("%ld\n ", s);
        for (int i = 1; i <= (n / 2); i++)
            printf("2 ");
    }
    else
    {

        printf("%d\n", n / 2);
        printf("3 ");
        for (int i = 1; i <= (int)(n / 2) - 1; i++)
            printf("2 ");
    }
    return 0;
}