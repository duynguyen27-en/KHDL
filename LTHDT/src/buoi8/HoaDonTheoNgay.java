package buoi8;

public class HoaDonTheoNgay extends HoaDon {
    private int soNgayThue;
    public HoaDonTheoNgay(String maHD,String tenKhach,NgayHD ngayHD,double donGia,int soNgayThue){
        super(maHD,tenKhach,ngayHD,donGia);
        this.soNgayThue=soNgayThue;
    }
    @Override
    public String toString(){
        return super.toString()+"\t "+soNgayThue;
    }
    @Override
    public double tinhTien(){
        double tt;
        if(soNgayThue>7){
        tt = getDonGia()*7+ getDonGia()*(soNgayThue-7)*(0.8);
        }else{
            tt = getDonGia()*soNgayThue;
        }
        return Math.round(tt*100.0)/(100.0);
    }
    public int getSoNgayThue(){
        return soNgayThue;
    }
    public void setSoNgayThue(int soNgayThue){
        this.soNgayThue=soNgayThue;
    }
}
