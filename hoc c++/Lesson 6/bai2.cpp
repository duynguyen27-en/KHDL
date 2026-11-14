#include <stdio.h>
void inputArray(int a[][100], int &n, int &m)
{
    printf("nhap so luong hang va cot la :");
    scanf("%d%d", &n, &m);
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            printf("nhap gia tri phan tu o hang %d va cot %d la :", i, j);
            scanf("%d", &a[i][j]);
        }
    }
}
void outputArray(int a[][100], int n, int m)
{
    printf("mang 2 chieu vua nhap la :\n");
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }
}
int main()
{
    int n, m, a[100][100];
    inputArray(a, n, m);
    outputArray(a, n, m);
    return 0;
}