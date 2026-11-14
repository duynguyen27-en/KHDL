package java_81bt.moder;

public class nhietdomoder {
    private double celsius;
    public nhietdomoder(double celsius){
        this.celsius = celsius;
    }
    public double getCelsius() {
        return celsius;
    }
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    
    public double tinhDoF(){
         return (this.celsius*9/5)+32;
    }
  
        
}
