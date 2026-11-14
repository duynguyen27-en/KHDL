#include <stdio.h>
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
void isFirstDigitOdd(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        int temp = a[i];
        int count = 0;
        while (temp > 0)
        {
            count = count * 10 + temp % 10;
            temp /= 10;
        }
        if ((count % 10) % 2 != 0)
        {
            printf("%d ", a[i]);
        }
    }
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    isFirstDigitOdd(a, n);
    return 0;
}