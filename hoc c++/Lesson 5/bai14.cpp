#include <stdio.h>
#include <math.h>
int isPrime(int n)
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
int isMaxLastDigit(int n)
{
    int sum = 0;
    int max = n % 10;
    int digit = n / 10;
    int find = digit % 10;
    if (max >= find)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

void findPrimeWithLargestLastDigit(int n)
{
    int sum = 0;
    for (int i = 2; i <= n; i++)
    {
        if (isPrime(i))
        {
            if (isMaxLastDigit(i))
            {
                int temp = i;
                sum++;
                printf("%d ", temp);
            }
        }
    }
    printf("\n%d", sum);
}

int main()
{
    int n;
    printf("nhap so nguyen duong n :");
    scanf("%d", &n);
    findPrimeWithLargestLastDigit(n);
    return 0;
}