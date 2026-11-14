package java_89.test;

import java_89.view.Menuview;
import javax.swing.UIManager;
public class text {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new Menuview();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }

}
