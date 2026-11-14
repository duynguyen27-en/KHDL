package tuan3;

public class person {
    protected String id;  // từ khóa protected chỉ cho phép lớp con truy cập 
    protected String hoten;
    protected int namsinh;

public person(String id, String hoten, int namsinh) {
    this.id = id;
    this.hoten = hoten;
    this.namsinh = namsinh;
}
public String getid(){
    return id;
}
public void setid(String id){
    this.id = id;
}
public String gethoten(){
    return hoten;
}
public void sethoten(String hoten){
    this.hoten = hoten;
}
public int getnamsinh(){
    return namsinh;
}
public void setnamsinh(int namsinh){
    this.namsinh = namsinh;
}

    @Override
    public String toString() {  // ghi de phuong thuc toString de in ra thong tin cua doi tuong
        return id+"\t"+hoten+"\t"+namsinh;
    }
}
