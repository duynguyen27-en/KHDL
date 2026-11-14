
package Luyen5;

public class HocGuitar extends HocVien implements IHocPhi{
    private double heSo;
    
    public HocGuitar(String maHV, String tenHV, String soCM, NgayNhap ngayNhap, double donGia,double heSo) {
        super(maHV, tenHV, soCM, ngayNhap, donGia);
        this.heSo=heSo;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+heSo;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    @Override
    public double tinhHocPhi() {
        double tong =0;
        if(heSo<=2){
            tong+=(donGia*heSo)-(donGia*heSo)*0.3;
        }else{
            tong+=(donGia*heSo)-(donGia*heSo)*0.2;
        }
        
        return Math.round(tong*100.0)/(100.0);
        
    }
    
    
    
    
}
