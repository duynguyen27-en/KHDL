package java_37;

public class lop {
    private String tenlop;
    private String tenkhoa;

    public lop(String tenlop,String tenkhoa){
        this.tenlop = tenlop;
        this.tenkhoa = tenkhoa;
    }

    @Override
    public String toString() {
        return tenlop+"\t"+tenkhoa;
    }
    public String gettenlop(){
        return tenlop;
    }
    public String gettenkhoa(){
        return tenkhoa;
    }
    public void settenlop(String tenlop){
        this.tenlop = tenlop;
    }
    public void settenkhoa(String tenkhoa){
        this.tenkhoa = tenkhoa;
    }
    

}
