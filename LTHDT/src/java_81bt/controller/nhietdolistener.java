package java_81bt.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java_81bt.view.nhietdoview;

public class nhietdolistener implements ActionListener {
    private nhietdoview nhietdoview;

    public nhietdolistener(nhietdoview nhietdoview) {
        this.nhietdoview = nhietdoview;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String src = e.getActionCommand();
       if(src.equals("convert")){
        this.nhietdoview.convert();
       }
    }
    

}
