#include <stdio.h>
#include <math.h>
// phân tích một số nguyên thành các thừa số nguyên tố.
void findPrimeFactors(int n)
{
    for (int i = 2; i <= n; i++)
    {
        while (n % i == 0)
        {
            printf("%d ", i);
            n /= i;
        }
    }
}

int main()
{
    int n;
    scanf("%d", &n);
    findPrimeFactors(n);
    return 0;
}