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
void printTop3Max(int a[], int n)
{
    int max1 = INT_MIN, max2 = INT_MIN, max3 = INT_MIN;

    for (int i = 0; i < n; i++)
    {
        if (a[i] > max1)
        {
            int tamp = max2;
            max2 = max1;
            max3 = tamp;
            max1 = a[i];
        }
        else if (a[i] > max2 && a[i] < max1)
        {
            int tamp1 = max2;
            max3 = tamp1;
            max2 = a[i];
        }
        else if (a[i] > max3 && a[i] < max2)
        {
            max3 = a[i];
        }
    }
    printf("3 so lon nhat la :%d %d %d\n", max1, max2, max3);
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    printTop3Max(a, n);
    return 0;
}