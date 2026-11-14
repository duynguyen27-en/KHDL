package baitap;

public class MyDate {
    private int day;
    private int month;
    private int year;
    public MyDate(int d,int m,int y){
        this.day= d;
        this.month=m;
        this.year=y;
    }
    public void printday(){
        System.out.println("ngay ="+day);
    }
    public void printmonth(){
        System.out.println("thang ="+month);
    }
    public void printyear(){
        System.out.println("nam ="+year);
    }
    public void printDate(){
        System.out.println("ngay hom nay la :"+day+"/"+month+"/"+year);
    }

}
