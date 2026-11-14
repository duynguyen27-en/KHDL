#include <stdio.h>
#include <limits.h>
#include <math.h>
#include <stdlib.h>
void nhapmang(int a[], int &n)
{
    printf("nhap so luong phan tu n la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        printf("[%d]=", i);
        scanf("%d", &a[i]);
    }
}
void xuatmang(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
}
void findMinMax(int a[], int n)
{
    int max = INT_MIN, min = INT_MAX;
    for (int i = 0; i < n; i++)
    {
        if (a[i] > max)
        {
            max = a[i];
        }
        if (a[i] < min)
        {
            min = a[i];
        }
    }
    printf("\nso lon nhat va nho nhat la :%d %d", max, min);
}
void countEvenOdd(int a[], int n)
{
    int chan = 0, le = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] % 2 == 0)
        {
            chan++;
        }
        else
        {
            le++;
        }
    }
    printf("\nso luong chan va le la :%d %d", chan, le);
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
void findPrimeNumbers(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        if (isprime(a[i]) == 0)
        {

            for (int j = i; j < n - 1; j++)
            {
                a[j] = a[j + 1];
            }
            n--;
        }
    }
    xuatmang(a, n);
}
void findIndex(int a[], int n)
{
    int vt1 = 0;
    int vt2 = 0;
    int min = INT_MAX;
    for (int i = 0; i < n; i++)
    {
        if (a[i] < min)
        {
            min = a[i];
            vt1 = i;
        }
        if (a[i] <= min)
        {
            min = a[i];
            vt2 = i;
        }
    }
    if (vt2 != 0)
    {
        printf("\nvi tri dau tien va vi tri thu hai la :%d %d", vt1, vt2);
    }
    else
    {
        printf("\nvi tri dau tien la :%d", vt1);
    }
}
void findLargestAndSecondLargest(int a[], int n)
{
    int max1 = INT_MIN;
    int max2 = INT_MIN;
    for (int i = 0; i < n; i++)
    {
        if (a[i] >= max1)
        {
            max2 = max1;
            max1 = a[i];
        }
        else if (a[i] >= max2 && a[i] < max1)
        {
            max2 = a[i];
        }
    }
    printf("\nso lon nhat va so lon thu hai la :%d %d", max1, max2);
}
void findDistinctMinMax(int a[], int n)
{
    int max1 = INT_MIN;
    int max2 = INT_MIN;
    int max3 = -1;
    for (int i = 0; i < n; i++)
    {
        if (a[i] > max1)
        {
            max2 = max1;
            max1 = a[i];
        }
        else if (a[i] > max2 && a[i] < max1)
        {
            max2 = a[i];
        }
    }
    if (max1 != max2 && max2 != INT_MIN)
    {
        printf("\nso lon nhat va so lon thu hai va khac nhau la :%d %d", max1, max2);
    }
    else if (max1 == max2 || max2 == INT_MIN)
    {
        printf("\nso lon nhat va so lon thu 2 va khac nhau la :%d %d", max1, max3);
    }
}
int isAllDigitsOdd(int n)
{
    while (n != 0)
    {
        int digit = n % 10;
        if (digit % 2 == 0)
        {
            return 0;
        }
        n /= 10;
    }
    return 1;
}

int countAllOddDigitNumbers(int a[], int n)
{
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        if (isAllDigitsOdd(a[i]))
        {
            sum++;
        }
    }
    return sum;
}
void printElementsWithAtLeastTwoGreater(int a[], int n)
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
    printf("\nmang vua moi sap xep tang dan la :");
    xuatmang(a, n);
    n -= 2;
    printf("\ncac phan tu co it nhat hai phan tu lon hon no la :");
    xuatmang(a, n);
}
int BeautifulNumber(int n)
{
    int has1 = 0;
    int has2 = 0;
    while (n != 0)
    {
        int temp = n % 10;
        if (temp == 1)
            has1 = 1;
        if (temp == 9)
            has2 = 1;
        if (has1 && has2)
        {
            return 1;
        }
        n /= 10;
    }
    return 0;
}

void isBeautifulNumber(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        if (BeautifulNumber(a[i]))
        {
            printf("%d", a[i]);
        }
    }
}
void printElementsWithOppositeSignNeighbor(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        if (a[i] < 0)
        {
            printf("%d ", a[i]);
        }
        else if (a[0] > 0 && abs(a[i] + a[i + 1]) < a[i])
        {
            printf("%d ", a[i]);
        }
        else if (a[i] > 0 && (abs(a[i] + a[i - 1]) < a[i] || abs(a[i] + a[i + 1]) < a[i]))
        {
            printf("%d ", a[i]);
        }
    }
}
void isSymmetricArray(int a[], int b[], int n)
{
    int bb = 0;
    for (int i = n - 1; i >= 0; i--)
    {
        if (n > 0)
        {
            b[bb] = a[i];
            bb++;
        }
    }
    printf("\nmang b la :");
    xuatmang(b, bb);
    int has1 = 0;
    int has2 = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] != b[i])
        {
            has1 = 1;
        }
        else
        {
            has2 = 1;
        }
    }
    if (has1 && has2)
    {
        printf("\nno");
    }
    else
    {
        printf("\nyes");
    }
}

int main()
{
    int n;
    int a[100];
    int b[100];
    nhapmang(a, n);
    xuatmang(a, n);
    findMinMax(a, n);
    countEvenOdd(a, n);
    // printf("\nmang toan so nguen to la :");
    // findPrimeNumbers(a, n);
    findIndex(a, n);
    findLargestAndSecondLargest(a, n);
    findDistinctMinMax(a, n);
    printf("\nso luong chu so le la :%d", countAllOddDigitNumbers(a, n));
    printf("\ncac so co chu so le la :");
    for (int i = 0; i < n; i++)
    {
        if (isAllDigitsOdd(a[i]))
        {
            printf("%d ", a[i]);
        }
    }
    // printElementsWithAtLeastTwoGreater(a, n);
    printf("\nso hoan hao la :");
    isBeautifulNumber(a, n);
    printf("\ncac phan tu co it nhat mot phan tu lien ke trai dau la :");
    printElementsWithOppositeSignNeighbor(a, n);
    isSymmetricArray(a, b, n);
    return 0;
}
