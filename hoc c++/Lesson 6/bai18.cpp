#include <stdio.h>
int main()
{
    int n;
    printf("nhap chieu cao cua mot tam giac la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            printf(" ");
        }
        if (i == 0)
        {
            printf("*");
        }
        else if (i == n - 1)
        {
            for (int k = 0; k < n; k++)
            {
                printf("*");
            }
        }
        else
        {
            printf("*");
            for (int l = 0; l < i - 1; l++)
            {
                printf(".");
            }
            printf("*");
        }
        printf("\n");
    }
}