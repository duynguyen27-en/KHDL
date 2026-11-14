package tuan1;
import java.util.Scanner;
public class Cau2 {
    int math,physics,chemistry;
    void input(){
  Scanner kq = new Scanner(System.in);
      System.out.print("nhap diem toan :");
      math = kq.nextInt();
      System.out.print("nhap diem ly :");
      physics = kq.nextInt();
      System.out.print("nhap diem hoa :");
      chemistry = kq.nextInt();
    }

    void output(){
        float tb = (float)(math+physics+chemistry)/3;
        float gpa = (float)(tb*0.4);
        int  gap = (int)gpa;
        System.out.println("diem trung binh :"+tb);
        System.out.println("gpa :"+gpa);
        System.out.println("gap :"+gap);
         


    }
    public static void main(String[] args) {
        Cau2 a = new Cau2();
        a.input();
        a.output();
    }

}
