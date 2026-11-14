package java_36;

public class ngay {
    private int ngay;
    private int thang;
    private int nam;

    public ngay(int ngay,int thang,int nam)
    {
        this.ngay=ngay;
        this.thang=thang;
        this.nam=nam;
    }
    public String toString()
    {
        return ngay+"/"+thang+"/"+nam;
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
