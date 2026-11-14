package tuan1;
import java.util.Scanner;
public class Cau3 {
    double n;
    void input(){
        Scanner kq = new Scanner(System.in);
        System.out.print("nhap so km la :");
        n = kq.nextDouble();

    }
    void output(){

        if(n<=1){
            System.out.println("so tien la :"+(15000));
        }else if(n>1 && n<=5){
            System.out.println("so tien la :"+(15000+(n-1)*13500));
        }
        else if(n>5 && n<=30) {
            System.out.println("so tien la :"+(15000+ 4*13500 +(n-5)*11000));
        }else if(n>30){
            System.out.println("so tien la :"+(15000+ 4*13500 +(n-5)*11000)*0.9);
        }
    }

    public static void main(String[] args) {
        Cau3 dd = new Cau3();
        dd.input();
        dd.output();
    }


}
