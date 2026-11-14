package baitap;
import java.util.Scanner;
public class MainHcn {
    Scanner kq = new Scanner(System.in);
    double a,b;
     Rectangle r;
    void input(){
        System.out.print("nhap chieu rong :");
        a = kq.nextDouble();
        System.out.print("nhap chieu cao :");
        b= kq.nextDouble();
       r = new Rectangle(a,b);

    }
    void output(){
        System.out.println("========== hinh chu nhat ==========");
         r.display();
    }
    public static void main(String[] args) {
        MainHcn dd = new MainHcn();
        dd.input();
        dd.output();
        
    }

}
