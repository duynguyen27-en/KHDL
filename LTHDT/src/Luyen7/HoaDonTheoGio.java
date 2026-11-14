
package Luyen7;

public class HoaDonTheoGio extends HoaDon{
    private int soGioThue;

    public HoaDonTheoGio(String maHD, String tenKhach, NgayHD ngayHD, double donGia,int soGioThue) {
        super(maHD, tenKhach, ngayHD, donGia);
        this.soGioThue=soGioThue;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+soGioThue;
    }

    public int getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        this.soGioThue = soGioThue;
    }
    

    @Override
    public double tinhThanhTien() {
        return Math.round((soGioThue*donGia)*100.0)/(100.0);
    }
    
}
