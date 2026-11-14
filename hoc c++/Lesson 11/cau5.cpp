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
void printAverage(long long a[], int n)
{
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] > 0)
        {
            sum += a[i];
        }
    }
    printf("gia tri trung binh cua cac so trong mang la :%.2f", (float)sum / n);
}

int main()
{
    int n;
    long long a[100];
    inputArray(a, n);
    outputArray(a, n);
    printAverage(a, n);
    return 0;
}