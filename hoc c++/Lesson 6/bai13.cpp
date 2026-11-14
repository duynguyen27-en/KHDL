#include <stdio.h>
int main()
{
    int n;
    printf("nhap so n de in ra hinh thoi la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        int m = i;
        for (int j = 0; j < n - 1 - i; j++)
        {
            printf(" ");
        }
        if (i == 0)
        {
            printf("*");
        }
        else
        {
            for (int k = 0; k < i + 1 + m; k++)
            {
                printf("*");
            }
        }
        printf("\n");
    }
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < i + 1; j++)
        {
            printf(" ");
        }
        int f = i + i;
        if (i == n - 2)
        {
            printf("*");
        }
        else
        {
            for (int k = 0; k < n + 2 - f; k++)
            {
                printf("*");
            }
        }
        printf("\n");
    }
}