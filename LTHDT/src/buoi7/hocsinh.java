package buoi7;

public abstract class hocsinh {
    protected String mahs,hoten;
    protected ngaysinh ngaysinh;
    protected boolean gt;
    protected String lop;
    protected double nguvan,toan;

    public hocsinh(String mahs, String hoten, ngaysinh ngaysinh, boolean gt, String lop, double nguvan, double toan) {
        this.mahs = mahs;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gt = gt;
        this.lop = lop;
        this.nguvan = nguvan;
        this.toan = toan;
    }
    public abstract double tinhDTB();
    @Override
    public String toString() {
        return mahs+ "\t" +hoten+ "\t"+ngaysinh.toString()+"\t"+(gt?"nam":"nu")+"\t"+lop+"\t"+nguvan+"\t"+toan;
    }

    public String getmahs() {
        return mahs;
    }

    public void setmahs(String mahs) {
        this.mahs = mahs;
    }

    public String gethoten() {
        return hoten;
    }

    public void sethoten(String hoten) {
        this.hoten = hoten;
    }

    public ngaysinh getngaysinh() {
        return ngaysinh;
    }

    public void setngaysinh(ngaysinh ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public boolean isgt() {
        return gt;
    }

    public void setgt(boolean gt) {
        this.gt = gt;
    }

    public String getlop() {
        return lop;
    }

    public void setlop(String lop) {
        this.lop = lop;
    }

    public double getnguvan() {
        return nguvan;
    }

    public void setnguvan(double nguvan) {
        this.nguvan = nguvan;
    }

    public double gettoan() {
        return toan;
    }

    public void settoan(double toan) {
        this.toan = toan;
    }

    


}
