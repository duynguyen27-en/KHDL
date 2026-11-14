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
    FILE*f;
    f=fopen("nguyenduynguyen.txt","w");
    if(f==NULL){
        printf("\nloi file");
        return 0;
    }
    fprintf(f,"MON :LAP TRINH CO SO");
    fprintf(f,"\nso buoi quy dinh :%d",sbqd);
    fprintf(f,"\nso buoi vang :%d",sbv);
    fprintf(f,"\nso buoi den lop :%d",sbdl);
    fprintf(f,"\ndiem chuyen can :%d",dcc);
     if(dcc>2){
        fprintf(f,"\nket qua : DUOC DU THI");
     }else if(dcc<=2){
        fprintf(f,"\nket qua : HOC LAI");
     }
     fclose(f);
     return 0;
    
}