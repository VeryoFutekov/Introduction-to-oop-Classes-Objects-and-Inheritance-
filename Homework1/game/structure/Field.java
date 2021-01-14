package game.structure;

import java.awt.*;

public class Field {
    private int x;
    private int y;
    private int fieldSize;
    private Color color;

    public Field(int x, int y, int fieldSize, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.fieldSize = fieldSize;
    }


    /**
     * rendering the fields
     *
     * @param g object of type Graphics
     */
    void render(Graphics g) {
        int fieldX = x * fieldSize;
        int fieldY = y * fieldSize;

        fill(g, fieldX, fieldY);
        draw(g, fieldX, fieldY);

    }

    /**
     *  fill the field with the specified color
     * @param g object of type Graphic
     * @param x diagonal
     * @param y vertical
     */
    private void fill(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillRect(x, y, fieldSize, fieldSize);
    }

    /**
     *  draw the field with specific color(outline)
     * @param g object of type Graphic
     * @param x diagonal
     * @param y vertical
     */
    private void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, fieldSize, fieldSize);
    }
}
