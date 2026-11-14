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
void printMaxAndSecondMax(int a[], int n)
{
    int max1 = a[0];
    int max2 = a[0];
    for (int i = 0; i < n; i++)
    {
        if (a[i] >= max1)
        {
            int tamp = max1;
            max1 = a[i];
            max2 = tamp;
        }
    }
    if (max1 == max2)
    {
        printf("%d", max1);
    }
    else
    {
        printf("%d %d", max1, max2);
    }
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    printMaxAndSecondMax(a, n);
    return 0;
}