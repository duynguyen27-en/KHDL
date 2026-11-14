#include <stdio.h>
void printRectanglefour(int n)
{
    for (int i = 0; i < n; i++)
    {

        for (int j = 0; j < n; j++)
        {
            if (j < n - i - 1)
            {
                printf(" ");
            }
            else
            {
                printf("%d", i + 1);
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
    printRectanglefour(n);
    return 0;
}