#include <stdio.h>
void nhapmang(int a[], int &n)
{
    printf("nhap so luong phan tu la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        printf("nhap so phan tu thu %d la :", i);
        scanf("%d", &a[i]);
    }
}
void xuatmang(int a[], int n)
{
    printf("mang vua moi nhap la :");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    printf("\n");
}
void xoamax(int a[], int n)
{
    int max = a[0];
    for (int i = 1; i < n; i++)
    {
        if (a[i] > max)
        {
            max = a[i];
        }
    }
    int vt = 0;

    for (int j = 0; j < n; j++)
    {
        if (a[j] != max)
        {
            a[vt] = a[j];
            vt++;
        }
    }
    n = vt;
    xuatmang(a, n);
}
void chensaumax(int a[], int n, int x)
{
    int vt = 0;
    int max = a[0];
    for (int i = 1; i < n; i++)
    {
        if (a[i] > max)
        {
            max = a[i];
            vt = i;
        }
    }
    for (int j = n - 1; j >= 0 && a[j] != max; j--)
    {
        a[j + 1] = a[j];
    }
    a[vt + 1] = x;
    n++;
    xuatmang(a, n);
}
void daomang(int a[], int n)
{
    for (int i = n - 1; i >= 0; i--)
    {
        printf("%d ", a[i]);
    }
}
void xuatmangtang(int a[], int n)
{
    int vt = 0;
    int end = 0;
    int sl = 1;
    int count = 0;
    int stated = 0;
    for (int i = 0; i < n - 1; i++)
    {
        if (a[i] < a[i + 1])
        {
            sl++;
        }
        else
        {
            if (sl > count)
            {
                vt = stated;
                end = i;
            }
            stated = i + 1;
        }
    }
    printf("day con tang dan co do dai lon nhat la :");
    for (int j = vt; j <= end; j++)
    {
        printf("%d ", a[j]);
    }
}

void kiemtravuong(int a[], int n)
{
    int found = 0;

    for (int i = 0; i < n - 2; i++)
    {
        int x = a[i];
        int y = a[i + 1];
        int z = a[i + 2];

        // sắp xếp 3 số (đơn giản)
        if (x > y)
        {
            int t = x;
            x = y;
            y = t;
        }
        if (y > z)
        {
            int t = y;
            y = z;
            z = t;
        }
        if (x > y)
        {
            int t = x;
            x = y;
            y = t;
        }
        if (x * x + y * y == z * z)
        {
            printf("Bo (%d, %d, %d) la tam giac vuong\n", a[i], a[i + 1], a[i + 2]);
            found = 1;
        }
    }

    if (!found)
    {
        printf("Khong co bo nao la tam giac vuong\n");
    }
}

int main()
{
    int n;
    int a[100];
    nhapmang(a, n);
    xuatmang(a, n);
    // xoamax(a, n);
    int x;
    // printf("nhap gia tri x :");
    // scanf("%d", &x);
    // chensaumax(a, n, x);
    // printf("mang dao nguoc la :");
    // daomang(a, n);

    kiemtravuong(a, n);
    return 0;
}