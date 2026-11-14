#include <stdio.h>
#include <string.h>
void soxuongdong(char*st){
    int len =strlen(st);
    if(st[len-1]=='\n'){
      st[len-1]='\0';
    }
}

int pos(char*st1 ,char*st2){
    int len=strlen(st1);
    for(int i=0;i<len;i++){
        int j=0;
        while(st2[j]!='\0' && st1[i+j]==st2[j]){
            j++;
        }
        if(st2[j]=='\0'){
            return i;
        }
    }
    return -1;
}
int main(){
    char st1[100];
    char st2[100];
    fgets(st1,100,stdin);
    soxuongdong(st1);
    fgets(st2,100,stdin);
    soxuongdong(st2);
    printf("vi tri xuat hien la %d" ,pos(st1,st2));
    return 0;

}