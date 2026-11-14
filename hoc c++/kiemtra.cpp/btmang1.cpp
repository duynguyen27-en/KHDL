#include <stdio.h>
#include <math.h>
void nhapmang(int a[], int &n)
{
    printf("nhap so luong phan tu :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        printf("nhap phan tu thu %d:", i + 1);
        scanf("%d", &a[i]);
    }
}
void xuatmang(int a[], int n)
{
    printf("mang vua nhap la :");
    for (int i = 0; i < n; i++)
        printf("%d ", a[i]);

    printf("\n");
}
int tangdan(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
        if (a[i] >= a[i + 1])
        {
            return 0;
        }
    return 1;
}
int giamdan(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
        if (a[i] <= a[i + 1])
        {
            return 0;
        }
    return 1;
}
int sochan(int a[], int n)
{
    for (int i = 0; i < n; i++)
        if (a[i] % 2 != 0)
        {
            return 0;
        }
    return 1;
}
int songuyento(int a[], int n)
{
    if (n < 2)
        return 0;
    for (int i = 2; i <= sqrt(a[i]); i++)
    {
        if (a[i] % i == 0)
        {
            return 0;
        }
    }
    return 1;
}
void sapxeptang(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i - 1; j < i; j--)
        {
            if (a[j] < a[j - 1])
            {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
            }
        }
    }
}
void in(int a[], int n)
{
    for (int i = 0; i < n; i++)
        printf("%d ", a[i]);
}

int main()
{
    int n;
    int a[100];
    nhapmang(a, n);
    xuatmang(a, n);

    sapxeptang(a, n);
    in(a, n);
    return 0;
}