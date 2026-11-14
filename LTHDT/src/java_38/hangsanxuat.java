package java_38;

public class hangsanxuat {
    private String tenhang;
    private quocgia quocgia;
    public hangsanxuat(String tenhang, quocgia quocgia) {
        this.tenhang = tenhang;
        this.quocgia = quocgia;
    }
    public String toString() {
        return tenhang + "\t" + quocgia.toString();
    }
    public String gettenhang() {
        return tenhang;
    }
    public void settenhang(String tenhang) {
        this.tenhang = tenhang;
    }
    public quocgia getquocgia() {
        return quocgia;
    }
    public void setquocgia(quocgia quocgia) {
        this.quocgia = quocgia;
    }

}
