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
void printElementsWithOppositeNeighbor(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        if (a[i] < 0)
        {
            printf("%d ", a[i]);
        }
        else
        {
            if (a[i - 1] + a[i] < a[i] || a[i] + a[i + 1] < a[i])
            {
                printf("%d ", a[i]);
            }
        }
    }
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    printElementsWithOppositeNeighbor(a, n);
    return 0;
}