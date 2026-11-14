
package Luyen5;

public class HocPiano extends HocVien implements IHocPhi{
    private double hocPhi;
    
    public HocPiano(String maHV, String tenHV, String soCM, NgayNhap ngayNhap, double donGia,double hocPhi) {
        super(maHV, tenHV, soCM, ngayNhap, donGia);
        this.hocPhi= hocPhi;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+hocPhi;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public double tinhHocPhi() {
        double tong =0;
        if(hocPhi<=800){
            tong+=(donGia + hocPhi) -(donGia+hocPhi)*0.3;
        }else{
            tong+=(donGia+ hocPhi)-(donGia + hocPhi)*0.2;
        }
        
        return Math.round(tong*100.0)/(100.0);
        
    }
    
    
    
}
