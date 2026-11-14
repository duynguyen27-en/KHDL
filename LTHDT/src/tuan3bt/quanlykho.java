package tuan3bt;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class quanlykho {
ArrayList<thietbi> a = new ArrayList<>();
public void docfile(String tenfile){
    try {
        File f = new File(tenfile);
        if(f.exists()){
            System.out.println("doc file thanh cong");
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                String line = sc.nextLine();
                String s[] = line.split(",");
                long gianhap = Long.parseLong(s[3].trim());
                int soluong = Integer.parseInt(s[4].trim());
                if(s[0].trim().equals("dt")){
                    String hedieuhang = s[5].trim();
                    a.add(new dienthoai(s[1].trim(),s[2].trim(),gianhap,soluong,hedieuhang));
                }else if(s[0].trim().equals("lt")){
                  int dungluongram = Integer.parseInt(s[5].trim());
                  a.add(new laptop(s[1].trim(),s[2].trim(),gianhap,soluong,dungluongram));
                }
            }
        } else System.out.println("File khong ton tai");
        
    } catch (Exception e) {
        System.out.println(e);
    }
}
public void xuatmang(){
    for(thietbi tb:a){
        System.out.println(tb.toString());
        
    }
}
public void lietketheoloai(){
    System.out.println("========dien thoai========");
    for(thietbi tb :a){
        if(tb instanceof dienthoai){
            System.out.println(tb.toString());
        }
    }
    System.out.println("========lap top========");
     for(thietbi tb :a){
        if(tb instanceof laptop){
            System.out.println(tb.toString());
        }
    }
}
public double tinhtonggiatrikho(){
    long tong=0;
    for(thietbi tb:a){
        tong+=tb.getgianhap()*tb.getsoluong();
    }
    return Math.round(tong*100.0)/(100.0);

}
public void laptopramkhung(){
    System.out.println("=========laptop ram khung========");
    for(thietbi tb:a){
        if(tb instanceof laptop){
            if(((laptop)tb).getdungluongram()>=16){
                System.out.println(tb.toString());
            }
        }
    }
}
public void  sotienbanduoc(){
    long tong =0;
    long tong2=0;
    for(thietbi tb:a){
        if(tb.getsoluong()>5){
            long giabanthucte = (long)(tb.tinhGB()-tb.tinhkhuyenmai(10));
            tong+=giabanthucte*tb.getsoluong();
            
        }else{
            tong2+=(long)(tb.tinhGB()*tb.getsoluong());
        }
    }
    System.out.println("tong tien ban duoc va giam gia la:"+tong);
    System.out.println("tong tien ban duoc ma khong giam gia la:"+tong2);
    
}


public void output(){

    System.out.println("=========thiet bi========");
    xuatmang();
    lietketheoloai();
    System.out.println("tong tien von dang khet trong kho:"+tinhtonggiatrikho());
    laptopramkhung();
    sotienbanduoc();
    
}

    public static void main(String[] args) {
        quanlykho dd = new quanlykho();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\tuan3bt\\thietbi.txt");
        dd.output();

    }

}