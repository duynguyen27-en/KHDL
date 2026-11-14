#include <stdio.h>
void printRectanglefail(int n)
{
    int strat = 1;
    for (int i = 0; i < n; i++)
    {
        int val = strat;
        for (int j = 0; j <= i; j++)
        {
            printf("%d ", val);
            val += (n - j);
        }
        strat += (i + 1);
        printf("\n");
    }
}

int main()
{
    int n;
    printf("nhap so n la :");
    scanf("%d", &n);
    printRectanglefail(n);
    return 0;
}