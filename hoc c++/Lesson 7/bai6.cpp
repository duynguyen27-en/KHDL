#include <stdio.h>
void printRectanglesix(int n)
{
    int size = 2 * n - 1;
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            int top = i;
            int left = j;
            int bottom = size - 1 - i;
            int right = size - 1 - j;
            int min = top;
            if (top < min)
                min = top;
            if (bottom < min)
                min = bottom;
            if (right < min)
                min = right;
            printf("%d", n - min - 1);
        }
        printf("\n");
    }
}

int main()
{
    int n;
    printf("nhap so n la :");
    scanf("%d", &n);
    printRectanglesix(n);
    return 0;
}