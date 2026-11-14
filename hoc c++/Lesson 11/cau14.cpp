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

void findMostFrequentElement(int a[], int n)
{
    int sum = 0;
    int count = 0;
    int tamp = 0;
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (a[i] == a[j] && sum >= count)
            {
                sum++;
                tamp = a[i];
            }
        }
        if (sum > count)
        {
            count = sum;
        }
    }
    printf("so lan xuat hien nhieu nhat va so xuat hien nhieu nhat la :%d %d\n", tamp, count);
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    findMostFrequentElement(a, n);
}