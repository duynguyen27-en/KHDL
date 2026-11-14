package java_81.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java_81.view.counterview;

public class counterlistener implements ActionListener {
    private counterview ctv;

    public counterlistener(counterview ctv) {
        this.ctv = ctv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("UP")) {
            this.ctv.tang();
        } else if (src.equals("DOWN")) {
            this.ctv.giam();
        }else if(src.equals("RESET")){
            this.ctv.reset();
        }
    }
}
