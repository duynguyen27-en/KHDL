import java.util.Scanner;
public class cau3 {
    int tu1,tu2;   
    void input(){
        Scanner kq = new Scanner(System.in);
        System.out.print("nhap tu1 mau 1 la :");
        tu1 = kq.nextInt();
        System.out.print("nhap tu2 mau2 la :");
        tu2 = kq.nextInt();
    }
    
    void output(){
        int s = ((8/2)*tu1 + (8/4)*tu2);
       System.out.println("tinh cong tru :");
        System.out.println(""+tu1+"/2 + "+tu2+"/4 = "+s+"/8");
        System.out.println("tinh nhan :");
        System.out.println(""+tu1+"/2 +"+tu2+"/4 ="+tu1*tu2+"/8");
        System.out.println("tinh chia :");
        System.out.println(""+tu1+"/2/"+tu2+"/4 ="+tu1*4+"/"+tu2*2+"");
    
    }
    public static void main(String[] args) {
        cau3 a = new cau3();
        a.input();
        a.output();
    }
}
