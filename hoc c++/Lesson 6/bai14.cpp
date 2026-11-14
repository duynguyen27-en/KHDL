#include <stdio.h>
int main()
{
    int n;
    printf("nhap so n la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < i + i; j++)
        {
            printf(" ");
        }
        if (i == 0)
        {
            for (int k = 0; k < n; k++)
            {
                printf("*");
            }
        }
        else if (i == n - 1)
        {
            printf("*");
        }
        else
        {
            for (int l = 0; l < n - i; l++)
            {
                printf("*");
            }
        }
        printf("\n");
    }
    for (int i = 0; i < n - 1; i++)
    {
        int k = i + i;
        for (int j = 0; j < n + 1 - k; j++)
        {
            printf(" ");
        }
        if (i == n - 2)
        {
            for (int k = 0; k < n; k++)
            {
                printf("*");
            }
        }
        else
        {
            for (int l = 0; l <= i + 1; l++)
            {
                printf("*");
            }
        }
        printf("\n");
    }
}