#include <stdio.h>
int cheak(int a[], int n, int x)
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
    do
    {
        printf("nhap so luong phan tu n la :");
        scanf("%d", &n);
        if (n < 3)
        {
            printf("vui long nhap n>=3:\n");
        }
    } while (n < 3);
    for (int i = 0; i < n; i++)
    {
        do
        {
            printf("nhap phan tu thu %d la :", i);
            scanf("%d", &a[i]);
            if (cheak(a, i, a[i]) == 1)
            {
                printf("vui long nhap lai\n");
            }
        } while (cheak(a, i, a[i]) == 1);
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
// int isValid(int a[], int n, int x)
// {
//     int count = 0;
//     for (int i = 0; i < n; i++)
//     {
//         if (a[i] > x)
//         {
//             count++;
//         }
//     }
//     if (count >= 2)
//     {
//         return 1;
//     }
//     else
//     {
//         return 0;
//     }
// }
// void printElementsWithAtLeastTwoGreater(int a[], int n)
// {
//     for (int i = 0; i < n; i++)
//     {
//         if (isValid(a, n, a[i]) == 1)
//         {
//             printf("%d ", a[i]);
//         }
//     }
// }
void printElementsNotTop2(int a[], int n)
{
    int max1 = 0, max2 = 0;
    if (a[0] > a[1])
    {
        max1 = a[0];
        max2 = a[1];
    }
    else
    {
        max1 = a[1];
        max2 = a[0];
    }
    for (int i = 0; i < n; i++)
    {
        if (a[i] > max1)
        {
            int tamp = max1;
            max2 = tamp;
            max1 = a[i];
        }
        else if (a[i] > max2 && a[i] < max1)
        {
            max2 = a[i];
        }
    }
    printf("2 so lon nhat la :%d %d\n", max1, max2);
    printf("cac phan tu co it nhat 2 phan tu lon hon no la :\n");
    for (int i = 0; i < n; i++)
    {
        if (a[i] < max2)
        {
            printf("%d ", a[i]);
        }
    }
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    // printf("cac phan tu co it nhat 2 phan tu lon hon no la :\n");
    // printElementsWithAtLeastTwoGreater(a, n);
    printElementsNotTop2(a, n);
}