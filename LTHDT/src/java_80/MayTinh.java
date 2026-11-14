package java_80;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MayTinh extends JFrame {
    public MayTinh(){
        this.setTitle("MayTinh");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JTextField j1 = new JTextField(50);
        JPanel jpanel_h = new JPanel();
        jpanel_h.setLayout(new BorderLayout());
        jpanel_h.add(j1,BorderLayout.CENTER);

        JButton jb0 = new JButton("0");
        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");
        JButton jb5 = new JButton("5");
        JButton jb6 = new JButton("6");
        JButton jb7 = new JButton("7");
        JButton jb8 = new JButton("8");
        JButton jb9 = new JButton("9");
        JButton jb_cong = new JButton("+");
        JButton jb_tru = new JButton("-");
        JButton jb_nhan = new JButton("*");
        JButton jb_chia = new JButton("/");
        JButton jb_bang = new JButton("=");
        
        JPanel jpanel_tt = new JPanel();
        jpanel_tt.setLayout(new GridLayout(5,3,10,10));
        jpanel_tt.add(jb0);
        jpanel_tt.add(jb1);
        jpanel_tt.add(jb2);
        jpanel_tt.add(jb3);
        jpanel_tt.add(jb4);
        jpanel_tt.add(jb5);
        jpanel_tt.add(jb6);
        jpanel_tt.add(jb7);
        jpanel_tt.add(jb8);
        jpanel_tt.add(jb9);
        jpanel_tt.add(jb_cong);
        jpanel_tt.add(jb_tru);
        jpanel_tt.add(jb_nhan);
        jpanel_tt.add(jb_chia);
        jpanel_tt.add(jb_bang);
        this.setLayout(new BorderLayout());
        this.add(jpanel_h, BorderLayout.NORTH);
        this.add(jpanel_tt,BorderLayout.CENTER);

        
        this.setVisible(true); 
    }
    public static void main(String[] args) {
        new MayTinh();
    }
    

}
