#include <stdio.h>
#include <math.h>
void inputArray(int a[], int &n)
{
    printf("nhap so luong phan tu n :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        printf("nhap phan tu thu %d :", i);
        scanf("%d", &a[i]);
    }
}
// kiểm tra số nguyên tố
bool isprime(int n)
{
    if (n < 2)
        return false;
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (n % i == 0)
            return false;
    }
    return true;
}

void outputArray(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    printf("\n");
}
// ham copy mang a sang mang b
void copyArray(int a[], int n, int b[])
{
    for (int i = 0; i < n; i++)
    {
        b[i] = a[i];
    }
    printf("mang chuyen sang mang b la :");
    outputArray(b, n);
}
// ham trich xuat cac so nguyen to tu mang a sang mang b
void extractPrimesToArrayB(int a[], int n, int b[])
{
    int j = 0;
    for (int i = 0; i < n; i++)
    {
        if (isprime(a[i]))
        {
            b[j] = a[i];
            j++;
        }
    }
    printf("mang chua cac so nguyen to la :");
    outputArray(b, j);
}
// ham tach cac so nguyen duong va cac so khac tu mang a sang mang c va d
void splitPositiveAndOthers(int a[], int n, int c[], int d[])
{
    int j = 0;
    int k = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] > 0)
        {
            c[j] = a[i];
            j++;
        }
        else
        {
            d[k] = a[i];
            k++;
        }
    }
    printf("mang chua so nguyen duong la:");
    outputArray(c, j);
    printf("mang chua cac so khac la:");
    outputArray(d, k);
}
int isDecreasing(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        if (a[i] <= a[i + 1])
        {
            return 0;
        }
    }
    return 1;
}
// sắp xếp mảng sau sao cho số dương giảm dần,kể cả số âm và số 0sau cùng
void sortDescending(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (a[i] > 0 && a[j] > 0 && a[i] < a[j] || a[i] < 0 && a[j] < 0 && a[i] > a[j] || a[i] < 0 && a[j] > 0 || a[i] == 0 && a[j] != 0)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    printf("mang sau khi sap xep giam dan la :");
    outputArray(a, n);
}

int main()
{
    int n;
    int a[100];
    int b[100];
    int c[100];
    int d[100];
    inputArray(a, n);
    printf("mang vua nhap la :");
    outputArray(a, n);
    sortDescending(a, n);
    return 0;
}