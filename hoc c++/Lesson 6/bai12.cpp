#include <stdio.h>
int main()
{
    int n;
    printf("nhap chieu cao cua mot tam giac la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        if (i == 0)
        {
            printf("*");
        }
        else if (i == n - 1)
        {
            for (int j = 0; j < n; j++)
            {
                printf("*");
            }
        }
        else
        {
            printf("*");
            for (int k = 0; k < i - 1; k++)
            {
                printf(".");
            }
            printf("*");
        }

        for (int p = 0; p < n - 1 - i; p++)
        {
            printf(" ");
        }
        printf("\n");
    }
}