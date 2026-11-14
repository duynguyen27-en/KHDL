#include <stdio.h>
#include <limits.h>
int cheak(int a[], int n, int x)
{
    for (int i = 0; i < n; i++)
    {
        if (a[i] == x)
        {
            return 1;
        }
    }
    return 0;
}
void inputArray(int a[], int &n)
{
    do
    {
        printf("nhap so luong phan tu n la :");
        scanf("%d", &n);
        if (n < 3)
        {
            printf("vui long nhap n>=3:\n");
        }
    } while (n < 3);
    for (int i = 0; i < n; i++)
    {
        do
        {
            printf("nhap phan tu thu %d la :", i);
            scanf("%d", &a[i]);
            if (cheak(a, i, a[i]) == 1)
            {
                printf("vui long nhap lai\n");
            }
        } while (cheak(a, i, a[i]) == 1);
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
void printTop3Min(int a[], int n)
{
    int min1 = INT_MAX, min2 = INT_MAX, min3 = INT_MAX;
    for (int i = 0; i < n; i++)
    {
        if (a[i] < min1)
        {
            min3 = min2;
            min2 = min1;
            min1 = a[i];
        }
        else if (a[i] < min2 && a[i] != min1)
        {
            min3 = min2;
            min2 = a[i];
        }
        else if (a[i] < min3 && a[i] != min2 && a[i] != min1)
        {
            min3 = a[i];
        }
    }
    printf("3 gia tri nho nhat la: %d, %d, %d\n", min3, min2, min1);
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    printTop3Min(a, n);
    return 0;
}