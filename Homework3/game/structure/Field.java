package game.structure;

import game.constants.Constants;
import game.figures.Figure;

import java.awt.*;

public class Field {
    private int x;
    private int y;
    private Color color;
    private Figure gameFigure;

    public Field(int x, int y, Color color, Figure gameFigure) {
        this.x = x*Constants.FIELD_SIZE;
        this.y = y*Constants.FIELD_SIZE;
        this.color = color;
        this.gameFigure = gameFigure;
    }


    /**
     * rendering the fields
     *
     * @param g object of type Graphics
     */
    void render(Graphics g) {
        fill(g, x, y);
        draw(g, x, y);

        try{
            gameFigure.render(g);
        }catch (NullPointerException ex){

        }

    }

    /**
     *  fill the field with the specified color
     * @param g object of type Graphic
     * @param x diagonal
     * @param y vertical
     */
    private void fill(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillRect(x, y, Constants.FIELD_SIZE, Constants.FIELD_SIZE);
    }

    /**
     *  draw the field with specific color(outline)
     * @param g object of type Graphic
     * @param x diagonal
     * @param y vertical
     */
    private void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, Constants.FIELD_SIZE, Constants.FIELD_SIZE);
    }

    public Field setGameFigure(Figure gameFigure) {
        this.gameFigure = gameFigure;
        return this;
    }


    public Figure getGameFigure() {
        return gameFigure;
    }
}
