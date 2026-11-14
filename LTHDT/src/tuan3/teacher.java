package tuan3;

public class teacher extends person {  //ke thua tu lop person
    private long luong;
    public teacher(String id, String hoten, int namsinh, long luong) {
        super(id,hoten,namsinh);    
        this.luong = luong;  // goiphuong thuc constructor cua lop cha

}
public long getluong(){
    return luong;
}
public void setluong(long luong){
    this.luong = luong;
}
@Override
public String toString() {
    return super.toString()+"\t"+luong;  // ghi đe phuong thuc toString de in ra thong tin cua doi tuong
}


}
