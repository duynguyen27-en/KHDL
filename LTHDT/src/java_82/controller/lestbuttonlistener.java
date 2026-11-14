package java_82.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java_82.view.lastbuttonview;

public class lestbuttonlistener implements ActionListener {
    private lastbuttonview lastbuttonview;

    public lestbuttonlistener(lastbuttonview lastbuttonview){
        this.lastbuttonview = lastbuttonview;
    }
        
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("1")){
            this.lastbuttonview.Button_1();
        }else if(src.equals("2")){
            this.lastbuttonview.Button_2();
        }else if(src.equals("3")){
            this.lastbuttonview.Button_3();
        }else if(src.equals("4")){
            this.lastbuttonview.Button_4();
        }
    }

}
