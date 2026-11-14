#include <stdio.h>
int main()
{
    int n, m;
    printf("nhap so hang va so cot la :");
    scanf("%d %d", &n, &m);
    for (int i = 0; i < n; i++)
    {
        if (i == 0 || i % 2 == 0)
        {
            for (int j = 0; j < m; j++)
            {
                printf("1");
            }
        }
        else
        {
            for (int k = 0; k < m; k++)
            {
                printf("0");
            }
        }
        printf("\n");
    }
}
