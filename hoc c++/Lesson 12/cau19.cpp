#include <stdio.h>
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
void printElementsNotLessThanPrevious(int a[], int n)
{
    int max = INT_MIN;
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] > max)
        {
            count++;
            max = a[i];
        }
        else
        {
            max = a[i];
        }
    }
    printf("so luong phan tu khong nho hon phan tu truoc no la :%d\n", count);
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    printElementsNotLessThanPrevious(a, n);
    return 0;
}