package java_87.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java_87.controller.MouseController;
import java_87.model.MouseModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseView extends JFrame {
    private  MouseModel model;
    private JLabel jLabel_mouse;
    private JLabel jLabe_position;
    private JLabel jLabel_x;
    private JLabel jLabel_y;
    private JLabel jLabel_click;
    private JLabel jLabel_count;
    private JLabel jLabel_press;
    private JLabel jLabel_mouse1;
    private JLabel jLabel_cheak;
    private JLabel jLabel_press2;

    public MouseView(){
        this.model = new MouseModel() ;
        this.ints();
        this.setVisible(true);
    }

    private void ints() {
        this.setTitle("Mouse");
        this.setSize(600,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    MouseController m = new MouseController(this);

         Font f = new Font("Arial",Font.BOLD,40);
        JPanel jp1 = new JPanel();
          jLabel_mouse = new JLabel();
        jp1.add(jLabel_mouse);
        jp1.setBackground(Color.RED);
         jp1.addMouseListener(m);
         jp1.addMouseMotionListener(m);
       

        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(3,3));
         jLabe_position = new JLabel("position");
        jLabe_position.setFont(f);
        jLabel_x = new JLabel("x: ");
        jLabel_x.setFont(f);
         jLabel_y = new JLabel("y: ");
        jLabel_y.setFont(f);
         jLabel_click = new JLabel("Number of click:  ");
        jLabel_click.setFont(f);
         jLabel_count = new JLabel("n");
        jLabel_count.setFont(f);
         jLabel_press = new JLabel("");
        jLabel_press.setFont(f);
         jLabel_mouse1 = new JLabel("Mouse is in Component: ");
        jLabel_mouse1 .setFont(f);
         jLabel_cheak = new JLabel("");
        jLabel_cheak .setFont(f);
         jLabel_press2 = new JLabel("");
        jLabel_press2 .setFont(f);

        jp2.add(jLabe_position);
        jp2.add(jLabel_x);
        jp2.add(jLabel_y);
        jp2.add(jLabel_click);
        jp2.add(jLabel_count);
        jp2.add(jLabel_press);
        jp2.add(jLabel_mouse1);
        jp2.add(jLabel_cheak);
        jp2.add(jLabel_press2);

        this.setLayout(new BorderLayout());
        this.add(jp1, BorderLayout.CENTER);
        this.add(jp2, BorderLayout.SOUTH);


       
    }
     public void click(){
        this.model.count();
        this.jLabel_count.setText(this.model.getCount()+"");
    }
     public void enter(){
        this.model.enter();
        this.jLabel_cheak.setText(this.model.getCheak()+"");
    }
     public void exit(){
        this.model.exit();
        this.jLabel_cheak.setText(this.model.getCheak()+"");
    }
    public void update(int x,int y){
        this.model.setX(x);
        this.model.setY(y);
        this.jLabel_x.setText(this.model.getX()+"");
        this.jLabel_y.setText(this.model.getY()+"");
        
    }

   

}
