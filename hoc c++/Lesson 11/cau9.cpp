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
void findMinMaxAndPositions(int a[], int n)
{
    int max = a[0];
    int tamp1 = 0;
    int min = a[0];
    int tamp2 = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] >= max)
        {
            max = a[i];
            tamp1 = i + 1;
        }
        else if (a[i] <= min)
        {
            min = a[i];
            tamp2 = i + 1;
        }
    }
    printf("so lon nhat va vi tri cua no la :%d %d\n", max, tamp1);
    printf("so nho nhat va vi tri cua no la :%d %d\n", min, tamp2);
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    findMinMaxAndPositions(a, n);
}