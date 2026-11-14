package baitap;

public class product {
    private String proID;
    private String proname;
    private double price;

    public product(String proID, String proname, double price){
        this.proID = proID;
        this.proname = proname;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID:"+proID+"\t ten san pham:"+proname+"\t gia tien:"+price+"" ;

    }
    public String getproID(){
        return proID;
    }
    public String getproname(){
        return proname;
    }
    public double getprice(){
        return price;
    }
    public void setproID(String proID){
        this.proID = proID;
    }
    public void setproname(String proname){
        this.proname = proname;
    }
    public void setprice(double price){
        if(price>0){
            this.price = price;
        }else{
            System.out.println("loi!");
            this.price=0;
        }
    }  

}
