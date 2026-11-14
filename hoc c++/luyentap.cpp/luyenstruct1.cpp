#include <stdio.h>
#include <string.h>
struct date{
    int ngay;
    int thang;
    int nam;
};
struct sinhvien{
    int ma;
    char ten[100];
    float diem;
    struct date ns;
};
void xoaxuongdong(char c[]){
    size_t len =strlen(c);
    if(c[len-1]=='\n'){
        c[len-1]='\0';
    }
}
void nhapmang(struct sinhvien sv[],int &n){
    printf("so luong phan tu sinh vien :");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        printf("ma sv ma[%d] :",i+1);
        scanf("%d",&sv[i].ma);
         getchar();
        printf("ten sv ten [%d] :",i+1);
        fgets(sv[i].ten,100,stdin);
        xoaxuongdong(sv[i].ten);
        printf("nhap ngay sinh cua sinh vien [%d]:",i+1);
        scanf("%d%d%d",&sv[i].ns.ngay,&sv[i].ns.thang,&sv[i].ns.nam);
        do{
            printf("nhap diem sv diem[%d] :",i+1);
            scanf("%f",&sv[i].diem);
        }while(sv[i].diem<0 || sv[i].diem>10);
    }
}
void xuatmang(struct sinhvien sv[],int n){
    for(int i=0;i<n;i++){
        printf("sinh vien thu:%d - ma sv :%d - ten sv :%s - ngay sinh:%d/%d/%d - diem sv :%.2f\n",i+1,sv[i].ma,sv[i].ten,sv[i].ns.ngay,sv[i].ns.thang,sv[i].ns.nam,sv[i].diem);
    }
}
void sapxepgiam(struct sinhvien sv[],int n){
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(sv[i].diem<sv[j].diem){
                struct sinhvien temp =sv[i];
                sv[i]=sv[j];
                sv[j]=temp;
            }
        }
    }
    printf("danh sach sau sap xep la :\n");
    xuatmang(sv,n);
}


int main(){
    struct sinhvien sv[100];
    int n;
    nhapmang(sv,n);
    xuatmang(sv,n);
    sapxepgiam(sv,n);
    return 0;
}