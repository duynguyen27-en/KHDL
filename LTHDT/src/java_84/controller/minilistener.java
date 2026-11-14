package java_84.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java_84.view.miniview;

public class minilistener implements ActionListener {
    private miniview miniview;

    public minilistener(miniview miniview) {
        this.miniview = miniview;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("+")){
            this.miniview.cong1();
        }else if(src.equals("-")){
            this.miniview.tru1();
        }else if(src.equals("*")){
            this.miniview.nhan1();
        }else if(src.equals("/")){
            this.miniview.chia1();
        }else if(src.equals("^")){
            this.miniview.mu1();
        }else if(src.equals("MOD")){
            this.miniview.du1();
        }
        
    }
}
