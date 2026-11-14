package tuan1;
import java.util.ArrayList;
import java.util.Scanner;
public class Cau8 {
    ArrayList<Double> a = new ArrayList<>();    
    void input(){
        Scanner kq = new Scanner(System.in);
        System.out.print("nhap so n la:");
        int n = kq.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            double phantu = kq.nextDouble();
            a.add(phantu);
        }

    }
   void xuatmang(){
    for(int i=0;i<a.size();i++){
        System.out.print(a.get(i)+" ");
    }
    System.out.println("");
   }


   double timmax(){
     double max = a.get(0);
    for(int i=0;i<a.size();i++){
        if(a.get(i)>max){
            max = a.get(i);
        }
    }
    return max;
}
void maxmin(){
    double max = a.get(0);
    double min = a.get(0);
    for(int i=0;i<a.size();i++){
        if(a.get(i)>max){
            max = a.get(i);
        }
        if(a.get(i)<min){
            min= a.get(i);
        }
    }
    System.out.println("diem lon nhat va diem thap nhat la :"+max + " va "+min);
}
 void dem(){
    int count=0;
     for(int i=0;i<a.size();i++){
        if(a.get(i)>= 2.5){
            count++; 
            System.out.print(a.get(i)+" ");
        }
     }
     System.out.println();
     System.out.print("so luong sv co GAP >=2.5 la :"+count);
    
 }
 void timsv(){
    int k=-1;
    double max = timmax();
    for(int i=0;i<a.size();i++){
        if(a.get(i)==max){
            k=i;
            break;
        }
    }
    if(k==-1){
        System.out.print("\nkhong co sinh vien nao dat diem tuyet doi");
    }else{
        System.out.print("\nsv dat diem tuyet doi thu: "+k);
    }
 }


    void output(){
           System.out.print("mang moi nhap la :");
           xuatmang();
           maxmin();
           System.out.print("so diem sinh vien có GAP >=2.5 la : ");
           dem();
           timsv();
           
    }



    public static void main(String[] args) {
        Cau8 dd = new Cau8();
        dd.input();
        dd.output();
    }

}
