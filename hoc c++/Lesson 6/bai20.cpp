#include <stdio.h>
int main()
{
    int n;
    printf("nhap so n la:");
    scanf("%d", &n);

    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j < n - i; j++)
    //     {
    //         printf("*");
    //     }
    //     for (int k = 0; k < i; k++)
    //     {
    //         printf(" ");
    //     }
    //     for (int l = 0; l < i; l++)
    //     {
    //         printf(" ");
    //     }
    //     for (int h = 0; h < n - i; h++)
    //     {
    //         printf("*");
    //     }
    //     printf("\n");
    // }
    // for (int i = 0; i < n - 1; i++)
    // {
    //     for (int j = 0; j <= i + 1; j++)
    //     {
    //         printf("*");
    //     }
    //     for (int k = 0; k < n - i - 2; k++)
    //     {
    //         printf(" ");
    //     }
    //     for (int l = 0; l < n - i - 2; l++)
    //     {
    //         printf(" ");
    //     }
    //     for (int h = 0; h <= i + 1; h++)
    //     {
    //         printf("*");
    //     }
    //     printf("\n");
    // }
    // cách 2
    // for (int i = 0; i < n * 2 - 1; i++)
    // {
    //     int k;
    //     if (i < n)
    //     {
    //         k = i;
    //     }
    //     else
    //     {
    //         k = 2 * n - i - 2;
    //     }
    //     for (int j = 0; j < n - k; j++)
    //     {
    //         printf("*");
    //     }
    //     for (int l = 0; l < 2 * k; l++)
    //     {
    //         printf(" ");
    //     }
    //     for (int h = 0; h < n - k; h++)
    //     {
    //         printf("*");
    //     }
    //     printf("\n");
    // }
    //  cách tối ưu
    for (int i = 0; i < 2 * n; i++)
    {
        int k;
        if (i < n)
        {
            k = i;
        }
        else
        {
            k = 2 * n - i - 2;
        }
        for (int j = 0; j < 2 * n; j++)
        {
            if (j < n - k || j >= n + k)
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }
    return 0;
}