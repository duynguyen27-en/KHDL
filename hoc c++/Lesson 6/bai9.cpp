#include <stdio.h>
int main()
{
    int n;
    printf("nhap n la :");
    scanf("%d", &n);
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            sum += 1;
            printf("%d ", sum);
        }
        printf("\n");
    }
}