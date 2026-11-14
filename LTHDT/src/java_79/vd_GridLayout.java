package java_79;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class vd_GridLayout extends JFrame {

    public vd_GridLayout() {
      this.setTitle("GridLayout");
      this.setSize(600,400);
      this.setLocationRelativeTo(null);
      GridLayout g1 = new GridLayout(10,10,5,5);
      this.setLayout(g1);
      for(int i=1;i<=100;i++){
        this.add(new JButton(i+""));
      }

      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
      
      

    }
        
    public static void main(String[] args) {
        new vd_GridLayout();
    }

}
