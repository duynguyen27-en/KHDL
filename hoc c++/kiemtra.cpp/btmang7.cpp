#include <stdio.h>
void inputArray(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("nhap so phan tu thu %d la :", i);
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
void averageSumOfIncreasingSequences(int a[], int n)
{
    int k = 0;
    int sum = a[0];
    int count = 0;
    for (int i = 1; i < n; i++)
    {
        if (a[i - 1] < a[i])
        {
            sum += a[i];
        }
        else
        {
            k += sum;
            count++;
            sum = a[i];
        }
    }
    printf("trung binh cong cac mang giam dan la :%d", k / count);
}

int main()
{
    int n;
    int a[100];
    printf("nhap so luong phan tu la :");
    scanf("%d", &n);
    inputArray(a, n);
    outputArray(a, n);

    averageSumOfIncreasingSequences(a, n);
    return 0;
}
