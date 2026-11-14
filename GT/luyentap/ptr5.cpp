#include<stdio.h>

int main(){
    char chuoi[]="hoc code khong kho";
    char* ptr=chuoi;
    int dem=0;

    while(*ptr!='\0'){
        dem++;
        ptr++;
    }
    printf("chuoi nay co so ki tu la : %d",dem);

    return 0;

}