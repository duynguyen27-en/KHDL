package baitap;

import java.util.Scanner;
public class MainBank {
     Scanner kq = new Scanner(System.in);
     String stk ,ttk;
     double du;
      Account a ;
     void input(){
        System.out.print("nhap so tai khoan :");
         stk =kq.nextLine();
        System.out.print("nhap ten tk :");
        ttk =kq.nextLine();
        System.out.print("nhap so du tk :");
         du = kq.nextDouble();
           a =new Account(stk,ttk,du);
     }
    void naptien(){
      System.out.print("nhap so tien can nap :");
      double  nap = kq.nextDouble();
      a.deposit(nap);
    }
    void ruttien(){
      System.out.print("nhap so tien can rut :");
      double rut = kq.nextDouble();
      a.withdraw(rut);
    }


     void output(){
        System.out.println("thong tin tai khoan========================== ");
         Account a =new Account(stk,ttk,du);
        a.displayBalance();
        System.out.println("\n--- Thuc hien giao dich nap tien ---");
        naptien();
        System.out.println("\n--- Thuc hien giao dich rut tien ---");
        ruttien();


     }

    public static void main(String[] args) {
        
      MainBank MB =new MainBank();
      MB.input();
      MB.output();

      
    }

}
