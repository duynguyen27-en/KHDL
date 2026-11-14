#include <stdio.h>
#include <math.h>
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
void inputArray(int a[], int &n)
{
    printf("nhap so luong phan tu n la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        //     do
        //     {
        printf("nhap phan tu thu %d la :", i);
        scanf("%d", &a[i]);
        //         if (i % 2 == 0 && !isprime(a[i]))
        //         {
        //             printf("vui long nhap so nguyen to :\n");
        //         }
        //         else if (i % 2 != 0 && a[i] % 2 != 0)
        //         {
        //             printf("vui long nhap so chan :\n");
        //         }
        //     } while ((i % 2 == 0 && !isprime(a[i])) || (i % 2 != 0 && a[i] % 2 != 0));
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
// int copyArrayToTwoArrays(int a[], int n, int b[], int c[])
// {
//     int bb = 0;
//     int cc = 0;
//     for (int i = 0; i < n; i++)
//     {
//         if (isprime(a[i]) == 1)
//         {
//             b[bb] = a[i];
//             bb++;
//         }
//         if (a[i] % 2 == 0)
//         {
//             c[cc] = a[i];
//             cc++;
//         }
//     }
//     return bb + cc;
// }
int sumArrays(int b[], int bb, int c[], int cc, int d[])
{
    int k = 0;
    if (bb < cc)
    {
        k = bb;
    }
    else
    {
        k = cc;
    }
    for (int i = 0; i < k; i++)
    {
        d[i] = b[i] + c[i];
    }

    return k;
}
void sortAscending(int d[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (d[i] > d[j])
            {
                int temp = d[i];
                d[i] = d[j];
                d[j] = temp;
            }
        }
    }
    outputArray(d, n);
}
void findDivisorsInArray(int a[], int n, int x)
{
    int found = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] != 0 && x % a[i] == 0)
        {
            printf("%d ", a[i]);
            found = 1;
        }
    }
    if (!found)
    {
        printf("khong co");
    }
}

int main()
{
    int n;
    int a[100], b[100], c[100], d[100];
    int bb = 0, cc = 0;

    inputArray(a, n);
    printf("mang a la :\n");
    outputArray(a, n);
    for (int i = 0; i < n; i++)
    {
        if (isprime(a[i]) == 1)
        {
            b[bb++] = a[i];
        }
        if (a[i] % 2 == 0)
        {
            c[cc++] = a[i];
        }
    }
    printf("mang b la :\n");
    outputArray(b, bb);
    printf("mang c la :\n");
    outputArray(c, cc);

    int dd = sumArrays(b, bb, c, cc, d);
    printf("mang d sau khi ghep lai la :\n");
    outputArray(d, dd);
    sortAscending(d, dd);
    printf("mang sau khi ghep va sap xep la :\n");
    outputArray(d, dd);
    printf("kiem tra uoc\n");
    for (int i = 0; i < dd; i++)
    {
        printf("%d: ", d[i]);
        findDivisorsInArray(a, n, d[i]);
        printf("\n");
    }
    return 0;
}