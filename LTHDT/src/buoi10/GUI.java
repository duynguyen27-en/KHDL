package buoi10;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {
    private JLabel lblhesoA,lblhesoB,lblhesoC,lblhienthi;
    private JTextField txthesoA,txthesoB,txthesoC;
    private JButton btnGiai,btnLamlai,btnThoat;

    private GUI(){
        this.setTitle("Ax^2 + Bx + C =0");
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(1,2));
        lblhesoA = new JLabel("he so A ");
        txthesoA = new JTextField();
        jp1.add(lblhesoA);
        jp1.add(txthesoA);
       

        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(1,2));
        lblhesoB = new JLabel("he so B ");
        txthesoB = new JTextField();
        jp2.add(lblhesoB);
        jp2.add(txthesoB);

        JPanel jp3 = new JPanel();
        jp3.setLayout(new GridLayout(1,2));
        lblhesoC = new JLabel("he so C ");
        txthesoC = new JTextField();
        jp3.add(lblhesoC);
        jp3.add(txthesoC);
          
        JPanel jp4 = new JPanel();
        lblhienthi = new JLabel("xuat ket qua");
        jp4.add(lblhienthi);
       

        JPanel jp5 = new JPanel();
        jp5.setLayout(new GridLayout(1,3));
        btnGiai = new JButton("giai");
        btnLamlai = new JButton("lam lai");
        btnThoat = new JButton("thoat");
        jp5.add(btnGiai);
        jp5.add(btnLamlai);
        jp5.add(btnThoat);

        this.setLayout(new GridLayout(5,1,10,10));
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.add(jp4);
        this.add(jp5);
        this.setVisible(true);

        btnGiai.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(txthesoA.getText());
                double b = Double.parseDouble(txthesoB.getText());
                double c = Double.parseDouble(txthesoC.getText());
                
                bac_2 b2 = new bac_2(a,b,c);
               lblhienthi.setText(b2.toString());
                
            }

            
        });
        btnLamlai.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txthesoA.setText("");
                txthesoB.setText("");
                txthesoC.setText("");
                lblhienthi.setText("xuat ket qua");
                
            }

            
        });
        btnThoat.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                
            }

            
        });



    }
    public static void main(String[] args) {
        new GUI();
    }


}
