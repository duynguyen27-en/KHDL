#include <stdio.h>
#include <stdlib.h>
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
int intareConsecutive(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (a[i] != a[j] && abs(a[i] - a[j]) == 1)
            {
                return 1;
            }
        }
    }
    return 0;
}
int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    if (intareConsecutive(a, n))
    {
        printf("YES\n");
    }
    else
    {
        printf("NO\n");
    }
    return 0;
}