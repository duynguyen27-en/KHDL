#include <stdio.h>
int main()
{
    char a;
    printf("thuoc la");
    long long b, c; // a: sản phẩm, b: số lượng, c: đơn giá
    scanf("%lld %lld ", &b, &c);
    if (b > 0 && c > 0)
    {
        long long tien = b * c;
        long long thue = tien * (10 / 100);
        printf("%lld %lld", tien, thue);
    }
    else
    {
        printf("khong hop le");
    }
    return 0;
}