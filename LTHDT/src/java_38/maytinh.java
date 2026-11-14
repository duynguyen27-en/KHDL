package java_38;

public class maytinh {
    private hangsanxuat hangsanxuat;
    private ngayLR ngayLR;
    private long gia;
    private  int baohanh;
public maytinh( hangsanxuat hangsanxuat, ngayLR ngayLR, long gia, int baohanh) {
    
    this.hangsanxuat = hangsanxuat;
    this.ngayLR = ngayLR;
    this.gia = gia;
    this.baohanh = baohanh;
}
public String toString() {
    return hangsanxuat.toString()+"\t"+ngayLR.toString()+"\t"+gia+"\t"+baohanh;
}
public boolean chakegia(maytinh mtkhac){
    return this.gia<mtkhac.gia;

}
public hangsanxuat gethangsanxuat() {
    return hangsanxuat;
}
public void sethangsanxuat(hangsanxuat hangsanxuat) {
    this.hangsanxuat = hangsanxuat;
}
public ngayLR getNgayLR() {
    return ngayLR;
}
public void setNgayLR(ngayLR ngayLR) {
    this.ngayLR = ngayLR;
}
public long getGia() {
    return gia;
}
public void setGia(long gia) {
    this.gia = gia;
}
public int getBaohanh() {
    return baohanh;
}
public void setBaohanh(int baohanh) {
    this.baohanh = baohanh;
}
public boolean kiemtrabaohanh(maytinh mtkhac){
    return this.baohanh==mtkhac.baohanh;
}
    

}
