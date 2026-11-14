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
        else
        {
            for (int j = 0; j < i + 1; j++)
            {
                printf("*");
            }
        }
        for (int k = 0; k < n - i - 1; k++)
        {
            printf(" ");
        }
        printf("\n");
    }
}