#include <stdio.h>
void printRectangleOne(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (i + j == 0)
            {
                printf("1");
            }
            else if ((i + j) % 2 != 0)
            {
                printf("0");
            }
            else if ((i + j) % 2 == 0)
            {
                printf("1");
            }
        }
        printf("\n");
    }
}

int main()
{
    int n;
    printf("nhap so n la :");
    scanf("%d", &n);
    printf(" hinh chu nhat la :\n");
    printRectangleOne(n);
    return 0;
}