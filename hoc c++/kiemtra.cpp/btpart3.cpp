#include <stdio.h>
int main()
{
    char c[100];
    gets(c);
    printf("%s", c);
    for (int i = 0; c[i] != '\0'; i++)
    {
        if (c[i] >= 'a' && c[i] <= 'z')
        {
            c[i] -= 32;
        }
        else if (c[i] >= 'A' && c[i] <= 'Z')
        {
            c[i] += 32;
        }
    }
    printf(" chuyen tu hoa sang thuong va thuong sang hoa la :");
    printf("%s", c);
}