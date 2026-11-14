#include <stdio.h>
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
            if (a[i] < 0)
            {
                printf("nhap lai\n");
            }
        } while (a[i] < 0);
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

int countAndPrintCoprime(int n, int x)
{
    for (int i = 2; i <= n; i++)
    {
        if (n % i == 0)
        {
            if (x % i == 0)
            {
                return 1;
            }
        }
    }
    return 0;
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    int x;
    printf("nhap x la:");
    do
    {
        scanf("%d", &x);
    } while (x < 0);
    int b[100];
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (countAndPrintCoprime(a[i], x) == 0)
        {
            b[count] = a[i];
            count++;
        }
    }
    printf("so luong so nguyen to cung nhau voi x la :%d\n", count);
    printf("cac so nguyen cung nhau voi x la :");
    for (int i = 0; i < count; i++)
    {
        printf("%d ", b[i]);
    }
    return 0;
}