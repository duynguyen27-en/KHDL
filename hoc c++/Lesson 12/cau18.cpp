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
    int count = 0;
    for (int i = 1; i <= n; i++)
    {
        if ((n % i) == 0)
        {
            count++;
        }
    }
    return count % 2 != 0;
}
void countNumbersWithAllOddDivisors(int a[], int n)
{
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (check(a[i]))
        {
            count++;
        }
    }
    printf("so luong so co tat ca uoc la so le la: %d\n", count);
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    countNumbersWithAllOddDivisors(a, n);
    return 0;
}