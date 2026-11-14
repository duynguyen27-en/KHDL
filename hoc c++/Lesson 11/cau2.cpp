#include <stdio.h>
#include <math.h>
void inputArray(long long a[], int &n)
{
    printf("nhap so luong phan tu n la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        do
        {
            printf("nhap phan tu thu %d la :", i);
            scanf("%lld", &a[i]);
            if (a[i] < 0)
            {
                printf("nhap lai\n");
            }
        } while (a[i] < 0);
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
int countPrimeNumbers(long long a[], int n)
{
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        if (isprime(a[i]) == 1)
        {
            sum++;
        }
    }
    return sum;
}

int main()
{
    int n;
    long long a[100];
    inputArray(a, n);
    outputArray(a, n);
    printf("so luong so nguyen to trong day la :");
    printf("%d", countPrimeNumbers(a, n));
    return 0;
}