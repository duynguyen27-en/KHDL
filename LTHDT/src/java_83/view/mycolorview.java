package java_83.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java_83.controller.mycolorlistener;
import java_83.model.mycolormodel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class mycolorview extends JFrame {
    private mycolormodel mycolormodel;
    private JTextField txt;

    public mycolorview(){
        this.mycolormodel = new mycolormodel();
        this.ints();
        this.setVisible(true);
        
    }

    private void ints() {
        this.setTitle(" My Color");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font f1 = new Font("Arial",Font.BOLD,60);
         Font f = new Font("Arial",Font.BOLD,20);
        mycolorlistener mls = new mycolorlistener(this);

        JPanel jp1 = new JPanel();
         txt = new JTextField("text------");
        jp1.add(txt);
        txt.setFont(f1);


        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(2,3,10,10));

        JButton jb1 = new JButton("red text");
        jb1.setFont(f);
        jb1.setForeground(Color.RED);
        jb1.addActionListener(mls);
        JButton jb2 = new JButton("green text");
        jb2.setFont(f);
        jb2.setForeground(Color.green);
         jb2.addActionListener(mls);
        JButton jb3 = new JButton("blue text");
        jb3.setFont(f);
        jb3.setForeground(Color.BLUE);
         jb3.addActionListener(mls);



        JButton jb4 = new JButton("red background");
         jb4.setFont(f);
         jb4.setBackground((Color.RED));
         jb4.setOpaque(true);
          jb4.addActionListener(mls);
        JButton jb5 = new JButton("green background");
        jb5.setFont(f);
        jb5.setBackground(Color.GREEN);
        jb5.setOpaque(true);
         jb5.addActionListener(mls);
        JButton jb6 = new JButton("blue background");
        jb6.setFont(f);
        jb6.setBackground(Color.BLUE);
        jb6.setOpaque(true);
         jb6.addActionListener(mls);

        jp2.add(jb1);
        jp2.add(jb2);
        jp2.add(jb3);
        jp2.add(jb4);
        jp2.add(jb5);
        jp2.add(jb6);

        this.setLayout(new BorderLayout());
        this.add(jp1, BorderLayout.NORTH);
        this.add(jp2, BorderLayout.CENTER);
    
    }

    public void changetextcolor( Color color ){
      this.txt.setForeground(color);
    }

    public void changebackgoundcolor( Color color ){
       this.txt.setBackground(color);
        this.txt.setOpaque(true);
       
        
    }
        


    
}
