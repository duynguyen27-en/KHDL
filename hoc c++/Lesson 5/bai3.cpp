#include <stdio.h>
int sumOfDigits(int n)
{
    int sum = 0;
    while (n > 0)
    {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}
int main()
{
    int n;
    printf("nhap vao so nguyen duong n :");
    scanf("%d", &n);
    printf("tong cac chu so cua n la :%d", sumOfDigits(n));
    return 0;
}