#include <stdio.h>
// trong quá trình kiểm tra nhập vào nếu trùng yêu cầu nhập lại
int kiemtra(int a[], int n, int x)
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
    printf("nhap so luong phan tu la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        do
        {
            printf("nhap phan tu thu %d la :", i);
            scanf("%d", &a[i]);
            if (kiemtra(a, i, a[i]) == 1)
            {
                printf("nhap lai\n");
            }
        } while (kiemtra(a, i, a[i]) == 1);
    }
}
void outputArray(int a[], int n)
{
    printf("mang vua moi nhap la :");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    printf("\n");
}
// tính tổng của từng dãy con giảm có trong mảng
void sumgiam(int a[], int n)
{
    int sum = a[0];
    for (int i = 0; i < n - 1; i++)
    {
        if (a[i] > a[i + 1])
        {
            sum += a[i + 1];
        }
        else
        {
            printf("tong day con giam la:%d\n", sum);
            sum = a[i + 1];
        }
    }
    printf("tong day con giam dan la :%d\n", sum);
}
// tính trung bình cộng của các tông các dãy tang dần có trong mảng
void sumtb(int a[], int n)
{
    if (n < 0)
        return 0;
    int sum = a[0];
    int count = 0;
    int tong = 0;
    for (int i = 0; i < n - 1; i++)
    {
        if (a[i] < a[i + 1])
        {
            sum += a[i + 1];
        }
        else
        {
            tong += sum;
            count++;
            sum = a[i + 1];
        }
    }
    tong += sum;
    count++;

    printf("%.2f", (float)tong / count);
}
// tính giá trị trung bình của các số hoàn thiện
int sohoanthien(int n)
{
    if (n < 2)
        return 0;
    int sum = 0;
    for (int i = 1; i <= n / 2; i++)
    {
        if (n % i == 0)
        {
            sum += i;
        }
    }
    if (sum == n)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
void tbhoanthien(int a[], int n)
{
    int sum = 0;
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (sohoanthien(a[i]) == 1)
        {
            sum += a[i];
            count++;
        }
    }
    if (count == 0)
    {
        printf("khong co so hoan thien\n");
    }
    else
    {
        printf("%.2f", (float)sum / count);
    }
}

int main()
{
    int n, a[100];
    inputArray(a, n);
    outputArray(a, n);
    sumgiam(a, n);
    // printf("tong trung binh day con giam dan la :\n");
    // sumtb(a, n);

    // tbhoanthien(a, n);
    return 0;
}