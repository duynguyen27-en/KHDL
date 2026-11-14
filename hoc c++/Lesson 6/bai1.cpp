#include <stdio.h>

int main()
{
    int n, m;
    scanf("%d%d", &n, &m);

    for (int i = 0; i < n; i++)
    {
        // in khoảng trắng
        for (int j = 0; j < i; j++)
        {
            printf(" ");
        }

        // dòng đầu hoặc cuối
        if (i == 0 || i == n - 1)
        {
            for (int j = 0; j < m; j++)
            {
                printf("*");
            }
        }
        else
        {
            printf("*");
            for (int j = 0; j < m - 2; j++)
            {
                printf(".");
            }
            printf("*");
        }

        printf("\n");
    }

    return 0;
}