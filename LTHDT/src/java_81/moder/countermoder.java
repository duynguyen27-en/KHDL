package java_81.moder;

public class countermoder {
    private int value;
    public countermoder() {
        this.value =0;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void tang(){
        this.value++;
    }
    public void giam(){
        this.value--;
    }
    public void reset(){
        this.value=0;
    }

}
