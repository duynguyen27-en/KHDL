#include <stdio.h>
#include <math.h>
#include <stdbool.h>
bool isPrime(int n)
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
void printPrimesWithDigitSumDivisibleBy5(int n)
{
    int count = 0;
    for (int i = 2; i <= n; i++)
    {
        if (isPrime(i) == true)
        {
            int sum = 0;
            int temp = i;
            while (temp > 0)
            {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum % 5 == 0)
            {
                count++;
                printf("%d ", i);
            }
        }
    }
    printf("\ntong cac so nhu vay la :%d", count);
}

int main()
{
    int n;
    printf("nhap vao so nguyen duong n :");
    scanf("%d", &n);
    printPrimesWithDigitSumDivisibleBy5(n);
    return 0;
}