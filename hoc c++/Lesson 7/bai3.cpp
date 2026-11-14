#include <stdio.h>
void printRectangleThree(int n)
{
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

int main()
{
    int n;
    printf("nhap so n la:");
    scanf("%d", &n);
    printRectangleThree(n);
    return 0;
}