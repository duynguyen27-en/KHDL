#include <stdio.h>
int main()
{
    int n;
    printf("nhap gia tri n la :");
    scanf("%d", &n);
    int min = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (i > j)
            {
                min = j;
            }
            else
            {
                min = i;
            }
            int val = n - min;
            printf("%d", val);
        }
        printf("\n");
    }
}