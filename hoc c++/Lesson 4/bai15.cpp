#include <stdio.h>
void printDivisort(int n)
{
    for (int i = 1; i <= n; i++)
    {
        if (n % i == 0)
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
    printf("cac uoc so cua n la :");
    printDivisort(n);
    return 0;
}