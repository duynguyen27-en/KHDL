
package buoi13;

public class SVCQ extends DaiHocA{
    private double diemRL;
    
    public SVCQ(String maSV, String tenSV, NgaySinh ngaySinh, String nganhHoc, double diemTB,double diemRL) {
        super(maSV, tenSV, ngaySinh, nganhHoc, diemTB);
        this.diemRL=diemRL;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+diemRL;
    }
    
    

    public double getDiemRL() {
        return diemRL;
    }

    public void setDiemRL(double diemRL) {
        this.diemRL = diemRL;
    }

    @Override
    public boolean xetHHocBong() {
       return this.diemTB>7.5 && this.diemRL>7.5;
    }
    
    
    
}
