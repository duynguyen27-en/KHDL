#include <stdio.h>
#include <math.h>
void inputArray(int a[], int n)
{
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
// kiểm tra số nguyên tố
int isprime(int n)
{
    if (n < 2)
        return 0;
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (n % i == 0)
            return 0;
    }
    return 1;
}
// sữa các số nguyên tố trong mảng thành số 0
void replacePrimeWithZero(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        if (isprime(a[i]))
        {
            a[i] = 0;
        }
    }
    printf("mang sau khi kiem tra la :");
    outputArray(a, n);
}
// chen x vao dau mang
void insertAtBeginning(int a[], int n, int x)
{

    for (int i = n; i > 0; i--)
    {
        a[i] = a[i - 1];
    }
    a[0] = x;
    n++;
    printf("mang sau khi them x vao dau mang :");
    outputArray(a, n);
}
// chen x vao cuoi mang
void insertAtEnd(int a[], int n, int x)
{
    a[n] = x;
    n++;
    printf("mang sau khi them x vao dau mang :");
    outputArray(a, n);
}
// sắp xếp tăng dần
void tangdan(int a[], int n)
{
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
}
// chèn giá trị x vào mảng tăng dần,sao cho sau khi chèn mảng  vẩn tăng
void chen(int a[], int n, int x)
{
    int i;
    for (i = n - 1; i >= 0 && a[i] > x; i--)
    {
        a[i + 1] = a[i];
    }
    a[i + 1] = x;
}
// cập nhật giá trị 0 vào đàng sau số nguyên tố
void setToZero(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        if (isprime(a[i]))
        {
            a[i + 1] = 0;
            break;
        }
    }
    outputArray(a, n);
}
// hàm xóa một phân tử tong mảng
void removeFirstAndLast(int a[], int &n, int vt)
{

    if (vt >= 0 && vt < n)
    {
        for (int i = vt; i < n - 1; i++)
        {
            a[i] = a[i + 1];
        }
        n--;
    }
    outputArray(a, n);
}
// xóa phân tử đầu và cuối mảng và int ra
void removeFirstAndLast(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        a[i] = a[i + 1];
    }
    n--;
    n--;
    outputArray(a, n);
}
// xóa tất cả số nguyên tố có trong mảng và in ra mảng
void removePrimeNumbers(int a[], int n)
{

    for (int i = 0; i < n; i++)
    {
        if (isprime(a[i]))
        {
            for (int j = i; j < n - 1; j++)
            {
                a[j] = a[j + 1];
            }
            n--;
            i--;
        }
    }
    outputArray(a, n);
}

int main()
{
    int n;
    int a[100];
    printf("nhap n");
    scanf("%d", &n);
    inputArray(a, n);
    outputArray(a, n);
    removePrimeNumbers(a, n);
    return 0;
}