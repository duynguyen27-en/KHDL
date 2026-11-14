package java_35;

public class ngay {
    private int ngay;
    private int thang;
    private int nam;
    public ngay(int ngay,int thang,int nam){
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    @Override
    public String toString() {
        return  ngay+"/"+thang+"/"+nam;
    }
  

  public int getngay(){
    return this.ngay;
  }
  public void setngay(int ngay){
    this.ngay=ngay;
  }
   public int getthang(){
    return this.thang;
  }
  public void setthang(int thang){
    this.thang=thang;
  }
   public int getnam(){
    return this.nam;
  }
  public void setnam(int nam){
    this.nam=nam;
  }

}
