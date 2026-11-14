#include <stdio.h>
#include <limits.h>
int main()
{

    float a, b, c;
    printf("ba so thu la :");
    scanf("%f %f %f", &a, &b, &c);
    float max = a;
    if (b > max)
    {
        max = b;
    }
    if (c > max)
    {
        max = c;
    }

    printf("so lon nhat trong 3 so la :%.2f", max);
    return 0;
}