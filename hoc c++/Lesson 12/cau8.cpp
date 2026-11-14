#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
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
void findFarthestFromX(int a[], int n, int x)
{
    int max = INT_MIN;
    int val = a[0];
    for (int i = 0; i < n; i++)
    {
        if (abs(a[i] - x) > max)
        {
            max = abs(a[i] - x);
            val = a[i];
        }
    }
    printf("gia tri xa x nhat la :%d\n", val);
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    int x;
    printf("nhap gia tri x :");
    scanf("%d", &x);
    findFarthestFromX(a, n, x);
    return 0;
}