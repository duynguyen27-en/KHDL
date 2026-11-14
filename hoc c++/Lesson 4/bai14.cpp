#include <stdio.h>
int productOfDigits(int n)
{
    int product = 1;
    while (n > 0)
    {
        int digit = n % 10;
        product *= digit;
        n /= 10;
    }
    return product;
}

int main()
{
    int n;
    printf("nhap so nguyen duong n");
    scanf("%d", &n);
    printf("tich cac chu so cua n la: %d", productOfDigits(n));
    return 0;
}