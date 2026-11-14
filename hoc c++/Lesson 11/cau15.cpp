#include <stdio.h>
void inputArray(int a[], int &n)
{
    printf("nhap so luong phan tu n la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        do
        {
            printf("nhap phan tu thu %d la :", i);
            scanf("%d", &a[i]);
            if (a[i] < 0)
            {
                printf("nhap lai\n");
            }
        } while (a[i] < 0);
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
int cheak(int a[], int n, int x)
{
    for (int i = 0; i < n; i++)
    {
        if (a[i] % x != 0)
        {
            return 0;
        }
    }
    return 1;
}
void printArray(int a[], int n)
{
    int max = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] > max)
        {
            max = a[i];
        }
    }
    int count = 1;
    for (int i = 1; i <= max; i++)
    {
        if (cheak(a, n, i) == 1)
        {
            count = i;
        }
    }
    printf("uoc chung lon nhat cua ca phan tu la :%d\n", count);
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    printArray(a, n);
}