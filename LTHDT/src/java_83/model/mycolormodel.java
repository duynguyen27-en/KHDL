package java_83.model;

import java.awt.Color;

public class mycolormodel {
    protected Color foreground;
    protected Color background;
    protected Color opaque;

    public mycolormodel() {
        this.background = Color.black;
        this.foreground = Color.white;
        this.opaque = Color.white;
    }

    public Color getForeground() {
        return foreground;
    }

    public void setForeground(Color foreground) {
        this.foreground = foreground;
    }

    public Color getBackground() {
        return background;
    }

    public void setBackground(Color background) {
        this.background = background;
    }

    public Color getOpaque() {
        return opaque;
    }

    public void setOpaque(Color opaque) {
        this.opaque = opaque;
    }




}
