package buoi12;

public class TiVi extends SanPham {

    private String mau;
    private int nam;
    private String hangSX;

    public TiVi(String maSp, double donGia, double soLuong, String mau, int nam, String hangSX) {
        super(maSp, donGia, soLuong);
        this.mau = mau;
        this.nam = nam;
        this.hangSX = hangSX;
    }
    

    @Override
    public double tinhChietKhau() {
        double tong =0;
        if(soLuong>=150){
            tong+=soLuong*donGia*0.2;

        }else{
            tong+=0;
        }
        return Math.round(tong*100.0)/(100.0);
        
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    @Override
    public String toString() {
       return super.toString()+"\t"+mau+"\t"+nam+"\t"+hangSX+"\t"+tinhChietKhau();
    }

}
