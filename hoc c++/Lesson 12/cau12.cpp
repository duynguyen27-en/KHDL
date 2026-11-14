#include <stdio.h>
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
int check(long long n)
{
    long long temp = n;
    if (temp == 0)
    {
        return 0;
    }
    while (temp > 0)
    {
        if ((temp % 10) % 2 == 0)
        {
            return 0;
        }
        temp /= 10;
    }
    return 1;
}
void isAllDigitsOdd(long long a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        if (check(a[i]))
        {
            printf("%lld ", a[i]);
        }
    }
}

int main()
{
    int n;
    long long a[100];
    inputArray(a, n);
    outputArray(a, n);
    isAllDigitsOdd(a, n);
    return 0;
}