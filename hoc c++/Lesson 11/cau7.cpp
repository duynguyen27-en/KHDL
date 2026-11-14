#include <stdio.h>
#include <stdio.h>
#include <math.h>
void inputArray(long long a[], int &n)
{
    printf("nhap so luong phan tu n la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {

        printf("nhap phan tu thu %d la :", i);
        scanf("%lld", &a[i]);
    }
}
void outputArray(long long a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%lld ", a[i]);
    }
    printf("\n");
}
int countOccurrences(long long a[], int n, long long x)
{
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] == x)
        {
            count++;
        }
    }
    return count;
}

int main()
{
    int n;
    long long a[100];
    inputArray(a, n);
    outputArray(a, n);
    long long x;
    printf("so nguyen x la :");
    scanf("%lld", &x);
    printf("so lan xuat hien cua x trong mang la :%d\n", countOccurrences(a, n, x));
    return 0;
}