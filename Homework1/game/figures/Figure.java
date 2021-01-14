package game.figures;

import java.awt.*;


public abstract class Figure {
    protected Color innerColor;
    protected Color outlineColor;
    protected int figureSize;
    protected int x;
    protected int y;


    public Figure(Color inner, Color outline, int x, int y, int figureSize) {
        this.innerColor = inner;
        this.outlineColor = outline;
        this.x = x;
        this.y = y;
        this.figureSize = figureSize;

    }

    /**
     * method that needs to be implemented in child classes to have specific render
     * @param g object of type Graphics
     */
    public abstract void render(Graphics g);




}
