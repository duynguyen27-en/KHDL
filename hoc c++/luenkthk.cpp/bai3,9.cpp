#include <stdio.h>
int main(){
    int ga,tho;
    for(int ga=0;ga<=43;ga++){
        for(tho=0;tho<=43;tho++){
            if(ga+tho==43 && 2*ga + 4*tho==100){
                printf("so ga la :%d",ga);
                printf("\nso tho la :%d",tho);
            }
        }
    }
    return 0;
    

}