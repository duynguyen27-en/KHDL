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
int isPerfectSquare(long long n)
{
    long long temp = n;
    long long check = sqrt(temp);
    return check * check == n;
}

int main()
{
    int n;
    long long a[100];
    inputArray(a, n);
    outputArray(a, n);
    int count = 0;
    long long b[100];
    for (long long i = 0; i < n; i++)
    {
        if (isPerfectSquare(a[i]))
        {
            b[count] = a[i];
            count++;
        }
    }
    printf("so luong so chinh phuong trong mang la :%d\n", count);
    printf("cac so chinh phuong trong mang la :");
    for (long long i = 0; i < count; i++)
    {
        printf("%lld ", b[i]);
    }
    return 0;
}