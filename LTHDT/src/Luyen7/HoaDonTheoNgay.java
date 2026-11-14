
package Luyen7;

public class HoaDonTheoNgay extends HoaDon{
    private int soNgayThue;

    public HoaDonTheoNgay(String maHD, String tenKhach, NgayHD ngayHD, double donGia,int soNgayThue) {
        super(maHD, tenKhach, ngayHD, donGia);
        this.soNgayThue = soNgayThue;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+soNgayThue;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }
    
    

    @Override
    public double tinhThanhTien() {
        double tong=0;
        if(soNgayThue>7){
            tong+= soNgayThue*donGia +(soNgayThue-7)*donGia*0.8;
        }else{
            tong+=soNgayThue*donGia;
        }
        return Math.round(tong*100.0)/(100.0);
    }
    
}
