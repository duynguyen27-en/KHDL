package java_83.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java_83.view.mycolorview;

public class mycolorlistener implements  ActionListener {
    private mycolorview mycolorview;

    public mycolorlistener(mycolorview mycolorview) {
        this.mycolorview = mycolorview;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String src = e.getActionCommand();
       if(src.equalsIgnoreCase("red text")){
        this.mycolorview.changetextcolor(Color.RED);
       }else if(src.equalsIgnoreCase("green text")){
        this.mycolorview.changetextcolor(Color.GREEN);
       }else if(src.equalsIgnoreCase("blue text")){
        this.mycolorview.changetextcolor(Color.BLUE);
       }else if(src.equalsIgnoreCase("red background")){
        this.mycolorview.changebackgoundcolor(Color.RED);
       }else if(src.equalsIgnoreCase("green background")){
        this.mycolorview.changebackgoundcolor(Color.GREEN);
       }else if(src.equalsIgnoreCase("blue background")){
        this.mycolorview.changebackgoundcolor(Color.BLUE);
       }

    }

}
