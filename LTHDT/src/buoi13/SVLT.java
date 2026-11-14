
package buoi13;

public class SVLT extends DaiHocA{
    private String tenTruongTN;
    
    public SVLT(String maSV, String tenSV, NgaySinh ngaySinh, String nganhHoc, double diemTB,String tenTruongTN) {
        super(maSV, tenSV, ngaySinh, nganhHoc, diemTB);
        this.tenTruongTN=tenTruongTN;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+tenTruongTN;
    }
    
    
    

    public String getTenTruongTN() {
        return tenTruongTN;
    }

    public void setTenTruongTN(String tenTruongTN) {
        this.tenTruongTN = tenTruongTN;
    }

    @Override
    public boolean xetHHocBong() {
     return this.diemTB>7.5;
    }
    
    
    
}
