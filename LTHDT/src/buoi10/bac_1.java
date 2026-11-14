package buoi10;

public class bac_1 {
    protected double b,c;
    public bac_1(double b,double c){
        this.b =b;
        this.c =c;
    }

    @Override
    public String toString() {
        
        return b +"x"+(c>0? "+":"")+c+"=0,"+giai() ;
    }

    public String giai(){
        if(b==0){
            if(c==0){
                return "vsn";
            }else{
                return "vn";
            }
        }else{
            return "x="+(-c/b);
        }
}

public static void main(String[] args) {
    bac_1 b1 = new bac_1(1,2);
   
    System.out.println(b1);
    
}


}
