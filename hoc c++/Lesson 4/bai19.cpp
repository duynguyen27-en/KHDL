#include <stdio.h>
void listPerfectNumbers(int n)
{
    int count = 0;
    for (int i = 1; i < n; i++)
    {
        if (n % i == 0)
        {
            count += i;
        }
    }
    if (count == n)
    {
        printf("%d ", n);
    }
}

int main()
{
    int a, b;
    printf("nhap so nguyen duong a :");
    scanf("%d", &a);
    printf("nhap so nguyen duong b :");
    scanf("%d", &b);
    printf("cac so hoan hao nam trong khoang a va b la :");
    for (int i = a; i < b; i++)
        listPerfectNumbers(i);
    return 0;
}