package tuan3;

public class student extends person{    // kế thừa từ lớp person
    private double dtb;
    public student(String id, String hoten, int namsinh, double dtb) {
        super(id, hoten, namsinh);   // gọi constructor của lớp cha
        this.dtb = dtb;
    }
    public double getdtb(){
        return dtb;
    }
    public void setdtb(double dtb){
        this.dtb = dtb;
    }
    @Override
    public String toString() {
        return super.toString()+"\t"+dtb;   // ghi đe phuong thuc toString de in ra thong tin cua doi tuong
    }

}
