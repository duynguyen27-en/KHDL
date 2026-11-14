#include <stdio.h>
// Kiểm tra xem n có phải là số thuận nghịch hay không
int Palindrome(int n)
{
    int temp = n;
    int sum = 0;
    while (temp > 0)
    {
        sum = sum * 10 + temp % 10;
        temp /= 10;
    }
    if (sum == n)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
// Kiểm tra xem n có phải là số có ít nhất 3 ước nguyên dương hay không
int hasThreeDistinctPrimeFactors(int n)
{
    int count = 0;
    for (int i = 2; i <= n; i++)
    {
        if (n % i == 0)
        {
            count++;
            while (n % i == 0)
            {
                n /= i;
            }
        }
    }
    if (count >= 3)
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
    int a, b;
    scanf("%d %d", &a, &b);
    for (int i = a; i <= b; i++)
    {
        if (Palindrome(i) && hasThreeDistinctPrimeFactors(i))
        {
            printf("%d ", i);
        }
        else
        {
            continue;
        }
    }
    return 0;
}