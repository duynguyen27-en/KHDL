package btinterface;

public class NhanVienVanPhong extends NhanVien {
    private int soNgayCong;

    public NhanVienVanPhong(String maNV, String ten, double luongCoBan,int soNgayCong) {
        super(maNV,ten,luongCoBan);
        this.soNgayCong = soNgayCong;
    }

    @Override
    public String toString() {
      
        return super.toString()+"\t"+soNgayCong;
    }
    public double  tinhLuongThucNhan(){
        double luong = luongCoBan +(soNgayCong*150);
        return Math.round(luong*100.0)/(100.0);

    }
    public boolean kiemTraKhenThuong(){
        return (soNgayCong>=25);

    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
    




}
