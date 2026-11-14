package tuan1;
import java.util.Scanner;
public class Cau5 {
    double a,b;
    
    void input(){
        Scanner kq = new Scanner(System.in);
        System.out.print("nhap so a :");
        a = kq.nextDouble();
        System.out.print("nhap so b :");
        b = kq.nextDouble();
        System.out.print("nhap vao mot ki tu :");
       
    }
    void output(){
        Scanner kq = new Scanner(System.in);
         System.out.print("nhap vao mot ki tu :");
        char  operator = kq.next().charAt(0);
        switch(operator){
            case '+':
            System.out.println(""+a+"+"+b+"="+(a+b));
            break;
            case '-':
                System.out.print(""+a+"-"+b+"="+(a-b));
                break;
            case '*':
                System.out.print(""+a+"*"+b+"="+(a*b));
                break;
            case '/':
               if(b!=0){
                System.out.print(""+a+"/"+b+"="+(float)(a/b));
               }else{
                System.out.print("khong chia duoc cho 0");
               }
               break;
            default:
                System.out.print(" ki tu khong hop le");
                break;
        }
    }
    public static void main(String[] args) {
        Cau5 dd =new Cau5();
        dd.input();
        dd.output();
    }

}
