#include <stdio.h>
#include <math.h>
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
int check(int n)
{
    int temp = n;
    int k = sqrt(temp);
    return k * k == n;
}
int sumPerfectSquares(int a[], int n)
{
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        if (check(a[i]))
        {
            sum += a[i];
        }
    }
    return sum;
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    printf("tong cac so chinh phuong la :%d\n", sumPerfectSquares(a, n));
    return 0;
}