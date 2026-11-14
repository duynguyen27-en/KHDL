package baitap;
public class book {
    private String bookID;
    private String title;
    private double price;
    private int quantity;

    public book(String bookID,String title, double price,int quantity){
        this.bookID = bookID;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "bookID:"+bookID+"\t tên sach:"+title+"\t gia tien:"+price+"\t so luong:"+quantity+"";
    }
    public String getbookID(){
        return this.bookID;
    }
    public String gettitle(){
        return this.title;
    }
    public double getprice(){
        return this.price;
    }
    public int getquantity(){
        return this.quantity;
    }
    public void setbookID(String bookID){
        this.bookID = bookID;
    }
    public void settitle(String title){
        this.title = title;
    }
    public void setprice(double price){
        if(price>0){
            this.price = price;
        }else{
            System.out.println("loi!");
            this.price=0;
        }
    }
    public void setquantity(int quantity){
        if(quantity>0){
            this.quantity = quantity;
        }else{
            System.out.println("loi!");
            this.quantity=0;
        }
    }
}
