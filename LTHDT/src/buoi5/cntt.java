package buoi5;

public class cntt extends sinhvien {
    private double java,css,html;
    public cntt(String masv,String hoten,boolean gt,double java,double css,double html){
        super(masv,hoten,gt);
        this.java=java;
        this.css=css;
        this.html=html;
    }
    public String toString(){
        return super.toString()+"\t"+java+"\t"+css+"\t"+html;
    }
    public double tinhDTB(){
        double tb = (java*2+css+html)/4;
        return Math.round(tb*100.0)/(100.0);
    }
    public String xeploai(){
        double tb = tinhDTB();
        if(tb<3.5)
            return "kem";
        if(tb<5)
            return "yeu";
        if(tb<6.5)
            return "trung binh";
        if(tb<8)
            return "kha";
        if(tb<9.5)
            return "gioi";
        return "xuat sac";
    }
    public String getmasv(){
        return super.masv;
    }
    public void setmasv(String masv){
        super.masv=masv;
    }
    public String gethoten(){
        return super.hoten;
    }
    public void sethoten(String hoten){
        super.hoten=hoten;
    }
    public boolean getgt(){
        return super.gt;
    }
    public void setgt(boolean gt){
        super.gt=gt;
    }  
    public double getjava(){
        return java;
    }
    public void setjava(double java){
        this.java=java;
    }
    public double getcss(){
        return css;
    }
    public void setcss(double css){
        this.css=css;
    }
    public double gethtml(){
        return html;
    }
    public void sethtml(double html){
        this.html=html;
    }    
    

}
