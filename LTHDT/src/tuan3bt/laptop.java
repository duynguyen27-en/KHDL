package tuan3bt;

public class laptop extends thietbi {
    private int dungluongram;
    public laptop(String mathietbi,String tenthietbi,long gianhap,int soluong,int dungluongram){
        super(mathietbi,tenthietbi,gianhap,soluong);
        this.dungluongram=dungluongram;
    }
    @Override
    public String toString(){
        return super.toString()+"\t"+dungluongram;
    }
    public double tinhGB(){
        double gb = super.getgianhap()*1.35;
        return Math.round(gb*100.0)/(100.0);
    }
    public int getdungluongram(){
        return dungluongram;
    }
    public void setdungluongram(int dungluongram){
        this.dungluongram=dungluongram;
    }
    

}
