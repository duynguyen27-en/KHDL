#include <stdio.h>
#include <string.h>
void nhapmang(int a[], int &n)
{
    printf("nhap so luong phan tu n la :");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++)
    {
        printf("a[%d]=", i);
        scanf("%d", &a[i]);
    }
}
void xuatmang(int a[], int n)
{
    for (int i = 1; i <= n; i++)
    {
        printf("%d ", a[i]);
    }
}
void sumchan(int a[], int n)
{
    int sum = 0;
    for (int i = 1; i <= n; i++)
    {
        if (i % 2 == 0)
        {
            sum += a[i];
        }
    }
    printf("\ntong so o vi tri chan la :%d", sum);
}
void giamd(int a[], int n)
{
    for (int i = 1; i <= n - 1; i++)
    {
        for (int j = i + 1; j <= n; j++)
        {
            if (a[i] < a[j])
            {
                int tamp = a[i];
                a[i] = a[j];
                a[j] = tamp;
            }
        }
    }
    printf("\nmang sau khi sap xep giam dan la :");
    xuatmang(a, n);
}
void maxk(int a[], int n, int k)
{
    for (int i = 1; i <= n; i++)
    {
        if (i == k)
        {
            printf("%d", a[i]);
        }
    }
}
void nhpkt(char c[], char kt)
{
    int sum = 0;
    if (kt >= 'A' && kt <= 'Z')
    {
        kt += 32;
    }

    for (int i = 0; c[i] != '\0'; i++)
    {
        char temp = c[i];
        if (temp >= 'A' && temp <= 'Z')
        {
            temp += 32;
        }
        if (temp == kt)
        {
            sum++;
        }
    }
    printf("hien thi :%d", sum);
}
void xoaxuongdong(char c[])
{
    size_t len = strlen(c);
    if (c[len - 1] == '\n')
    {
        c[len - 1] = '\0';
    }
}
void catchuoi(char c[])
{
    size_t len = strlen(c);
    int vt = -1;
    for (int i = 0; i < len; i++)
    {
        if (c[i] == ' ')
        {
            vt = i;
            break;
        }
    }
    if (vt == -1)
    {
        printf("ho lot la : ");
        printf("\nten la :%s", c);
        return;
    }
    printf("ho lot la :");
    for (int i = 0; i < vt; i++)
    {
        printf("%c", c[i]);
    }
    printf("\nten la :");
    for (int i = vt + 1; i < len; i++)
    {
        printf("%c", c[i]);
    }
}
int main()
{
    int n;
    int a[100];
    // nhapmang(a, n);
    // xuatmang(a, n);
    // sumchan(a, n);
    // giamd(a, n);
    // int k;
    // printf("\nvi tri thu k la :");
    // scanf("%d", &k);
    // printf("gia tri lon thu k la :");
    // maxk(a, n, k);
    char c[100];
    printf("\nnhap chuoi :");
    fgets(c, 100, stdin);
    xoaxuongdong(c);
    // char kt;
    // printf("\nnhap ki tu la :");
    // scanf(" %c", &kt);
    // nhpkt(c, kt);
    catchuoi(c);
    return 0;
}