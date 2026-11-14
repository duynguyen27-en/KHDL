#include <stdio.h>
void inputArray(int a[], int &n)
{
    printf("nhap so luong phan tu la :");
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
int sochan(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        if (a[i] % 2 != 0)
        {
            return 0;
        }
    }
    return 1;
}
void inratrungbinh(int a[], int n)
{
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += a[i];
    }
    float count = (float)sum / n;
    printf("\ngia tri trung binh cua mang la :%.2f", count);
    for (int i = 0; i < n; i++)
    {
        if (a[i] < count)
        {
            a[i] += count;
        }
    }
    printf("\nmang sau khi cong them la :");
    outputArray(a, n);
}
void xoasonho(int a[], int n, int x)
{
    for (int i = 0; i < n - 1; i++)
    {
        if (a[i] < x)
        {
            for (int j = i + 1; j < n; j++)
            {
                a[i] = a[j];
            }
            n--;
            i--;
        }
    }
    outputArray(a, n);
}
void cucdai(int a[], int n, int x)
{
    int vt = 0;
    int sl = 0;
    for (int i = 0; i < n; i += 3)
    {
        if (a[i + 1] > a[i] && a[i + 1] > a[i + 2])
        {
            vt = i;
            sl++;
            if (sl <= 2)
            {
                int j;
                for (j = n - 1; j >= 0 && j != vt; j--)
                {
                    a[j + 1] = a[j];
                }
                a[j + 1] = x;
                n++;
            }
        }
    }
    outputArray(a, n);
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    if (sochan(a, n))
    {
        printf("mang toan so chan");
    }
    else
    {
        printf("mang k toan so chan");
    }
    int x;
    printf("\nnhap gia tri x la :");
    scanf("%d", &x);
    //	xoasonho(a,n,x);
    cucdai(a, n, x);
    return 0;
}