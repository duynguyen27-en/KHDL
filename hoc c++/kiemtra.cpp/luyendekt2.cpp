#include <stdio.h>
int main(){
    int sbqd,sbv;
    printf("nhap so buoi hoc quy dinh :");
    scanf("%d",&sbqd);
    do{
        printf("nhap so buoi vang :");
        scanf("%d",&sbv);
        if(sbv<0 || sbv>sbqd){
            printf("nhap lai!");
        }
    }while(sbv<0 || sbv>sbqd);
    int sbdl=sbqd-sbv;
    int dcc=10-sbv;
    printf("MON :LAP TRINH CO SO");
    printf("\nso buoi quy dinh :%d",sbqd);
    printf("\nso buoi vang :%d",sbv);
    printf("\nso buoi den lop :%d",sbdl);
    printf("\ndiem chuyen can :%d",dcc);
     if(dcc>2){
        printf("\nket qua : DUOC DU THI");
     }else if(dcc<=2){
        printf("\nket qua : HOC LAI");
     }
     return 0;
    
}