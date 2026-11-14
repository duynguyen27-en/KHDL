package java_89.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java_89.view.Menuview;
import javax.swing.AbstractButton;

public class Menucontroller implements ActionListener {

    private Menuview view;

    public Menucontroller(Menuview view) {
        this.view =view ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Save")){
            this.view.setlaber("danh nhan save");
        }else if(src.equals("Exit")){
        
         System.exit(0);

        }else if(src.equals("Toolbar")){
            AbstractButton jcheakbox = (AbstractButton) e.getSource();
            boolean cheak = jcheakbox.getModel().isSelected();
            if(cheak){
                this.view.naTool();
            }else{
              this.view.diTool();
            }
           
        }else if(src.equals("Run")){
            this.view.setlaber("ban da nhan run");
        }else if(src.equals("Output")){
            this.view.setlaber("ban da nhan output");
        }else if(src.equals("Split Up")){
            this.view.setlaber("ban da nhan split up");
        }else if(src.equals("Split Down")){
            this.view.setlaber("ban da nhan split down");
        }else if(src.equals("Type")){
            this.view.setlaber("ban da nhan type");
        }else if(src.equals("Size")){
            this.view.setlaber("ban da nhan size");
        }else if(src.equals("Cut")){
            this.view.setlaber("ban da nhan cut");
        }else if(src.equals("Copy")){
            this.view.setlaber("ban da nhan copy");
        }else if(src.equals("Paste")){
            this.view.setlaber("ban da nhan paste");
        }
        
    }


}
