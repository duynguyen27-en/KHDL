
package java_98.view;


public class bac2 extends bac1{
    private double a;

    public bac2(double a,double b, double c) {
        super(b, c);
        this.a=a;
        
        
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    @Override
    public String toString() {
        return a+"x^2"+(b>0?"+":"")+b+"x"+(c>0?"+":"")+c+"=0 ,"+giai1();
    }

   public String giai1(){
       if(a==0) return super.giai();
      double d = b*b-4*a*c;
      if(d<0) return "vosn";
      if(d==0) return "x+"+(-b/2*a); 
      
          double x1 = (-b-Math.sqrt(d))/(2*a);
          double x2 = (-b+Math.sqrt(d))/(2*a);
          return "x1="+x1+", x2"+x2;
          
     
   }
    
    
    public static void main(String[] args) {
        bac2 b= new bac2(1,2,3);
        
    }

   
    
}
