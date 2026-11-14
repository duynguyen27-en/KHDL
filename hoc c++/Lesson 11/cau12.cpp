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
// int calculateChange(int a[], int n)
// {

//     for (int i = 0; i < n - 1; i++)
//     {
//         if (a[i] < a[i + 1])
//         {
//             a[i + 1] = a[i + 1] - a[i];
//             for (int j = i; j < n; j++)
//             {
//                 a[j] = a[j + 1];
//             }
//             n--;
//             i--;
//         }
//     }
//     outputArray(a, n);
//     int sum = 0;
//     for (int i = 0; i < n; i++)
//     {
//         if (a[i] >= 25)
//         {
//             sum += a[i];
//         }
//     }
//     if (sum == n * 25)
//     {
//         return 1;
//     }
//     else
//     {
//         return 0;
//     }
// }

int calculateChange(int a[], int n)
{
    int c25 = 0, c50 = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] == 25)
        {
            c25++;
        }
        else if (a[i] = 50)
        {
            if (c25 >= 1)
            {
                c25--;
                c50++;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if (c25 >= 1 && c50 >= 1)
            {
                c50--;
                c25--;
            }
            else if (c25 >= 3)
            {
                c25 -= 3;
            }
            else
            {
                return 0;
            }
        }
    }
    return 1;
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    if (calculateChange(a, n))
    {
        printf("yes");
    }
    else
    {
        printf("no");
    }
    return 0;
}