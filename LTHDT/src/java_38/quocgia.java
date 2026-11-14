package java_38;

public class quocgia {
    private String maquocgia,tenquocgia;
    public quocgia(String maquocgia, String tenquocgia) {
        this.maquocgia = maquocgia;
        this.tenquocgia = tenquocgia;
    }
    public String toString() {
        return maquocgia + "\t" + tenquocgia;
    }
    public String getmaquocgia() {
        return maquocgia;
    }
    public void setmaquocgia(String maquocgia) {
        this.maquocgia = maquocgia;
    }
    public String gettenquocgia() {
        return tenquocgia;
    }
    public void settenquocgia(String tenquocgia) {
        this.tenquocgia = tenquocgia;
    }

}
