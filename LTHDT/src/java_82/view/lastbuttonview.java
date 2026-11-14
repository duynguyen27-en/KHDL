package java_82.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java_82.controller.lestbuttonlistener;
import java_82.model.lastbuttonmodel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class lastbuttonview extends JFrame {
    private lastbuttonmodel lastbuttonmodel;
    private  JLabel jlabel_value;

    public lastbuttonview(){
        this.lastbuttonmodel = new lastbuttonmodel();
        this.tnts();
        this.setVisible(true);
    }

    private void tnts() {
       this.setTitle("Last Button");
       this.setSize(400,400);
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Font f = new Font("Arial",Font.BOLD, 40);
       lestbuttonlistener lbl= new lestbuttonlistener(this);


       JPanel jp1 = new JPanel();
       jp1.setLayout(new GridLayout(2, 2,10,10));
       JButton value_1 = new JButton("1");
       value_1.setFont(f);
       value_1.addActionListener( lbl);
        JButton value_2 = new JButton("2");
         value_2.setFont(f);
         value_2.addActionListener( lbl);
          JButton value_3 = new JButton("3");
           value_3.setFont(f);
           value_3.addActionListener(lbl);
            JButton value_4 = new JButton("4");
             value_4.setFont(f);
             value_4.addActionListener( lbl);
          jp1.add(value_1);
          jp1.add(value_2);
          jp1.add(value_3);
          jp1.add(value_4);
      JPanel jp2 = new JPanel();
      jp2.setLayout(new BorderLayout(40,40));
      jlabel_value = new JLabel("last value: ---------", JLabel.CENTER);
      jlabel_value.setFont(f);
      jp2.add(jlabel_value);
       this.setLayout(new BorderLayout(10,10));
       this.add(jp1,BorderLayout.CENTER);
       this.add(jp2,BorderLayout.SOUTH);
     
    }
    public void Button_1(){
        this.lastbuttonmodel.value_1();
        this.jlabel_value.setText("last value: "+this.lastbuttonmodel.getValue());
    }
    public void Button_2(){
        this.lastbuttonmodel.value_2();
        this.jlabel_value.setText("last value: "+this.lastbuttonmodel.getValue());
    }
    public void Button_3(){
        this.lastbuttonmodel.value_3();
        this.jlabel_value.setText("last value: "+this.lastbuttonmodel.getValue());
    }
    public void Button_4(){
        this.lastbuttonmodel.value_4();
        this.jlabel_value.setText("last value: "+this.lastbuttonmodel.getValue());
    }

}
