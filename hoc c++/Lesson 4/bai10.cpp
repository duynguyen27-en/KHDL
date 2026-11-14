#include <stdio.h>
int isEven(int n)
{
    int Even = 0;

    while (n > 0)
    {
        int digit = n % 10;
        if (digit % 2 == 0)
            Even++;
        n = n / 10;
    }
    return Even;
}
int isodd(int n)
{
    int Odd = 0;
    while (n > 0)
    {
        int digit = n % 10;
        if (digit % 2 != 0)
            Odd++;
        n = n / 10;
    }
    return Odd;
}

int main()
{
    int n;
    printf("Nhap mot so nguyen: ");
    scanf("%d", &n);
    printf("so luong so chan la : ");
    printf("%d\n", isEven(n));
    printf("so luong so le la : ");
    printf("%d\n", isodd(n));
    return 0;
}