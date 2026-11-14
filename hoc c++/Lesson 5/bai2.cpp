#include <stdio.h>
void printLastDigit(int n)
{
    int digit = n % 10;
    printf("%d ", digit);
}
void printFirstDigit(int n)
{
    while (n >= 10)
    {
        n /= 10;
    }
    printf("%d", n);
}

int main()
{
    int n;
    printf("Nhap vao so nguyen duong n: ");
    scanf("%d", &n);
    printFirstDigit(n);
    printf(" ");
    printLastDigit(n);
    return 0;
}