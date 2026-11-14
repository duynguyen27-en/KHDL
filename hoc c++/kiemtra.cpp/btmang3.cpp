#include <stdio.h>
// kiểm tra số nguyên tố
int check(int a[], int n, int x)
{
    for (int i = 0; i < n; i++)
    {
        if (a[i] == x)
        {
            return 1;
        }
    }
    return 0;
}

void inputArray(int a[], int &n)
{
    printf("nhap so luong phan tu n la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        do
        {
            printf("nhap so phan tu thu %d la :", i);
            scanf("%d", &a[i]);
            if (check(a, i, a[i]))
            {
                printf("nhap lai\n");
            }
        } while (check(a, i, a[i]));
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
// tính tổng các dãy giảm dần
void sumDescendingSeries(int a[], int n)
{
    int sum = a[0];
    for (int i = 1; i < n; i++)
    {
        if (a[i - 1] > a[i])
        {
            sum += a[i];
        }
        else
        {

            printf("tong day giam la :%d\n", sum);
            sum = a[i];
        }
    }
    printf("tong day giam la :%d\n", sum);
}
// chỉ ra số hạng lớn thứ k có trong mảng
void printKthLargest(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (a[i] < a[j])
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    printf("mang sap xep giam dan la :");
    outputArray(a, n);
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    printKthLargest(a, n);
    int k;
    printf("nhap so k :");
    scanf("%d", &k);
    for (int i = 0; i < n; i++)
    {
        if (k == i)
        {
            printf("ket qua la :%d", a[i]);
        }
    }
    return 0;
}