package java_37;

public class ngaysinh {
    private int ngay;
    private int thang;
    private int nam;
    public ngaysinh(int ngay,int thang,int nam)
    {
        this.ngay=ngay;
        this.thang=thang;
        this.nam=nam;
    }
    @Override
    public String toString(){
        return ngay+"/"+thang+"/"+nam;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        ngaysinh other = (ngaysinh) obj;
        if(ngay != other.ngay)
            return false;
        if(thang != other.thang)
            return false;
        if(nam != other.nam)
            return false;
        return true;

    }
    
    public int getngay(){
        return ngay;
    }
    public int getthang(){
        return thang;
    }
    public int getnam(){
        return nam;
    }
    public void setngay(int ngay){
        this.ngay=ngay;
    }
    public void setthang(int thang){
        this.thang=thang;
    }
    public void setnam(int nam){
        this.nam=nam;
    }

}
