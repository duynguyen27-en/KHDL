package java_84.model;

public class Minicodel {
    private double a;
    private double b;
    private double anwser;

    public Minicodel() {
        this.a = 0;
        this.b = 0;
        this.anwser=0;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getAnwser() {
        return anwser;
    }

    public void setAnwser(double anwser) {
        this.anwser = anwser;
    }

    public double cong(){
        return this.anwser= (this.a +this.b);
    }
     public double tru(){
        return this.anwser= (this.a -this.b);
    }
     public double nhan(){
        return this.anwser= (this.a *this.b);
    }
     public double chia(){
        if(b==0) return 0;
        return this.anwser= (this.a /this.b);
    }
     public double mu(){
        return this.anwser= Math.pow(this.a ,this.b);
    }
     public double du(){
        return this.anwser= (this.a %this.b);
    }  


}
