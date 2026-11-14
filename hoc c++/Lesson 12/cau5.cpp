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
int isBeautifulNumber(int n)
{
    int count1 = 0, count2 = 0;
    while (n > 0)
    {
        int digit = n % 10;
        if (digit == 1)
            count1 = 1;
        if (digit == 9)
            count2 = 1;
        if (count1 == 1 && count2 == 1)
        {
            return 1;
        }
        n /= 10;
    }
    return 0;
}

int countBeautifulNumbers(int a[], int n)
{
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (isBeautifulNumber(a[i]))
        {
            count++;
        }
    }
    return count;
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    printf("so luong so dep la: %d\n", countBeautifulNumbers(a, n));
    return 0;
}