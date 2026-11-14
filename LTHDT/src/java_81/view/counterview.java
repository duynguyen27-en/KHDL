package java_81.view;
import java.awt.BorderLayout;
import java_81.controller.counterlistener;
import java_81.moder.countermoder;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class counterview extends JFrame {
      private  countermoder countermoder;
      private JButton jbutton_up;
      private JButton jbutton_down;
      private JLabel jlabel_value;
      private JButton jbutton_reset;
      
      public counterview() {
          this.countermoder = new countermoder();
          this.init();
            this.setVisible(true);
      }
      public void init() {
        this.setTitle("counter");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        counterlistener sc = new counterlistener(this);
        
        jbutton_up = new JButton("UP");
        jbutton_up.addActionListener(sc);
        jbutton_down = new JButton("DOWN");
        jbutton_down.addActionListener(sc);
        jbutton_reset = new JButton("RESET");
        jbutton_reset.addActionListener(sc);
        
        jlabel_value = new JLabel(countermoder.getValue()+"",JLabel.CENTER);
        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout(30,30));
        jp.add(jbutton_up, BorderLayout.WEST);
        jp.add(jbutton_down, BorderLayout.EAST);
        jp.add(jlabel_value, BorderLayout.CENTER);
        jp.add(jbutton_reset, BorderLayout.SOUTH);
        this.setLayout(new BorderLayout());
        this.add(jp);
      }

   public void tang(){
    this.countermoder.tang();
    this.jlabel_value.setText(this.countermoder.getValue()+"");
    
   }
   public void giam(){
    this.countermoder.giam();
    this.jlabel_value.setText(this.countermoder.getValue()+"");
   }
   public void reset(){
    this.countermoder.reset();
    this.jlabel_value.setText(this.countermoder.getValue()+"");
    
   } 
   
    

}
