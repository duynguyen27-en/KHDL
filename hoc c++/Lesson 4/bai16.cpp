#include <stdio.h>
#include <math.h>
bool isprime(int n)
{
    if (n < 2)
        return false;
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (n % i == 0)
            return false;
    }
    return true;
}
void listIntegers(int n)
{
    for (int i = 2; i <= n; i++)
    {
        if (isprime(i))
        {
            printf("%d ", i);
        }
    }
}

int main()
{
    int n;
    printf("nhap so nguyen duong n :");
    scanf("%d", &n);
    printf("cac so nguyen to nho hon hoac bang n la :");
    listIntegers(n);
    return 0;
}