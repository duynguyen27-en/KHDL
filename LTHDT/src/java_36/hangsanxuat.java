package java_36;

public class hangsanxuat {
    private  String tenhang;
    private String quocgia;

    public hangsanxuat(String tenhang,String quocgia)
    {
        this.tenhang=tenhang;
        this.quocgia=quocgia;
    }
    public String toString()
    {
        return tenhang+" \t"+quocgia;
    }
    public String gettenhang(){
        return tenhang;
    }
    public String getquocgia(){
        return quocgia;
    }
    public void settenhang(String tenhang){
        this.tenhang=tenhang;
    }
    public void setquocgia(String quocgia){
        this.quocgia=quocgia;
    }
    

}
