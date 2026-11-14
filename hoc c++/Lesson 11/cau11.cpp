#include <stdio.h>
#include <stdlib.h>
int kiemtra(int a[], int n, int x)
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
    printf("nhap so luong phan tu n la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        do
        {
            printf("nhap phan tu thu %d la :", i);
            scanf("%d", &a[i]);
            if (kiemtra(a, i, a[i]))
            {
                printf("nhap lai\n");
            }
        } while (kiemtra(a, i, a[i]));
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
void sortArray(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (a[i] > a[j])
            {
                int tamp = a[i];
                a[i] = a[j];
                a[j] = tamp;
            }
        }
    }
    outputArray(a, n);
}
void findMinMax(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        int mini = 10000000;
        int mixi = 0;
        for (int j = 0; j < n; j++)
        {
            if (i != j)
            {
                int digit = abs(a[i] - a[j]);
                if (digit <= mini)
                {
                    mini = digit;
                }
                if (digit >= mixi)
                {
                    mixi = digit;
                }
            }
        }
        printf("%d %d\n", mini, mixi);
    }
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    sortArray(a, n);

    findMinMax(a, n);
    return 0;
}