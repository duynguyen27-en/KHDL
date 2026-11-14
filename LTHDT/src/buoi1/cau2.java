
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi1;
import java.util.Scanner;

public class cau2 {
    int a, b;
    void input(){
    Scanner kq = new Scanner(System.in);
    System.out.print("nhap so a :");
    a = kq.nextInt();
    System.out.print("nhap so b :");
    b = kq.nextInt();
}
    void output(){
    System.out.println("tong:"+a+"+"+b+"="+(a+b));
    System.out.println("hieu:"+a+"-"+b+"="+(a-b));
    System.out.println("tich:"+a+"*"+b+"="+(a*b));
    System.out.println("thuong:"+a+":"+b+"="+((double)a/b));
    System.out.println("chia nguyen :"+a+"/"+b+"="+(a/b));
    System.out.println("chia du :"+a+"%"+b+"="+(a%b));
    System.out.println("mu :"+a+"^"+b+"="+(Math.pow(a,b)));
}
    
    public static void main(String[] args) {
        cau2 a = new cau2();
        a.input();
        a.output();
    }
}
