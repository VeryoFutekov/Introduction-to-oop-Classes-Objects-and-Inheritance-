package game.figures;

import game.constants.Constants;
import game.structure.Field;

import java.awt.*;


public abstract class Figure {
    protected Color innerColor;
    protected Color outlineColor;
    protected int x;
    protected int y;


    public Figure(Color inner, Color outline, int x, int y) {
        this.innerColor = inner;
        this.outlineColor = outline;
        this.x = x * Constants.FIELD_SIZE + 30;
        this.y = y * Constants.FIELD_SIZE + 30;


    }

    /**
     * method that needs to be implemented in child classes to have specific render
     *
     * @param g object of type Graphics
     */
    public abstract void render(Graphics g);


    /*
    method that is used for validation before moving
     */
    public abstract boolean valid(Field[][] gameFields,int previousCol, int previousRow, int desiredCol, int desiredRow);

    public int getX() {
        return x;
    }

    public Figure setX(int x) {
        this.x = x*Constants.FIELD_SIZE+30;
        return this;
    }

    public int getY() {
        return y;
    }

    public Figure setY(int y) {
        this.y = y*Constants.FIELD_SIZE+30;
        return this;
    }
}
