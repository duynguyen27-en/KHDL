package buoi3;

public class HocSinh {
    private String masv, hoten;
    private boolean gt;
    private double toan, ly, hoa, van;
    private  int vithu;

    public HocSinh(int vithu, String masv, String hoten, boolean gt, double toan, double ly, double hoa, double van) {
        this.masv = masv;
        this.hoten = hoten;
        this.gt = gt;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.van = van;
        this.vithu = vithu;
    }
    public double tinhDTB() {
       double dtb = 1.0*(toan*2+van*2+ly+hoa)/6;
       return Math.round(dtb*100.0)/(100.0);
    }

    public String xeploai() {
        double diemtb = tinhDTB();
        if (diemtb < 3.5)
            return "kem";
        if (diemtb < 5)
            return "yeu";
        if (diemtb < 6.5)
            return "trung binh";
        if (diemtb < 8)
            return "kha";
        if (diemtb < 9)
            return "gioi";
        return "xuat sac";
    }
    public static void main(String[] args) {
        HocSinh a = new HocSinh(1,"sv001", "nguyen duy nguyen", true, 8.2, 9, 7.9, 6.5);
        System.out.println(a);
    }
    @Override
    public String toString() {
        return  vithu+","+masv+","+hoten+","+(gt? "nam":"nu")+",toan="+toan+",ly="+ly+",hoa="+hoa+",van="+van+",DTB="+String.format("%.2f",tinhDTB())+",Xep Loai="+xeploai();
    }
    public double gettinhDTB() {
        return tinhDTB();
    }
    
    public int getvithu(){
        return vithu;
    }
    public void setvithu(int vithu){
        this.vithu = vithu;
    }
    public String getmasv(){
        return masv;
    }
    public String gethoten(){
        return hoten;
    }
    public boolean getgt(){
        return gt;
    }
    public double gettoan(){
        return toan;
    }
    public double getly(){
        return ly;
    }
    public double gethoa(){
        return hoa;
    }
    public double getvan(){
        return van;
    }
    public void setmasv(String masv){
        this.masv = masv;
    }
    public void sethoten(String hoten){
        this.hoten = hoten;
    }
    public void setgt(boolean gt){
        this.gt = gt;
    }
    public void settoan(double toan){
        this.toan = toan;
    }
    public void setly(double ly){
        this.ly = ly;
    }
    public void sethoa(double hoa){
        this.hoa = hoa;
    }
    public void setvan(double van){
        this.van = van;
    }
}
