#include <stdio.h>
void inputArray(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("nhap so phan tu thu %d la :", i);
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
// Viết hàm liệt kê các bộ 4 số a, b, c, d trong mảng các số nguyên (có ít nhất 4 phần tử và đôi một khác nhau) sao cho a + b = c + d.
void listSomething(int a[], int n)
{
    int found = 0;
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            for (int k = 0; k < n - 1; k++)
            {
                for (int l = k + 1; l < n; l++)
                {
                    if (i != k && i != l && j != k && j != l)
                    {
                        if (a[i] + a[j] == a[k] + a[l])
                        {
                            printf("%d + %d = %d + %d\n", a[i], a[j], a[k], a[l]);
                            found = 1;
                        }
                    }
                }
            }
        }
    }
    if (found == 0)
    {
        printf("khong co bo nao thoa man");
    }
}

int main()
{
    int n;
    int a[100];
    printf("nhap so luong phan tu ");
    do
    {
        scanf("%d", &n);
    } while (n < 4);
    inputArray(a, n);
    outputArray(a, n);
    listSomething(a, n);
    return 0;
}