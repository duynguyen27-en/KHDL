#include <stdio.h>
#include <math.h>
void listArmstrongNumbersLessThanN(int n)
{
    for (int i = 0; i <= n; i++)
    {
        int count = 0;
        int sum = 0;
        int temp = i;
        while (temp > 0)
        {
            count++;
            temp /= 10;
        }
        temp = i;
        while (temp > 0)
        {
            int digit = temp % 10;
            sum += pow(digit, count);
            temp /= 10;
        }
        if (sum == i)
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
    printf("cac so armstrong nho hon hoac bang n la :");
    listArmstrongNumbersLessThanN(n);
    return 0;
}