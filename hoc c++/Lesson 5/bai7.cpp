#include <stdio.h>
#include <math.h>
int countNumbers(int n)
{
    int count = 0;
    while (n > 0)
    {
        count++;
        n /= 10;
    }
    return count;
}
void swapFirstLast(int n)
{
    int numdigits = countNumbers(n);
    int first = n / (int)pow(10, numdigits - 1);
    int last = n % 10;
    int middle = n % (int)pow(10, numdigits - 1);
    middle /= 10;
    int result = last * (int)pow(10, numdigits - 1) + middle * 10 + first;
    printf("%d", result);
}

int main()
{
    int n;
    printf("nhap vao so nguyen duong n :");
    scanf("%d", &n);
    printf("so sau khi doi cho chu so dau va cuoi la :");
    swapFirstLast(n);
    return 0;
}