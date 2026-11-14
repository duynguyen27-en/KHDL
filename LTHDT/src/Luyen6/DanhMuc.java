
package Luyen6;

public abstract class DanhMuc {
    protected String ten,nhaXB;
    protected NamXB namXB;
    protected String tacGia;
    protected int soTrang;
    protected double giaBan;
    protected int soLuong;

    public DanhMuc(String ten, String nhaXB, NamXB namXB, String tacGia, int soTrang, double giaBan, int soLuong) {
        this.ten = ten;
        this.nhaXB = nhaXB;
        this.namXB = namXB;
        this.tacGia = tacGia;
        this.soTrang = soTrang;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }
    public abstract double tinhThanhTien();

    @Override
    public String toString() {
        return ten+"\t"+nhaXB+"\t"+namXB+"\t"+tacGia+"\t"+soTrang+"\t"+giaBan+"\t"+soLuong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public NamXB getNamXB() {
        return namXB;
    }

    public void setNamXB(NamXB namXB) {
        this.namXB = namXB;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
