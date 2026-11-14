#include <stdio.h>
int main()
{
    int a, b;
    scanf("%d %d", &a, &b);
    int tong = a + b;
    int hieu = a - b;
    int tich = a * b;
    float thuong = (float)a / b;
    printf("%d %d %d %.2f", tong, hieu, tich, thuong);
    return 0;
}