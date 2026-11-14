
package Luyen4;

public class SachGiaoKhoa extends Sach implements ISach{
    private boolean tinhTrang;
    
    public SachGiaoKhoa(String ma, String ten, NgayNhap ngayNhap, double donGia, int soLuong,boolean tinhTrang) {
        super(ma, ten, ngayNhap, donGia, soLuong);
        this.tinhTrang=tinhTrang;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+(tinhTrang?"Moi":"cu");
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public double tinhThanhTien() {
        double tong ;
       if(tinhTrang){
           tong=donGia*soLuong;
           
       }else{
           tong = (donGia*soLuong)*0.5;
       }
       return Math.round(tong*100.0)/(100.0);
    }
    
    
    
}
