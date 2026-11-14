
package buoi13;

public class SVQT extends DaiHocA{
    private String quocGia;
    private double diemIelts;
    
    public SVQT(String maSV, String tenSV, NgaySinh ngaySinh, String nganhHoc, double diemTB,String quocGia,double diemIelts) {
        super(maSV, tenSV, ngaySinh, nganhHoc, diemTB);
        this.quocGia=quocGia;
        this.diemIelts=diemIelts;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+quocGia+"\t"+diemIelts;
    }
    
    
    

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public double getDiemIelts() {
        return diemIelts;
    }

    public void setDiemIelts(double diemIelts) {
        this.diemIelts = diemIelts;
    }

    @Override
    public boolean xetHHocBong() {
        return this.diemTB>7&& this.diemIelts>6.5;
    }
    
    
    
}
