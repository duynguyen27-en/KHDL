package tuan1;
import java.util.Scanner;

public class Cau6 {
    int a;
    void input(){
        Scanner kq = new Scanner(System.in);
        System.out.print("nhap so dien tieu thu la :");
         a = kq.nextInt();
    }
    void output(){
        if(a<=50){
            System.out.println("tong so ten dien la :"+(1806*a));
        }else if(a>=51 && a<=100){
            System.out.println(" tong so tien dien la :"+(1806*50 + (a-50)*1866));
        }else{
            System.out.println("tong so tien dien la :"+(1806*50 +50*1866 + (a-100)*2167));
        }


    }
    public static void main(String[] args) {
        Cau6 dd = new Cau6();
        dd.input();
        dd.output();
    }

}
