#include <stdio.h>
int kiemtra(int a[], int n, int x)
{
    for (int i = 0; i < n; i++)
    {
        if (a[i] == x)
        {
            return 1;
        }
    }
    return 0;
}
void inputArray(int a[], int &n)
{
    printf("nhap so luong phan tu n la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        do
        {
            printf("nhap phan tu thu %d la :", i);
            scanf("%d", &a[i]);
            if (kiemtra(a, i, a[i]))
            {
                printf("nhap lai\n");
            }
        } while (kiemtra(a, i, a[i]));
    }
}
void outputArray(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    printf("\n");
}
void printMinAndSecondMinPositions(int a[], int n)
{
    int min1 = a[0];
    int tamp1 = 0;
    int min2 = a[1];
    int tamp2 = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] <= min1)
        {
            min1 = a[i];
            tamp1 = i + 1;
        }
        if (a[i] != min1 && a[i] <= min2)
        {
            min2 = a[i];
            tamp2 = i + 1;
        }
    }
    printf("vi tri cua so nho nhat la :%d\n", tamp1);
    printf("vi tri cua so nho thu 2 la :%d\n", tamp2);
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    printMinAndSecondMinPositions(a, n);
}