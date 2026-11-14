package java_78;

import javax.swing.JFrame;

public class vidu extends JFrame {

    public vidu() {
    }
    
    public void giaodien(){
        this.setVisible(true);
    }
    public void giaodien(String ten){
        this.setTitle(ten);
    }
    public void giaodien1(int rong, int cao){
        this.setSize(rong,cao);
    }
    public void giaodien(boolean t){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void giaodien2(int x,int y){
        this.setLocation(x, y);
    }
    public void giaodien3(int x,int y,int t,String ten){
        this.setSize(x,y);
        this.setLocation(t, t);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(ten);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        vidu x = new vidu();
        x.giaodien3(600,400,300,"chuong trinh dau");
   
    }

}
