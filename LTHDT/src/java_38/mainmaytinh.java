package java_38;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class mainmaytinh {
ArrayList<maytinh> a = new ArrayList<>();
public void docfile(String tenfile){
    try {
        File f = new File(tenfile);
        if(f.exists()){
            System.out.println("doc File thanh cong");
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                String line = sc.nextLine();
                String s[] = line.split(",");
                String tenhang = s[0].trim();
                String maquocgia = s[1].trim();
                String tenquocgia = s[2].trim();
                quocgia qg = new quocgia(maquocgia,tenquocgia);
                hangsanxuat hsx = new hangsanxuat(tenhang,qg);
                int ngay = Integer.parseInt(s[3].trim());
                 int thang = Integer.parseInt(s[4].trim());
                  int nam = Integer.parseInt(s[5].trim());
                  ngayLR n = new ngayLR(ngay,thang,nam);
                  long gia = Long.parseLong(s[6].trim());
                  int baohanh = Integer.parseInt(s[7].trim());
                 a.add(new maytinh(hsx,n,gia,baohanh));

            }
        }else System.out.println("File khong ton tai");
        
    } catch (Exception e) {
    }
}
public void xuatmang(){
    for(int i=0;i<a.size();i++){
        System.out.println(a.get(i).toString());
    }

}
public void giarehon(){
    System.out.println("=========cac may tinh co gia re hon======");

    maytinh may = a.get(0);
    for(int i=1;i<a.size();i++){
        if(a.get(i).chakegia(may)){
            System.out.println("-> May thu " + (i+1) + " (Hang " + a.get(i).gethangsanxuat().gettenhang() 
                + " - Gia: " + a.get(i).getGia() + ") RE HON may dau tien (Hang " 
                + may.gethangsanxuat().gettenhang() + " - Gia: " + may.getGia() + ")");
            
        }
    }
}
public void tenquocgia(){
    System.out.println("========cac may tinh san xuat boi cac quoc gia=======");
    for(int i=0;i<a.size();i++){
        System.out.println("quoc gia :"+a.get(i).gethangsanxuat().getquocgia().gettenquocgia());
    }
    
}

public void output(){
    System.out.println("=========danh sach cac may tinh========");
    xuatmang();
    giarehon();
    tenquocgia();
}

    public static void main(String[] args) {
        mainmaytinh dd = new mainmaytinh();
        
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\java_38\\maytinh.txt");
        dd.output();   
          
    }

}
