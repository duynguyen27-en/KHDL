#include <stdio.h>
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
void findLastEvenPosition(int a[], int n)
{
    int k = -1;
    for (int i = 0; i < n; i++)
    {
        if (a[i] % 2 == 0)
        {
            k = i;
        }
    }
    if (k == -1)
    {
        printf("mang khong ton tai so chan :%d\n", k);
    }
    else
    {
        printf("vi tri so chan cuoi cung la :%d\n", k + 1);
    }
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    findLastEvenPosition(a, n);
    return 0;
}