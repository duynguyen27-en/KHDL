#include <stdio.h>
void inputArray(int a[][100], int &n)
{
    printf("nhap so luong phan tu n la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            printf("nhap phan tu hang %d va cot %d la :", i, j);
            scanf("%d", &a[i][j]);
        }
    }
}
void outputArray(int a[][100], int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }
}
void countProblemsSolved(int a[][100], int n)
{
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (a[i][j] + a[i][j + 1] > 1)
            {
                sum++;
                break;
            }
        }
    }
    printf("so luong van de ma 3 ban thuc hien duoc la :%d\n", sum);
}

int main()
{
    int n;
    int a[100][100];
    inputArray(a, n);
    outputArray(a, n);
    countProblemsSolved(a, n);
}