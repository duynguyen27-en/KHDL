package tuan1;
import java.util.Scanner;
public class Cau4 {
    double balance,amountToWithdraw;
    int withdrawCount;
    void input(){
        Scanner kq = new Scanner(System.in);
        System.out.print("nhap so du hien tai trong tai khoan :");
        balance = kq.nextDouble();
        System.out.print("nhap so tien muon rut :");
        amountToWithdraw = kq.nextDouble();
       System.out.print("nhap so lan rut :");
       withdrawCount =   kq.nextInt();
    }
    void output(){
        // neu rut qua 3 lan thi khoa tai khoan
        boolean kt = (withdrawCount<3)?true:false;
        if(kt){
            if(amountToWithdraw>0 && amountToWithdraw<=balance){
                double f = amountToWithdraw*withdrawCount;
                if(f<=balance){
                System.out.println("rut thang cong ");
                double sd = balance -(amountToWithdraw)*withdrawCount;
                System.out.println("so du con lai la :"+sd);
                }else{
                    System.out.println("so du khong du");
                }
            }else {
                System.out.println("khong du so du");
            }
        }else {
            System.out.println("tai khoan bi khoa");
        }
    }

public static void main(String[] args) {
    Cau4 dd = new Cau4();
    dd.input();
    dd.output();
    
}
}
