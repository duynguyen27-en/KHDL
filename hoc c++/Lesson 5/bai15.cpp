#include <stdio.h>
int sumOfDigitsA(int a)
{
    int sum = 0;

    while (a > 0)
    {
        sum++;
        a /= 10;
    }
    return sum;
}
int sumOfDigitsB(int b)
{
    int count = 0;
    while (b > 0)
    {
        count++;
        b /= 10;
    }
    return count;
}

int main()
{
    int a, b;
    printf("nhap 2 phan tu a va b la :");
    scanf("%d %d", &a, &b);
    if (sumOfDigitsA(a) >= sumOfDigitsB(b))
    {
        printf("%d %d", a, b);
    }
    else
    {
        printf("%d %d", b, a);
    }
    return 0;
}