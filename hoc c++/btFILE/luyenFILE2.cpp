#include <stdio.h>
#include <stdlib.h>
void nhapmang(int a[], int &n)
{
    printf("nhap so luong phan tu n la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        printf("nhap so phan tu thu %d la ", i);
        scanf("%d", &a[i]);
    }
}
void xuatmang(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    printf("\n");
}
void xuatfile(int a[], int n, char tenfail[50])
{
    FILE *f;
    f = fopen(tenfail, "w");
    if (f == NULL)
    {
        printf("\nfail sai");
        return;
    }
    fprintf(f, "%d\n", n);
    for (int i = 0; i < n; i++)
    {
        fprintf(f, "%d\n", a[i]);
    }
    fclose(f);
}
void docfile(int a[], int n, char tenfail[50], char tenfile[50])
{
    FILE *f1, *f2;
    f1 = fopen(tenfail, "r");
    f2 = fopen(tenfile, "w");
    if (f1 == NULL || f2 == NULL)
    {
        printf("\nfail sai");
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
    fprintf(f2, "%d\n", n);
    for (int i = 0; i < n; i++)
    {
        fprintf(f2, "%d ", a[i]);
    }
    fclose(f1);
    fclose(f2);
}
int main()
{
    int n, a[100];
    nhapmang(a, n);
    xuatmang(a, n);
    xuatfile(a, n, "bai_1.txt");
    docfile(a, n, "bai_1.txt", "bai_1_out.txt");
    return 0;
}