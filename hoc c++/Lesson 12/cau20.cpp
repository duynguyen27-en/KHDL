#include <stdio.h>
void inputArray(int a[], int &n)
{
    printf("nhap so luong phan tu n la :");
    scanf("%d", &n);
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
int countFrequency(int a[], int n, int x,int b[])
{
    int dem = 0;
    
    for (int i = 0; i < n; i++)
    {
        if (a[i] == x)
        {
            a[i] = 0;
            dem++;
            return 1;
        }
    }
    return dem;
}

int main()
{
    int n;
    int a[100];
    int b[100];
    inputArray(a, n);
    outputArray(a, n);
    int test;
    printf("test ");
    scanf("%d", &test);
    for (int i = 0; i < n; i++)
    {
        if (countFrequency(a, n, a[i]))
        {
            printf("%d xuat hien %d lan\n", a[i], countFrequency(a, n, a[i]));
        }
    }
    return 0;
}