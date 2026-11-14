#include <stdio.h>
#include <stdbool.h>
bool isPalindrome(int n)
{
    int sum = 0;
    int temp = n;
    while (n > 0)
    {
        int digit = n % 10;
        sum = sum * 10 + digit;
        n /= 10;
    }
    if (sum == temp)
    {
        return true;
    }
    else
    {
        return false;
    }
}
void isPalindromeWithout9(int n)
{
    int count = 0;
    for (int i = 2; i <= n; i++)
    {
        if (isPalindrome(i))
        {
            int temp = i;
            if (temp % 10 != 9)
            {
                count++;
                printf("%d ", temp);
            }
        }
    }
    printf("\ntong cac so tren la :%d", count);
}

int main()
{
    int n;
    printf("nhap vao so nguyen duong la :");
    scanf("%d", &n);
    isPalindromeWithout9(n);
    return 0;
}