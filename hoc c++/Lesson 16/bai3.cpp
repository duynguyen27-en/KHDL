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
void isNotLessThanPrevious(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        if (i == 0)
        {
            printf("%d ", a[i]);
        }
        else if (a[i] < a[i - 1])
        {
            printf("%d ", a[i]);
        }
    }
}

int main()
{
    int n;
    int a[100];
    nhapmang(a, n);
    xuatmang(a, n);
    printf("\nmang moi la :");
    isNotLessThanPrevious(a, n);
    return 0;
}