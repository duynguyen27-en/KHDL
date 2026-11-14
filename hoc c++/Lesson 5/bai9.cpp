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
int armstrong(int n)
{
    int sum = 0;
    int temp = n;
    int numDigits = countNumbers(n);
    while (n > 0)
    {
        int digit = n % 10;
        sum += pow(digit, numDigits);
        n /= 10;
    }
    if (sum == temp)
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
    if (armstrong(n))
    {
        printf("1");
    }
    else
    {
        printf("0");
    }
    return 0;
}