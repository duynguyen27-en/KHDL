#include <stdio.h>
#include <math.h>
void nhapmang(int a[], int &n)
{
    printf("nhap so luong phan tu la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        do
        {
            printf("nhap so phan tu thu %d la :", i);
            scanf("%d", &a[i]);
            if (n < 0)
            {
                printf("nhap lai\n");
            }
        } while (n < 0);
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
// hiện thị ra các số nguyên tố có trong mảng
void printPrimeNumbers(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        if (isprime(a[i]) == 1)
        {
            printf("%d ", a[i]);
        }
    }
}
// kiểm tra và tăng 5 vào các số chẵn có trong mảng
void addFiveIfEven(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        if (a[i] % 2 == 0)
        {
            a[i] = a[i] + 5;
        }
    }
    xuatmang(a, n);
}
// chèn 99 ngay sau các số lẻ có trong mảng
void insert99AfterOdd(int a[], int n, int x)
{
    int vt = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] % 2 != 0)
        {
            vt = i;
            int j;
            for (j = n - 1; j >= 0 && j > vt; j--)
            {
                a[j + 1] = a[j];
            }
            a[j + 1] = x;
            n++;
            i += 1;
        }
    }
    xuatmang(a, n);
}
// kiểm tra số hoàn hảo
int cheakhh(int n)
{
    int tamp = n;
    int sum = 0;
    for (int i = 1; i <= tamp / 2; i++)
    {
        if (tamp % i == 0)
        {
            sum += i;
        }
    }
    return n == sum;
}
void isPerfectNumber(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        if (cheakhh(a[i]))
        {
            printf("%d ", a[i]);
        }
    }
}
// void chuyenmang(int a[], int n, int b[], int c[])
// {
// int bb = 0;
// int cc = 0;
// for (int i = 0; i < n; i++)
// {
//     if (a[i] % 2 == 0)
//     {
//         b[bb] = a[i];
//         bb++;
//     }
//     else
//     {
//         c[cc] = a[i];
//         cc++;
//     }
// }
// }
// tính tổng 2 mảng b và c rồi lưu vào mảng d
void sumBAndC(int b[], int bb, int c[], int cc, int d[])
{
    int tamp = 0;
    if (bb > cc)
    {
        tamp = bb;
    }
    else
    {
        tamp = cc;
    }
    for (int i = 0; i < tamp; i++)
    {
        d[i] = b[i] + c[i];
    }
    xuatmang(d, tamp);
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
    // printf("so nguyen to co trong mang la :\n");
    // printPrimeNumbers(a, n);
    // printf("\nmang vua moi tang 5 vao so chan la :\n");
    // addFiveIfEven(a, n);
    int x;
    printf("nhap gia tri x la :\n");
    scanf("%d", &x);
    printf("\nchen 99 ngay sau gia tri le la :\n");
    insert99AfterOdd(a, n, x);
    // printf("so hoan hao trong mang la :");
    // isPerfectNumber(a, n);
    // int bb = 0;
    // int cc = 0;
    // for (int i = 0; i < n; i++)
    // {
    //     if (a[i] % 2 == 0)
    //     {
    //         b[bb] = a[i];
    //         bb++;
    //     }
    //     else
    //     {
    //         c[cc] = a[i];
    //         cc++;
    //     }
    // }
    // printf("mang b la :\n");
    // xuatmang(b, bb);
    // printf("mang c la :\n");
    // xuatmang(c, cc);
    // printf("tong 2 mang vua nhap la :\n");
    // sumBAndC(b, bb, c, cc, d);
    return 0;
}