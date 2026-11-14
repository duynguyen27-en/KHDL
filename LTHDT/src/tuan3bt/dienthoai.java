package tuan3bt;

public class dienthoai extends thietbi {
    private String hedieuhanh;

    public dienthoai(String mathietbi,String tenthietbi,long gianhap,int soluong,String hedieuhanh){
        super(mathietbi,tenthietbi,gianhap,soluong);
        this.hedieuhanh=hedieuhanh;
    }

    @Override
    public String toString(){
        return super.toString()+"\t"+hedieuhanh;
    }

    public double tinhGB(){
        double gb = super.getgianhap()*1.2;
        return Math.round(gb*100.0)/(100.0);
    }
    public String gethedieuhanh(){
        return hedieuhanh;
    }
    public void sethedieuhanh(String hedieuhanh){
        this.hedieuhanh=hedieuhanh;
    }
   


}
