package java_81bt.view;

import java.awt.GridLayout;
import java_81bt.controller.nhietdolistener;
import java_81bt.moder.nhietdomoder;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class nhietdoview extends JFrame {
    private nhietdomoder nhietdomoder;
    private JTextField jta;
    private JButton jbutton_celsius;
    private JLabel jlabel;

    public nhietdoview() {
        this.nhietdomoder = new nhietdomoder(0.0);
        this.init();
        this.setVisible(true);
    }

    public void init(){
        this.setTitle("nhiet do");
        this.setSize(400, 250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          JPanel jp = new JPanel();
          jp.setLayout(new GridLayout(3,1,10,10));
          nhietdolistener sc = new nhietdolistener(this);
          
         jlabel = new JLabel(nhietdomoder.getCelsius()+"", JLabel.CENTER);
        jta = new JTextField();
        jbutton_celsius = new JButton("convert");
        jbutton_celsius.addActionListener(sc);
        jp.add(jta);
        jp.add(jbutton_celsius);
        jp.add(jlabel);
        this.setLayout(new GridLayout());
        this.add(jp);
    }

    public void convert(){
        try {
            String text = jta.getText().trim();
            double celsius = Double.parseDouble(text);
            this.nhietdomoder.setCelsius(celsius);
            this.jlabel.setText(this.nhietdomoder.tinhDoF()+"");
            
            
        } catch (NumberFormatException e) {
            this.jlabel.setText("vui long nhap so hop le");
            
        }
     
    }

 
}
