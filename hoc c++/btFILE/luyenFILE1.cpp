#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main()
{
    // viet chuong trinh doc ba so nguyen a,b,ctu mot tap ti, sau do giai phung trinh bac 2 roi ghi ket qua vao mot tap tin
    FILE *f, *f1;
    // tao va mo FILE
    f = fopen("bai_0.txt", "r");
    f1 = fopen("bai_0_out.txt", "w");
    if (f == NULL)
    {
        printf("\nloi file");
        return 0;
    }
    // doc file
    int a, b, c;
    fscanf(f, "%d", &a);
    fscanf(f, "%d", &b);

    fscanf(f, "%d", &c);
    printf("\ngia tri cua 3 so nguyen la :%d %d %d", a, b, c);

    if (a == 0)
    {
        if (b == 0 && c == 0)
        {
            fprintf(f1, "\nptvsn");
        }
        else if (b == 0 && c != 0)
        {
            fprintf(f1, "\nptvn");
        }
        else
        {
            fprintf(f1, "\npt bac nhat, x=%.2lf", -c / b);
        }
    }
    else
    {
        double deta = b * b - 4 * a * c;
        if (deta > 0)
        {
            double x1 = (-b + sqrt(deta)) / 2 * a;
            double x2 = (-b - sqrt(deta)) / 2 * a;
            fprintf(f1, "\npt co 2 nghiem la :");
            fprintf(f1, "\nx1=%.2lf ,x2=%.2lf", x1, x2);
        }
        else if (deta == 0)
        {
            fprintf(f1, "\npt co nghiem kep la : x=%.2lf", -b / (2 * a));
        }
        else
        {
            fprintf(f1, "\npt vo nghiem");
        }
    }

    // dong file
    fclose(f);
    fclose(f1);
    return 0;
}