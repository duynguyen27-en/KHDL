#include <stdio.h>
int main()
{
    int n, m;
    printf("so hang so cot cua hinh binh hanh la :");
    scanf("%d %d", &n, &m);
    for (int i = 0; i < n; i++)
    {
        for (int k = 0; k < i; k++)
        {
            printf(" ");
        }
        for (int j = 0; j < m; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}