package baitap;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width , double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width*height;

    }
    public double getPerimeter() {
        return(width+height)*2;
    }
    public void display(){
        System.out.println("chieu cao la :"+height);
        System.out.println("chieu rong la :"+width);
        System.out.println("chu vi la :"+getPerimeter());
        System.out.println("dien tich la :"+getArea());
}
}