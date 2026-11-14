
package Luyen6;

public class tieuThuyet extends DanhMuc{
    private String theLoai;

    public tieuThuyet(String ten, String nhaXB, NamXB namXB, String tacGia, int soTrang, double giaBan, int soLuong,String theLoai) {
        super(ten, nhaXB, namXB, tacGia, soTrang, giaBan, soLuong);
        this.theLoai=theLoai;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+theLoai;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
    
    

    @Override
    public double tinhThanhTien() {
        
        double tong = giaBan*soLuong*0.7;
        return Math.round(tong*100.0)/(100.0);
    }
    
}
