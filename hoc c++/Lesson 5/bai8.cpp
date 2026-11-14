#include <stdio.h>
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
int main()
{
    int n;
    printf("nhap vao so nguyen duong n :");
    scanf("%d", &n);
    printf("so luong chu so cua n la :%d", countNumbers(n));
    return 0;
}