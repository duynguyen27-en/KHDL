#include <stdio.h>
#include <math.h>
void nhapmang(int a[], int &n)
{
    printf("nhap so luong phan tu n la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        printf("a[%d]", i);
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
void gangt(int a[], int n, int k, int x)
{
    int i;
    for (i = n - 1; i >= x; i--)
    {
        a[i + 1] = a[i];
    }
    a[i + 1] = k;
    n++;
    xuatmang(a, n);
}
int isprime(int n)
{
    if (n < 2)
        return 0;
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (n % i == 0)
        {
            return 0;
        }
    }
    return 1;
}
void snto(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        if (isprime(a[i]))
        {
            printf("%d ", a[i]);
        }
    }
}
int main()
{
    int a[100];
    int n;
    nhapmang(a, n);
    xuatmang(a, n);
    int k, x;
    printf("\ngia tri k va vi tri x la :");
    scanf("%d %d", &k, &x);
    printf("gia tri sau khi gan la :");
    gangt(a, n, k, x);
    printf("\nmang so nguyen to la :");
    snto(a, n);
    return 0;
}