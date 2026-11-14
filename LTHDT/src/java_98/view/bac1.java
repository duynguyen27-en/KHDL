
package java_98.view;


public class bac1 {
    protected double b,c;

    public bac1(double b ,double c) {
        this.b = b;
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    @Override
    public String toString() {
        return b+"x"+(c>0?"+":"")+c+"="+giai();
    }
    
    
    public String giai(){
        if(b==0){
            if(c==0){
                return "vsn";
            }else{
                return "vosn";
            }
        }
        return "x="+(-c/b);
    }

    
    
    public static void main(String[] args) {
        
        
    }
    
}
