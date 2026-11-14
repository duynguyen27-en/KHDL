#include <stdio.h>
void inputArray(int a[], int n, int b[], int k)
{

    for (int i = 0; i < n; i++)
    {
        printf("nhap so phan tu thu %d cua mang A la :", i);
        scanf("%d", &a[i]);
    }
    for (int j = 0; j < k; j++)
    {
        printf("nhap so phan tu thu %d cua mang B la :", j);
        scanf("%d", &b[j]);
    }
}
void outputArray(int a[], int n, int b[], int k)
{
    printf("mang A vua moi nhap la :");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    printf("\nmang B vua moi nhap la :");
    for (int j = 0; j < k; j++)
    {
        printf("%d ", b[j]);
    }

    printf("\n");
}
//  Cho 2 dãy A, B các số nguyên (kích thước dãy A nhỏ hơn dãy B). Hãy kiểm tra xem A có phải là con của B hay không?
int isSubarray(int a[], int n, int b[], int k)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < k; j++)
        {
            if (a[i] != a[j])
            {
                return 0;
            }
        }
    }
    return 1;
}

int main()
{
    int n, k;
    int a[100], b[100];
    printf("nhap so luong phan tu n la :");
    scanf("%d", &n);
    printf("nhap so luong phan tu k la :");
    scanf("%d", &k);
    inputArray(a, n, b, k);
    outputArray(a, n, b, k);
    if (isSubarray(a, n, b, k) == 1)
    {
        printf("A la tap con cua B");
    }
    else
    {
        printf("A khong la tap con cua B");
    }
    return 0;
}