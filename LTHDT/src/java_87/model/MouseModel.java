package java_87.model;

public class MouseModel {
    private int x,y;
    private  int count;
    private  String cheak;

    public MouseModel() {
        this.cheak = "no";
        this.count = 0 ;
        this.x = 0;
        this.y = 0;
    }
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCheak() {
        return cheak;
    }

    public void setCheak(String cheak) {
        this.cheak = cheak;
    }

    public void count(){
        this.count++;
    }
      public void enter(){
        this.cheak="yes";
    }
    public void exit(){
        this.cheak="no";
    }


}
