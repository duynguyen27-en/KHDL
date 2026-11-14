package java_79;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class vd_FlowLayout extends JFrame {
    public vd_FlowLayout() {
        
        this.setTitle("FlowLayout");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        FlowLayout f1 = new FlowLayout();
        FlowLayout f2 = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout f3 = new FlowLayout(FlowLayout.CENTER, 20, 20);
        // this.setLayout(f1);
        // this.setLayout(f2);
        this.setLayout(f3);
        for (int i = 1; i <= 5; i++) {
            this.add(new JButton(i + ""));
        }
        // JButton jb1 = new JButton("1");
        // JButton jb2 = new JButton("2");
        // JButton jb3 = new JButton("3");
        // this.add(jb1);
        // this.add(jb2);
        // this.add(jb3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new vd_FlowLayout();

    }

}
