#include <stdio.h>
struct sinhvien{
    int ma;
    float diem;
};
void nhapmang( struct sinhvien *p,int &n){
    printf("nhap so luong sinh vien :");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        printf("nhap ma sv ma[%d]:",i+1);
        scanf("%d",&(p+i)->ma);
        do{
            printf("nhap diem sv diem[%d]:",i+1);
            scanf("%f",&(p+i)->diem);
        }while((p+i)->diem <0 || (p+i)->diem>10);
    }
}
void xuatmang( struct sinhvien *p,int n){
    for(int i=0;i<n;i++){
        printf("\nsinh vien thu[%d] - ma sv :%d - diem sv :%.2f",i+1,(p+i)->ma,(p+i)->diem);
    }
}
int main(){
    struct sinhvien p[100];
    int n;
    nhapmang(p,n);
    xuatmang(p,n);
    return 0;
}