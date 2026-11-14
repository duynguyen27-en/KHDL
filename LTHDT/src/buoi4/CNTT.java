package buoi4;

public class CNTT {
    private String masv,tensv;
    private boolean gt;
    private double java,css,html;
    public CNTT(String masv,String tensv,boolean gt,double java,double css,double html)
    {
        this.masv=masv;
        this.tensv=tensv;
        this.gt=gt;
        this.java=java;
        this.css=css;
        this.html=html;
    }
    public double tinhDTB()
    {
        double dtb = (java*2+css+html)/4;
        return Math.round(dtb*100.0)/(100.0);
    }

  public String hocluc()
  {
    double diemtb = tinhDTB();
        if (diemtb < 3.5)
            return "kem";
        if (diemtb < 5)
            return "yeu";
        if (diemtb < 6.5)
            return "trung binh";
        if (diemtb < 8)
            return "kha";
        if (diemtb < 9)
            return "gioi";
        return "xuat sac";
  }

    public String getmasv()
    {
        return masv;
    }
    public String gettensv()
    {
        return tensv;
    }
    public boolean getgt()
    {
        return gt;
    }
    public double getjava()
    {
        return java;
    }
    public double getcss()
    {
        return css;
    }
    public double gethtml()
    {
        return html;
    }
    public void setmasv(String masv)
    {
        this.masv=masv;
    }
    public void settensv(String tensv)
    {
        this.tensv=tensv;
    }
    public void setgt(boolean gt)
    {
        this.gt=gt;
    }
    public void setjava(double java)
    {
        this.java=java;
    }
    public void setcss(double css)
    {
        this.css=css;
    }
    public void sethtml(double html)
    {
        this.html=html;
    }
    public double getdtb()
    {
        return (java+css+html)/3;
    }
    public String toString()
    {
        return " "+masv+" \t "+tensv+" \t "+gt+" \t "+java+" \t "+css+" \t "+html+" ";
    }

}
