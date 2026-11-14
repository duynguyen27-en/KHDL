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
int countAndPrintPalindrome(int n)
{
    int sum = 0;
    int temp = n;
    while (temp > 0)
    {
        int digit = temp % 10;
        sum = sum * 10 + digit;
        temp /= 10;
    }
    return sum == n;
}

int main()
{
    int n;
    long long a[100];
    inputArray(a, n);
    outputArray(a, n);
    int count = 0;
    long long b[100];
    for (int i = 0; i < n; i++)
    {
        if (countAndPrintPalindrome(a[i]))
        {
            b[count] = a[i];
            count++;
        }
    }
    printf("so luong so thuan nghich la :%d\n", count);
    printf("cac so thuan nghich la :\n");
    for (int j = 0; j < count; j++)
    {
        printf("%lld ", b[j]);
    }
    return 0;
}