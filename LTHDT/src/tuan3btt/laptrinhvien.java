package tuan3btt;

public class laptrinhvien extends nhanvien {
    private int sogiotangca;
    private long luongtheogio;
    public laptrinhvien(String manv,String hoten,long luong,int sogiotangca,long luongtheogio){
        super(manv,hoten,luong);
        this.sogiotangca=sogiotangca;
        this.luongtheogio=luongtheogio;
    }
    @Override
    public String toString(){
        return super.toString()+"\t"+sogiotangca+"\t"+luongtheogio;
    }
    public long luongthucte(){
        long ltt=getluong()+(sogiotangca*luongtheogio);
        return ltt;    
    }
    public int getSogiotangca(){
        return sogiotangca;
    }
    public void setSogiotangca(int sogiotangca){
        this.sogiotangca=sogiotangca;
    }
    public long getLuongtheogio(){
        return luongtheogio;
    }
    public void setLuongtheogio(long luongtheogio){
        this.luongtheogio=luongtheogio;
    }

}
