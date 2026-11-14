package java_35;

public class tacgia {
    
    private String tentacgia;
    private ngay ngaysinh;
    public tacgia(String tentacgia, ngay ngaysinh){
        this.tentacgia = tentacgia;
        this.ngaysinh = ngaysinh;
        
    }
    
   
    @Override
    public String toString() {
        return tentacgia+"/"+ngaysinh.toString();
    }

    public String gettentacgia(){
        return this.tentacgia;
    }
    public void settentacgia(String tentacgia ){
        this.tentacgia = tentacgia;
    }
    public ngay getngaysinh(){
        return this.ngaysinh;
    }
    public void setngaysinh(ngay ngaysinh ){
        this.ngaysinh = ngaysinh;
    }
    

}
