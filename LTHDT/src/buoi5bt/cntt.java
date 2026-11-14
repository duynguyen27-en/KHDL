package buoi5bt;
public class cntt extends sinhvien {
    private double java,css,html;
    public cntt(String masv,String hoten,boolean gt,double java,double css,double html)
    {
        super(masv,hoten,gt);
        this.java=java;
        this.css=css;
        this.html=html;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\t"+java+"\t"+css+"\t"+html;
    }
    @Override
    public double tinhDTB(){
        double tb=(java*2+css+html)/4;
        return Math.round(tb*100.0)/(100.0);
    }
    public double monhesohai(){
        return this.java;
    }

    public double getjava(){
        return java;
    }
    public double getcss(){
        return css;
    }
    public double gethtml(){
        return html;
    }
    public void setjava(double java){
        this.java=java;
    }
    public void setcss(double css){
        this.css=css;
    }
    public void sethtml(double html){
        this.html=html;
    }
    

}
