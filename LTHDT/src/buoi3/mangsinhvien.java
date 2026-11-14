package buoi3;
import java.util.ArrayList;

public class mangsinhvien {
    ArrayList<HocSinh> a =new ArrayList<>();
    void input(){
        a.add(new HocSinh(0,"sv001","bao cong",true,8.9,7.6,7,9));
        a.add(new HocSinh(0,"sv002","cong ton sach",true,9.2,8.6,9,4));
        a.add(new HocSinh(0,"sv006","hoang hau",false,9.5,7.4,8.9,9.4));
        a.add(new HocSinh(0,"sv007","vuong trieu",true,8.3,8.6,9,5));
        a.add(new HocSinh(0,"sv004","ly nuong nuong",false,5.6,2.6,7.5,4.9));

    }
    void xuatmang(){
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i).toString());
        }
    }
     public double tinhtbtheogioitinh(boolean gt){
        double sum=0;
        int s=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i).getgt()==gt){
                sum+=a.get(i).tinhDTB();
                s++;
            }
        }
        if(s==0) return 0;
        double dtb = sum/s;
        return Math.round(dtb*100.0)/(100.0);
     }
     public double diembqmontoan(){
        double sum=0;
        int s=0;
        for(int i=0;i<a.size();i++){
            sum+=a.get(i).gettoan();
            s++;
            }
             if(s==0) return 0;
             double dtb = sum/s;
        return Math.round(dtb*100.0)/(100.0);

        }

       public double diembqmonvan(){
        double sum=0;
        int s=0;
        for(int i=0;i<a.size();i++){
            sum+=a.get(i).getvan();
            s++;
            }
             if(s==0) return 0;
             double dtb = sum/s;
        return Math.round(dtb*100.0)/(100.0);

        }
        public void hocbong(){
            System.out.println("======hoc bong======");
            for(int i=0;i<a.size();i++){
                if(a.get(i).tinhDTB()>8 && (a.get(i).gettoan()>=7.5 && a.get(i).getvan()>=7.5)){
                    System.out.println(a.get(i).toString()+" --> ban duoc hoc bong");
                }
            }
        
        }
      void sapxep(){
        for(int i=0;i<a.size()-1;i++){
            for(int j=i+1;j<a.size();j++){
                if(a.get(i).gettinhDTB()<a.get(j).gettinhDTB()){
                    HocSinh temp = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,temp);
                }
            }
        }
        System.out.println("======DSHS sau khi sap xep=====");
        xuatmang();
      }
    public void xachdinhvithu(){
        System.out.println("======xac dinh vi thu======");
        if(a.isEmpty()) return;
        a.get(0).setvithu(1);
        for(int i=1;i<a.size();i++){
            if(a.get(i).tinhDTB()==a.get(i-1).tinhDTB()){
               a.get(i).setvithu(a.get(i-1).getvithu());   
            }else{
                a.get(i).setvithu(i+1);
            }
        }
        xuatmang();
    }


   void output(){
    System.out.println("======DSHS vua tao======");
    xuatmang();
    System.out.println("DTB nam :"+tinhtbtheogioitinh(true));
    System.out.println("DTB nu :"+tinhtbtheogioitinh(false));
    System.out.println("diem binh quan mon toa la :"+diembqmontoan());
    System.out.println("diem binh quan mon van la :"+diembqmonvan());
    hocbong();
    sapxep();
    xachdinhvithu();
   }

    public static void main(String[] args) {
        mangsinhvien dd = new mangsinhvien();
        dd.input();
        dd.output();
        
    }

}
