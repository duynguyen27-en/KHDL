
package Luyen3;

public class HangGiaDung extends SanPham implements IKho{
    private String chatLieu;
    
    public HangGiaDung(String ma, String hoTen, NgayNhap ngayNhap, double giaGoc,String chatLieu) {
        super(ma, hoTen, ngayNhap, giaGoc);
        this.chatLieu=chatLieu;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+chatLieu;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }
    public double thue(){
        return Math.round((giaGoc*0.05)*100/0)/(100.0);
    }

    @Override
    public double tinhGiaBan() {
       return (giaGoc+thue());
    }
    
    
}
