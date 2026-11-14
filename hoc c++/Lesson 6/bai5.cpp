#include <stdio.h>
int main()
{
    int n;
    printf("nhap so cot cua nua hinh tron la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        for (int j = n - 1 - i; j < n; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    for (int l = 0; l < n; l++)
    {
        for (int k = n - 1 - l; k > 0; k--)
        {
            printf("*");
        }
        printf("\n");
    }
}