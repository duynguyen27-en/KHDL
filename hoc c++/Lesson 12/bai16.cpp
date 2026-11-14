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
int isNotIncreasingArray(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        if (a[i] < a[i + 1])
        {
            return 0;
        }
        return 1;
    }
}
int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    if (isNotIncreasingArray(a, n))
    {
        printf("YES\n");
    }
    else
    {
        printf("NO\n");
    }
    return 0;
}