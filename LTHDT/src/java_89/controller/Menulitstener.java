package java_89.controller;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java_89.view.Menuview;


public  class Menulitstener implements MouseListener{
    private Menuview view;

    public Menulitstener(Menuview view){
        this.view = view;
    }

  

    @Override
    public void mousePressed(MouseEvent e) {
      if(e.isPopupTrigger()){
        this.view.jpPopupMenu.show(e.getComponent(), e.getX(), e.getY());
      }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       if(e.isPopupTrigger()){
        this.view.jpPopupMenu.show(e.getComponent(), e.getX(), e.getY());
       }
    }



    @Override
    public void mouseClicked(MouseEvent e) {
      
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      
    }
    @Override
    public void mouseExited(MouseEvent e) {
        
    }

   
    

}
