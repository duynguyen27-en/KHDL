#include <stdio.h>
int main()
{
    int n;
    printf("nhap chieu cao cua mot tam giac la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        if (i > 0)
        {
            for (int j = n - i; j < n; j++)
            {
                printf(" ");
            }
        }
        for (int j = i; j < n; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}