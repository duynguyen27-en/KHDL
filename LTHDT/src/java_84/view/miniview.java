package java_84.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java_84.controller.minilistener;
import java_84.model.Minicodel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class miniview extends JFrame {
    private Minicodel minicodel;
    private  JTextField jtf_1stvalue,jtf_2ndvalue,jtf_answer;
    
     public miniview(){
        this.minicodel = new Minicodel();
        this.inst();
        this.setVisible(true);
        
     }

     private void inst() {
        this.setTitle(" Mini Calculator");
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font f = new Font("Arial",Font.BOLD,30);
        JPanel jp1 =new JPanel();
        jp1.setLayout(new GridLayout(3,2,10,10));
       JLabel  jl_1stvalue = new JLabel("1ST value");
       jl_1stvalue.setFont(f);
       JLabel  jl_2ndvalue = new JLabel("2nd value");
       jl_2ndvalue.setFont(f);
       JLabel  jl_answer = new JLabel("Answer");
       jl_answer.setFont(f);

        jtf_1stvalue =  new JTextField();
     jtf_2ndvalue =  new JTextField();
        jtf_answer =  new JTextField();

       jp1.add(jl_1stvalue);
       jp1.add(jtf_1stvalue);
       jp1.add(jl_2ndvalue);
       jp1.add(jtf_2ndvalue);
       jp1.add(jl_answer);
       jp1.add(jtf_answer);
      
      minilistener m = new minilistener(this);
       JPanel jp2 = new JPanel();
       jp2.setLayout(new GridLayout(2,3,10,10));

       JButton jb1 = new JButton("+");
       jb1.setFont(f);
       jb1.addActionListener( m);
        JButton jb2 = new JButton("-");
         jb2.setFont(f);
         jb2.addActionListener( m);
         JButton jb3 = new JButton("*");
          jb3.setFont(f);
          jb3.addActionListener( m);
          JButton jb4 = new JButton("/");
           jb4.setFont(f);
            jb4.addActionListener( m);
           JButton jb5 = new JButton("^");
            jb5.setFont(f);
            jb5.addActionListener( m);
            JButton jb6 = new JButton("MOD");
             jb6.setFont(f);
             jb6.addActionListener( m);

             jp2.add(jb1);
             jp2.add(jb2);
             jp2.add(jb3);
             jp2.add(jb4);
             jp2.add(jb5);
             jp2.add(jb6);

             this.setLayout(new BorderLayout());
             this.add(jp1,BorderLayout.CENTER);
             this.add(jp2,BorderLayout.SOUTH);
             

     }
     public void cong1(){
      double a = Double.parseDouble(this.jtf_1stvalue.getText());
       double b = Double.parseDouble(this.jtf_2ndvalue.getText());
       this.minicodel.setA(a);
       this.minicodel.setB(b);
       double kq =  this.minicodel.cong();
       this.jtf_answer.setText(kq+"");
     }
      public void tru1(){
      double a = Double.parseDouble(this.jtf_1stvalue.getText());
       double b = Double.parseDouble(this.jtf_2ndvalue.getText());
       this.minicodel.setA(a);
       this.minicodel.setB(b);
        this.minicodel.tru();
        
       this.jtf_answer.setText(this.minicodel.getAnwser()+"");
     }
      public void nhan1(){
      double a = Double.parseDouble(this.jtf_1stvalue.getText());
       double b = Double.parseDouble(this.jtf_2ndvalue.getText());
       this.minicodel.setA(a);
       this.minicodel.setB(b);
         this.minicodel.nhan();
      this.jtf_answer.setText(this.minicodel.getAnwser()+"");
     }
      public void chia1(){
      double a = Double.parseDouble(this.jtf_1stvalue.getText());
       double b = Double.parseDouble(this.jtf_2ndvalue.getText());
       this.minicodel.setA(a);
       this.minicodel.setB(b);
         this.minicodel.chia();
     this.jtf_answer.setText(this.minicodel.getAnwser()+"");
     }
      public void mu1(){
      double a = Double.parseDouble(this.jtf_1stvalue.getText());
       double b = Double.parseDouble(this.jtf_2ndvalue.getText());
       this.minicodel.setA(a);
       this.minicodel.setB(b);
        this.minicodel.mu();
      this.jtf_answer.setText(this.minicodel.getAnwser()+"");
     }
      public void du1(){
      double a = Double.parseDouble(this.jtf_1stvalue.getText());
       double b = Double.parseDouble(this.jtf_2ndvalue.getText());
       this.minicodel.setA(a);
       this.minicodel.setB(b);
         this.minicodel.du();
       this.jtf_answer.setText(this.minicodel.getAnwser()+"");
     }

}
