#include <stdio.h>
int main()
{
    int n;
    printf("nhap phan tu n la :");
    scanf("%d", &n);
    // cách làm 2 vòng lặp
    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j < n - 1 - i; j++)
    //     {
    //         printf(" ");
    //     }
    //     for (int k = 0; k < n - i; k++)
    //     {
    //         printf("*");
    //     }
    //     printf("\n");
    // }
    // for (int i = 0; i < n - 1; i++)
    // {
    //     for (int j = 0; j < i + 1; j++)
    //     {
    //         printf("");
    //     }
    //     for (int k = 0; k <= i + 1; k++)
    //     {
    //         printf("*");
    //     }
    //     printf("\n");
    // }

    // cách làm một vong lặp
    for (int i = 0; i < 2 * n - 1; i++)
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
        for (int j = 0; j < n - k - 1; j++)
        {
            printf(" ");
        }
        for (int l = 0; l < n - k; l++)
        {
            printf("*");
        }
        printf("\n");
    }
}