package buoi7;

public class ngaysinh {
    private int ngay,thang,nam;

    public ngaysinh(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    @Override
    public String toString() {
        return ngay+"/"+thang+"/"+nam;
    }
    public int getngay() {
        return ngay;
    }

    public void setngay(int ngay) {
        this.ngay = ngay;
    }

    public int getthang() {
        return thang;
    }

    public void setthang(int thang) {
        this.thang = thang;
    }

    public int getnam() {
        return nam;
    }

    public void setnam(int nam) {
        this.nam = nam;
    }

}
