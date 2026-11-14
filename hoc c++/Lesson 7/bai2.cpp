#include <stdio.h>
void printRectangleTwo(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("%d ", i + j + 1);
        }
        printf("\n");
    }
}

int main()
{
    int n;
    printf("nhap so n la :");
    scanf("%d", &n);
    printf("hinh chu nhat 2 la :\n");
    printRectangleTwo(n);
}