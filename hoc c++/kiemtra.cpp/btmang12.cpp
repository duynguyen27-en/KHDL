#include <stdio.h>
#include <math.h>
void inputArray(int m[], int &n)
{
    printf("nhap so luong phan tu n la:");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        printf("nhap so phan tu thu %d la :", i);
        scanf("%d", &m[i]);
    }
}
void outputArray(int m[], int n)
{
    // printf("mang vua moi nhap la :");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", m[i]);
    }
    printf("\n");
}
// chèn một giá trị x và vị trí y trong mảng
void insertAtPosition(int m[], int n, int x, int y)
{
    for (int i = n - 1; i >= y; i--)
    {
        m[i + 1] = m[i];
    }
    m[y] = x;
    n++;
    outputArray(m, n);
}
// sắp xếp mảng theo thứ tự tăng dần
void sortAscending(int m[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (m[i] > m[j])
            {
                int temp = m[i];
                m[i] = m[j];
                m[j] = temp;
            }
        }
    }
    outputArray(m, n);
}
// loại tất cả các giá trị âm trong mảng
// void removeNegative(int m[], int n)
// {
//     int vt = 0;
//     for (int i = 0; i < n; i++)
//     {
//         if (m[i] < 0)
//         {
//             for (int j = i; j < n - 1; j++)
//             {
//                 m[j] = m[j + 1];
//             }
//             n--;
//             i--;
//         }
//     }
//     outputArray(m, n);
// }
void removeNegative(int m[], int n)
{
    int k = 0;
    for (int i = 0; i < n; i++)
    {
        if (m[i] >= 0)
        {
            m[k] = m[i];
            k++;
        }
    }
    outputArray(m, k);
}
// tìm số nguyên tố lớn nhất trong mảng
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
void findMaxPrime(int m[], int n)
{
    int max = 2;

    for (int i = 0; i < n; i++)
    {
        if (isprime(m[i]))
        {
            if (m[i] >= max)
            {
                max = m[i];
            }
        }
    }
    printf("so nguyen to lon nhat la :%d\n", max);
}
// tìm 2 phân tử trong mảng có tổng lớn nhất
void findMaxSumPair(int m[], int n)
{
    int max1 = m[0];
    int max2 = m[0];
    for (int i = 1; i < n; i++)
    {
        if (m[i] >= max1)
        {
            int tamp = max1;
            max1 = m[i];
            max2 = tamp;
        }
    }
    int sum = max1 + max2;
    printf("tong 2 phan tu lon nhat la :%d\n", sum);
    printf("hai phan tu co tong lon nhat la :%d %d\n", max1, max2);
}
// lọi các phân tử trùng nhau trong mảng
int hasDuplicate(int m[], int n, int x)
{
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (m[i] == x)
        {
            count++;
        }
    }
    if (count > 1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

void removeDuplicates(int m[], int n)
{
    int k = 0;
    for (int i = 0; i < n; i++)
    {
        if (hasDuplicate(m, n, m[i]) == 1)
        {
            for (int j = i; j < n - 1; j++)
            {
                m[j] = m[j + 1];
            }
            n--;
            i--;
        }
    }
    outputArray(m, n);
}
// tìm giá trị trung vị trong mảng
void findMedian(int m[], int n)
{

    if (n % 2 != 0)
    {
        for (int i = 0; i < n; i++)
        {
            if (i == n / 2)
            {
                printf("%d", m[i]);
            }
        }
    }
    else
    {
        for (int i = 0; i < n; i++)
        {
            if (i == (n - 1) / 2)
            {
                float sum = (float)(m[i] + m[i + 1]) / 2;
                printf("%.2f", sum);
            }
        }
    }
}

int main()
{
    int n;
    int m[100];
    inputArray(m, n);
    outputArray(m, n);
    // int x, y;
    // printf("chen gia tri x vao vi tri y la :");
    // scanf("%d %d", &x, &y);
    // insertAtPosition(m, n, x, y);
    // sortAscending(m, n);
    // removeNegative(m, n);
    removeDuplicates(m, n);

    // findMaxSumPair(m, n);
    // printf("gia tri trung vi cua mang la :");
    // findMedian(m, n);
    return 0;
}