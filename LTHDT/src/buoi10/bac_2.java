package buoi10;

public class bac_2 extends  bac_1 {
    private double a;

    public bac_2(double a,double b,double c) {
        super(b,c);
        this.a = a;
        
    }

    public String giai(){
        if(a==0) return super.giai();
        double d = b*b -4*a*c;
        if(d<0) return "vono";
        if(d==0) return "x1=x2="+(-b/2*a);
        double x1 = (-b+Math.sqrt(d))/(2*a);
        double x2 = (-b-Math.sqrt(d))/(2*a);
        return "x1="+x1+"x2="+x2;


    }
    @Override
    public String toString() {
        return a+"x^2"+(b>=0?"+":"")+b+"x"+(c>=0?"+":"")+c+"=0 ,"+giai();
    }

    public static void main(String[] args) {
        bac_2 b2 = new bac_2(1,2,3);
        
        System.out.println(b2);
    }

    

   
        

}
