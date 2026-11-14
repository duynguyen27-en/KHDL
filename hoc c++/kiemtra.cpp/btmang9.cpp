#include <stdio.h>
#include <math.h>
#include <stdlib.h>
void inputArray(int a[], int &n)
{
    printf("nhap so luong phan tu la :");
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
// xóa giá trị lớn nhất trong mảng
void removeMax(int a[], int n)
{
    int vt = 0;
    int max = a[0];
    for (int i = 1; i < n; i++)
    {
        if (a[i] > max)
        {
            max = a[i];
            vt = i;
        }
    }
    for (int i = vt; i < n - 1; i++)
    {
        a[i] = a[i + 1];
    }
    n--;
    outputArray(a, n);
}
void insertValue(int a[], int n, int x)
{
    int max = a[0];
    int vt = 0;
    for (int i = 1; i < n; i++)
    {
        if (a[i] > max)
        {
            max = a[i];
            vt = i;
        }
    }
    for (int i = n - 1; i >= 0 && a[i] < max; i--)
    {
        a[i + 1] = a[i];
    }
    a[vt + 1] = x;
    n++;
    outputArray(a, n);
}
void removeLessThanX(int a[], int n, int x)
{
    for (int i = 0; i < n - 1; i++)
    {
        if (a[i] < x)
        {
            for (int j = i + 1; j < n; j++)
            {
                a[i] = a[j];
            }
            n--;
            i--;
        }
    }
    outputArray(a, n);
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

void insertXAtBeginningOfPrimes(int a[], int n, int x)
{
    int vt = 0;
    for (int i = 0; i < n; i++)
    {
        if (isprime(a[i]))
        {
            vt = i;
            break;
        }
    }
    for (int j = n - 1; j >= vt; j--)
    {
        a[j + 1] = a[j];
    }
    a[vt] = x;
    n++;
    outputArray(a, n);
}
void insertXAfterEven(int a[], int n, int x)
{
    int vt = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] % 2 == 0)
        {
            vt = i;

            for (int i = n - 1; i >= vt; i--)
            {
                a[i + 1] = a[i];
            }
            a[vt + 1] = x;
            n++;
        }
    }
    outputArray(a, n);
}
void insertXAtEndOfSubarrays(int a[], int n, int x)
{
    int vt = 0;
    int i;
    for (i = 0; i < n - 1; i++)
    {
        if (a[i] > a[i + 1])
        {
            vt = i;
            for (int j = n - 1; j > vt; j--)
            {
                a[j + 1] = a[j];
            }
            a[vt + 1] = x;
            n++;
            i += 2;
        }
    }
    for (i = n - 1; i >= n; i--)
    {
        a[i + 1] = a[i];
    }
    a[i + 1] = x;
    n++;
    outputArray(a, n);
}
void printAscendingArray(int a[], int n)
{
    int sum = a[0];
    int max = a[0];
    int vt = 0;
    int end = 0;
    int tempStart = 0;
    for (int i = 0; i < n - 1; i++)
    {
        if (a[i] < a[i + 1])
        {
            sum += a[i + 1];
        }
        else
        {
            if (sum > max)
            {
                max = sum;
                vt = tempStart;
                end = i;
            }
            sum = a[i + 1];
            tempStart = i + 1;
        }
    }
    if (sum > max)
    {
        vt = tempStart;
        end = n - 1;
    }
    printf("\nday co tong lon nhat la :");
    for (int j = vt; j <= end; j++)
    {
        printf("%d ", a[j]);
    }
}
void removeClosestToX(int a[], int n, int x)
{
    int vt = 0;
    int min = abs(a[0] - x);
    for (int i = 1; i < n; i++)
    {
        if (abs(a[i] - x) < min)
        {
            min = abs(a[i] - x);
            vt = i;
        }
    }
    for (int j = vt; j < n - 1; j++)
    {
        a[j] = a[j + 1];
    }
    n--;
    outputArray(a, n);
}

int main()
{
    int n;
    int a[100];
    inputArray(a, n);
    outputArray(a, n);
    int x;
    printf("nhap gia tri x la :");
    scanf("%d", &x);
    // insertValue(a, n, x);
    // removeLessThanX(a, n, x);
    // insertXAtBeginningOfPrimes(a, n, x);
    // insertXAfterEven(a, n, x);
    // insertXAtEndOfSubarrays(a, n, x);
    // printAscendingArray(a, n);
    removeClosestToX(a, n, x);
    return 0;
}