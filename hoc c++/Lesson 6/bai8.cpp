#include <stdio.h>
int main()
{
    int n;
    printf("nhap vao chieu cao cua mot tam giac la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < i; j++)
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
            printf("*");
            for (int l = 0; l < n - i - 2; l++)
            {
                printf(".");
            }
            printf("*");
        }

        printf("\n");
    }
}