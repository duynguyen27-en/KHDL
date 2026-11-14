package buoi8;

public class HoaDonTheoGio extends HoaDon {
   protected int  soGioThue;

   public HoaDonTheoGio(String maHD,String tenKhach,NgayHD ngayHD,double donGia,int soGioThue){
    super(maHD,tenKhach,ngayHD,donGia);
    this.soGioThue=soGioThue;
   }
   @Override
   public String toString(){
    return super.toString()+"\t "+soGioThue;
   }
   @Override
   public double tinhTien(){
    double tt = getDonGia()*soGioThue;
    return Math.round(tt*100.0)/(100.0);
    }
   
   
   public int getSoGioThue(){
    return soGioThue;
   }
   public void setSoGioThue(int soGioThue){
    this.soGioThue=soGioThue;
   }
}
