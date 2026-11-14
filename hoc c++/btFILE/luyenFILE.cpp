#include <stdio.h>
#include <stdlib.h>
int main()
{

    // viet chuong trinh ghi 3 so nguyen a ,b,c duoc nhap tu ban phim vao tap tin
    FILE *f;
    // 1- tạo FILE
    // 2-mở FILE
    f = fopen("bai_0.txt", "w");
    if (f == NULL)
    {
        printf("\nkhong ton tai FILE");
        return 0;
    }
    // 3- đọc hoac ghi
    int a, b, c;
    printf("\nnhap so 3 so nguyen la :");
    scanf("%d %d %d", &a, &b, &c);
    fprintf(f, "%d %d %d", a, b, c);

    //  4- đóng FILE
    fclose(f);
    return 0;
}