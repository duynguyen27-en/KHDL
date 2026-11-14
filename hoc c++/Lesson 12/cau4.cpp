#include <stdio.h>
#include <limits.h>
void inputArray(int a[], int &n)
{
    do
    {
        printf("nhap so luong phan tu n la :");
        scanf("%d", &n);
        if (n < 2)
        {
            printf("vui long nhap n>=2:\n");
        }
    } while (n < 2);
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
void findMaxAndSecondMax(int a[], int n)
{
    int max1 = 0, max2 = 0;
    if (a[0] > a[1])
    {
        max1 = a[0];
        max2 = a[1];
    }
    else
    {
        max1 = a[1];
        max2 = a[0];
    }
    for (int i = 0; i < n; i++)
    {
        if (a[i] > max1)
        {
            int tamp = max1;
            max2 = tamp;
            max1 = a[i];
        }
        else if (a[i] > max2 && a[i] <= max1)
        {
            int tamp1 = max2;
            max2 = tamp1;
        }
        else
        {
            max2 = -1;
        }
    }
    printf("so lon nhat la: %d\n, so lon thu hai la: %d\n", max1, max2);
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    findMaxAndSecondMax(a, n);
    return 0;
}