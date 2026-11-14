#include <stdio.h>
int main()
{
    int n;
    printf("chieu cao cua hinh binh hanh la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        if (i == 0 || i == 3 || i == 4)
        {
            for (int j = i; j < n; j++)
            {
                printf("*");
            }
        }
        else
        {
            printf("*");
            for (int j = i; j < n - 2; j++)
            {
                printf(".");
            }
            printf("*");
        }
        printf("\n");
    }
}