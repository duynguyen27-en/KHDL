#include <stdio.h>
int fibonacci(int n)
{
    if (n == 0)
        return 0;
    if (n == 1)
        return 1;
    int a = 0, b = 1, c;
    int temp = n;
    while (b != temp && b < temp)
    {
        c = a + b;
        a = b;
        b = c;
    }
    if (b == temp)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
int main()
{
    int n;
    printf("nhap vao so nguyen duong n :");
    scanf("%d", &n);
    if (fibonacci(n))
    {
        printf("1");
    }
    else
    {
        printf("0");
    }
    return 0;
}