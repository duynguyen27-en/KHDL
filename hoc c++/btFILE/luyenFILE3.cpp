#include <stdio.h>
#include <math.h>
void nhapmang(int a[], int &n)
{
    printf("nhap so luong phan tu n la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        printf("nhap phan tu thu %d la :", i);
        scanf("%d", &a[i]);
    }
}
void xuatmang(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
}
void napfile(int a[], int n, char tenfale[50])
{
    FILE *f;
    f = fopen(tenfale, "w");
    if (f == NULL)
    {
        printf("\nloi file");
        return;
    }
    fprintf(f, "%d\n", n);
    for (int i = 0; i < n; i++)
    {
        fprintf(f, "%d ", a[i]);
    }
    printf("\nnap mang thanh cong");
    fclose(f);
}
int isprime(int n)
{
    if (n < 2)
        return 0;
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (n % i == 0)
        {
            return 0;
        }
    }
    return 1;
}
void sntfail(int a[], int b[], int n, char tenfile[50], char tenfale[50])
{
    int bb = 0;
    FILE *f1, *f2;
    f1 = fopen(tenfile, "r");
    f2 = fopen(tenfale, "w");
    if (f1 == NULL || f2 == NULL)
    {
        printf("\nloi fail");
        return;
    }
    fscanf(f1, "%d", &n);
    for (int i = 0; i < n; i++)
    {
        fscanf(f1, "%d", &a[i]);
    }
    for (int i = 0; i < n; i++)
    {
        if (isprime(a[i]))
        {
            b[bb] = a[i];
            bb++;
        }
    }
    fprintf(f2, "yeu cau 2 :");
    fprintf(f2, "\nso luong phan tu la :");
    fprintf(f2, "%d", bb);
    fprintf(f2, "\nmang so nguyen to la :");
    for (int i = 0; i < bb; i++)
    {
        fprintf(f2, "%d ", b[i]);
    }
    fclose(f1);
    fclose(f2);
}
void mangtang(int a[], int n, char tenfile[50], char tenfale[50])
{
    FILE *f1, *f2;
    f1 = fopen(tenfile, "r");
    f2 = fopen(tenfale, "a");
    if (f1 == NULL || f2 == NULL)
    {
        printf("\nloi file");
        return;
    }
    fscanf(f1, "%d", &n);
    for (int i = 0; i < n; i++)
    {
        fscanf(f1, "%d", &a[i]);
    }
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (a[i] > a[j])
            {
                int tamp = a[i];
                a[i] = a[j];
                a[j] = tamp;
            }
        }
    }
    fprintf(f2, "\nyeu cau 3 :");
    fprintf(f2, "\nso luong phan tu la :");
    fprintf(f2, "%d", n);
    fprintf(f2, "\nmang tang dan la :");

    for (int i = 0; i < n; i++)
    {
        fprintf(f2, "%d ", a[i]);
    }
    fclose(f1);
    fclose(f2);
}
void xoasnt(int a[], int n, char tenfile[50], char tenfale[50])
{
    FILE *f1, *f2;
    f1 = fopen(tenfile, "r");
    f2 = fopen(tenfale, "a");
    if (f1 == NULL || f2 == NULL)
    {
        printf("\nnhap lai");
        return;
    }
    fscanf(f1, "%d", &n);

    for (int i = 0; i < n; i++)
    {
        fscanf(f1, "%d", &a[i]);
    }
    int vt = 0;
    for (int i = 0; i < n; i++)
    {
        if (isprime(a[i]) == 0)
        {
            vt = i;
            for (int j = vt; j < n - 1; j++)
            {
                a[j] = a[j + 1];
            }
            n--;
        }
    }
    fprintf(f2, "\nyeu cau 4 :");
    fprintf(f2, "\nso luong phan tu la :");
    fprintf(f2, "%d", n);
    fprintf(f2, "\nmang toan so nguyen to la :");
    for (int i = 0; i < n; i++)
    {
        fprintf(f2, "%d ", a[i]);
    }
    fclose(f1);
    fclose(f2);
}
void findLocalExtrema(int a[], int c[], int d[], int n, char tenfile[50], char tenfale[50])
{
    FILE *f1, *f2;
    f1 = fopen(tenfile, "r");
    f2 = fopen(tenfale, "a");
    if (f1 == NULL || f2 == NULL)
    {
        printf("\nloi file");
        return;
    }
    fscanf(f1, "%d", &n);
    for (int i = 0; i < n; i++)
    {
        fscanf(f1, "%d", &a[i]);
    }
    int cc = 0;
    int dd = 0;
    for (int i = 1; i < n - 1; i++)
    {
        if (a[i] > a[i - 1] && a[i] > a[i + 1])
        {
            c[cc] = a[i];
            cc++;
        }
        else if (a[i] < a[i - 1] && a[i] < a[i + 1])
        {
            d[dd] = a[i];
            dd++;
        }
    }
    fprintf(f2, "\nyeu cau 5");
    fprintf(f2, "\nso luong phan tu cuc dai la :%d", cc);
    fprintf(f2, "\nmang so cuc dai la : ");
    for (int i = 0; i < cc; i++)
    {
        fprintf(f2, "%d ", c[i]);
    }
    fprintf(f2, "\nso luong phan tu cuc tieu la :%d", dd);
    fprintf(f2, "\nmang cuc tieu la :");
    for (int i = 0; i < dd; i++)
    {
        fprintf(f2, "%d ", d[i]);
    }
    fclose(f1);
    fclose(f2);
}

int main()
{
    int n;
    int a[100];
    int b[100];
    int c[100];
    int d[100];
    nhapmang(a, n);
    xuatmang(a, n);
    napfile(a, n, "ketqua_out.txt");
    sntfail(a, b, n, "ketqua_out.txt", "ketqua.out.txt");
    mangtang(a, n, "ketqua_out.txt", "ketqua.out.txt");
    xoasnt(a, n, "ketqua_out.txt", "ketqua.out.txt");
    findLocalExtrema(a, c, d, n, "ketqua_out.txt", "ketqua.out.txt");
}