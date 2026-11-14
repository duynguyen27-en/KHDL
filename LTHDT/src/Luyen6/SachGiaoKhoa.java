
package Luyen6;

public class SachGiaoKhoa extends DanhMuc{
    private String khoiLop;

    public SachGiaoKhoa(String ten, String nhaXB, NamXB namXB, String tacGia, int soTrang, double giaBan, int soLuong, String khoiLop) {
        super(ten, nhaXB, namXB, tacGia, soTrang, giaBan, soLuong);
        this.khoiLop= khoiLop;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+khoiLop;
    }

    public String getKhoiLop() {
        return khoiLop;
    }

    public void setKhoiLop(String khoiLop) {
        this.khoiLop = khoiLop;
    }
    
    

    @Override
    public double tinhThanhTien() {
        double tong = giaBan*soLuong*0.9;
        return Math.round(tong*100.0)/(100.0);
    }
    
}
