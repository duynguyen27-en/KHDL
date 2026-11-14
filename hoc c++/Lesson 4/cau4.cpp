#include <stdio.h>
#include <math.h>
int songuyento(int n)
{
    if (n < 2)
        return 0;
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (n % i == 0)
            return 0;
    }
    return 1;
}
int tinhtong(int n)
{
    int sum = 0;
    while (n)
    {
        sum += n % 10;
        n = n / 10;
    }
    return sum;
}
int fibonacci(int n)
{
    if (n == 0 || n == 1)
        return 1;
    int a = 0, b = 1, c;
    while (b < n)
    {
        c = a + b;
        a = b;
        b = c;
    }
    return (b == n);
}
int main()
{
    int a, b;
    scanf("%d %d", &a, &b);
    for (int i = a; i <= b; i++)
    {
        if (songuyento(i) && fibonacci(tinhtong(i)))
        {
            printf("%d ", i);
        }
    }
    return 0;
}