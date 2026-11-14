package java_87.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java_87.view.MouseView;

public class MouseController implements MouseListener, MouseMotionListener {
    private MouseView mouseView;

    public MouseController(MouseView mouseView) {
        this.mouseView = mouseView;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.mouseView.click();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Not used
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Not used
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.mouseView.enter();
        int x = e.getX();
        int y = e.getY();
        this.mouseView.update(x,y);
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.mouseView.exit();
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        this.mouseView.update(x,y);
    }
}
