
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi1;
import java.util.Scanner;
public class cau1 {
    int canh1,canh2;
    void input(){
        System.out.println("1.tinh s va p hinh chu nhat");
        Scanner kq= new Scanner(System.in);
        System.out.print("nhap canh 1 : ");
        canh1 = kq.nextInt();
        System.out.print("nhap canh 2 : ");
        canh2 = kq.nextInt();
    }
    void output(){
        System.out.println(" s= "+canh1+" * "+canh2+"="+(canh1*canh2));
        System.out.println("p=2*("+canh1+"+"+canh2+")="+2*(canh1+canh2));
    }
    public static void main(String[] args) {
        cau1 a= new cau1();
        a.input();
        a.output();
    }
}