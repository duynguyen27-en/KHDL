package java_35;
public class sach {
    private String tensach;
    private  double giaban;
    private int namsanxuat;
    private tacgia tacgia;
    public sach(String tensach,double giaban,int namsanxuat,tacgia tacgia){
        this.tensach = tensach;
        this.giaban = giaban;
        this.namsanxuat = namsanxuat;
        this.tacgia = tacgia;
    }

    @Override
    public String toString() {
        return this.tensach+"/"+this.giaban+"/"+this.namsanxuat+"/"+this.tacgia.toString();
    }
    public boolean kiemtracungnamxuatban(sach sachkhac){
        return this.namsanxuat==sachkhac.namsanxuat;
    }

    public String gettensach(){
        return this.tensach;
    }
    public void settensach(String tensach){
        this.tensach=tensach;
    }
     public double getgiaban(){
        return this.giaban;
    }
    public void setgiaban(double giaban){
        this.giaban=giaban;
    }
     public int getnamsanxuat(){
        return this.namsanxuat;
    }
    public void setnamsanxuat(int namsanxuat){
        this.namsanxuat = namsanxuat;
    }


}
