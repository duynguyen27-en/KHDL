#include <stdio.h>
#include <limits.h>
void inputArray(int a[], int &n)
{
    printf("nhap so luong phan tu n la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        printf("nhap phan tu thu %d la :", i);
        scanf("%d", &a[i]);
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
void findMinPositivePosition(int a[], int n)
{
    int k = 0;
    int min = INT_MAX;
    for (int i = 0; i < n; i++)
    {
        if (a[i] > 0 && a[i] < min)
        {
            min = a[i];
            k = i;
        }
    }
    printf("vi tri so duong nho nhat la :%d\n", k + 1);
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    findMinPositivePosition(a, n);
    return 0;
}