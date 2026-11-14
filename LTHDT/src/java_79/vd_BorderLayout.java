package java_79;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class vd_BorderLayout extends JFrame{

    public vd_BorderLayout() {
        this.setTitle("BorderLayout");
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
       BorderLayout b1 = new BorderLayout();
         BorderLayout b2 = new BorderLayout(20,20);
        
    //    this.setLayout(b1);
    this.setLayout(b2);
       this.add(new JButton("1"),BorderLayout.NORTH);
       this.add(new JButton("2"), BorderLayout.SOUTH);
       this.add(new JButton("3"),BorderLayout.EAST);
       this.add(new JButton("4"),BorderLayout.WEST);
       this.add(new JButton("5"),BorderLayout.CENTER);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
        


    public static void main(String[] args) {
      new vd_BorderLayout();
    }

}
