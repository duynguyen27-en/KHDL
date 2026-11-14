package buoi4;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class mangcntt {
    ArrayList<CNTT> a = new ArrayList<>();
  public void docFile(String tenfile){
    try {
        File f = new File(tenfile);
        if(f.exists()){
            System.out.println("file da doc thanh cong");
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                String line = sc.nextLine();
                String s[] = line.split(",");
                String masv = s[0].trim();
                String tensv = s[1].trim();
                boolean gt = Boolean.parseBoolean(s[2].trim());
                double java = Double.parseDouble(s[3].trim());
                double css = Double.parseDouble(s[4].trim());
                double html = Double.parseDouble(s[5].trim());
                a.add(new CNTT(masv,tensv,gt,java,css,html));
            }


        }else System.out.println("file không tồn tại");
    } catch (Exception e) {
    }
    
  }
  public void xuatmang(){
    for(int i=0;i<a.size();i++){
        System.out.println(a.get(i).toString());
    }
  }
  public double diemtbtheogt(boolean gt){
      double sum =0;
      int s=0;
      for(int i=0;i<a.size();i++){
        if(a.get(i).getgt()==gt){
          sum+=a.get(i).tinhDTB();
          s++;
        }
      }
      double dtb = sum/s;
      return Math.round(dtb*100.0)/(100.0);
  }
  public double diemtbhocsinhkha(String hsk){
    double sum=0;
    int s=0;
    for(int i=0;i<a.size();i++){
      if(a.get(i).hocluc()==hsk){
        sum+=a.get(i).tinhDTB();
        s++;

      }
    }
    double dtb = sum/s;
    return Math.round(dtb*100.0)/(100.0);
  }
  void sapxep(){
    for(int i=0;i<a.size()-1;i++){
      for(int j=i+1;j<a.size();j++){
        if(a.get(i).tinhDTB()>a.get(j).tinhDTB()){
          CNTT temp = a.get(i);
          a.set(i,a.get(j));
          a.set(j,temp);
        }
      }
    }
    System.out.println("=======danh sach sinh vien sau khi sap xep======");
    xuatmang();
  }
  public void hoclucgioi(String hlg){
    System.out.println("========danh sach hoc sinh gioi========");
    for(int i=0;i<a.size();i++){
      if(a.get(i).hocluc()==hlg){
        System.out.println(a.get(i).toString());
      }
    }
  }
public void xacdinhvithu(){
  System.out.println("========danh sach sinh vien sau khi xep hang========");
  for(int i=0;i<a.size();i++){
    int dem=0;
    for(int j=0;j<a.size();j++){
      
      if(a.get(i).tinhDTB()< a.get(j).tinhDTB()){
       dem++;   
      }
  }
   System.out.println(a.get(i).gettensv()+"--> "+a.get(i).tinhDTB()+"--> vi thu :"+(dem+1));
}
}
 public void output(){
    System.out.println("=======danh sach sinh vien======");
    xuatmang();
    System.out.println("diem tb nam :"+diemtbtheogt(true));
    System.out.println("diem tb nu :"+diemtbtheogt(false));
     System.out.println("diem tb hoc sinh kha :"+diemtbhocsinhkha("kha"));
     sapxep();
     hoclucgioi("gioi");
     xacdinhvithu();

  
  }


    public static void main(String[] args) {
      mangcntt dd = new mangcntt();
      dd.docFile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\buoi4\\CNTT.txt"); 
      dd.output();
        
    }

}
