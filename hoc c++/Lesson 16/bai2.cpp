#include <stdio.h>
void nhapmang(int a[], int &n)
{
    printf("nhap so luong phan tu n la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        printf("[%d]=", i);
        scanf("%d", &a[i]);
    }
}
void xuatmang(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
}
int isAscendingArray(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        if (a[i] >= a[i + 1])
        {
            return 0;
        }
    }
    return 1;
}

int main()
{
    int n;
    int a[100];
    nhapmang(a, n);
    xuatmang(a, n);
    if (isAscendingArray(a, n))
    {
        printf("\nyes");
    }
    else
    {
        printf("\nno");
    }
}