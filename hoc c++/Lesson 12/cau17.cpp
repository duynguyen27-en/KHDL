#include <stdio.h>
#include <math.h>
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
int check(int n)
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
int isprime(int a[], int n)
{
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        if (check(a[i]))
        {
            sum++;
        }
    }
    return sum;
}
int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    printf("so luong so nguyen to trong mang la: %d\n", isprime(a, n));
    return 0;
}