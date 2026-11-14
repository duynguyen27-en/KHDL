
import java.util.Scanner;
public class cau4 {
    int a;
    void input(){
        Scanner kq = new Scanner(System.in);
        System.out.print("nhap so a la :");
        a = kq.nextInt();
    }
    
    void output(){
        int b = a%10;
        int c = (a/10)%10;
        int d = (a/100)%10;
        int e = (a/1000)%10;
        int f = a/10000;
       System.out.println(""+f+" +"+e+" +"+d+" +"+c+" +"+b+" ="+(f+e+d+c+b));
       
    
    }
    
    
    public static void main(String[] args) {
       cau4 dd = new cau4();
        dd.input();
        dd.output();
        
    }
    
}
