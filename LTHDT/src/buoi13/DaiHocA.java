
package buoi13;

public abstract class DaiHocA {
    protected String maSV,tenSV;
    protected NgaySinh ngaySinh;
    protected String nganhHoc;
    protected double diemTB;

    public DaiHocA(String maSV, String tenSV, NgaySinh ngaySinh, String nganhHoc, double diemTB) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.nganhHoc = nganhHoc;
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return maSV+"\t"+tenSV+"\t"+ngaySinh+"\t"+nganhHoc+"\t"+diemTB;
    }
    public abstract boolean xetHHocBong();
    
    
    

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public NgaySinh getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(NgaySinh ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    
    
    
}
