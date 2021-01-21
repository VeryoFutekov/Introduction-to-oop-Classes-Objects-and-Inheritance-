package game.figures;

import game.constants.Constants;
import game.structure.Field;

import java.awt.*;

public class Guard  extends Figure{
    public Guard(Color innerColor, Color outlineColor, int x, int y) {
        super(innerColor, outlineColor, x, y);
    }

    @Override
    public void render(Graphics g) {
        Graphics2D graphics2D=(Graphics2D)g;
        fill(graphics2D);
        draw(graphics2D);


    }

    @Override
    public boolean valid(Field[][] gameFields,int previousCol, int previousRow, int desiredCol, int desiredRow) {
        int resultX=Math.abs(previousCol -desiredCol);
        int resultY=Math.abs(previousRow -desiredRow);

        return ((resultX==1 && resultY==0)||(resultX==0 && resultY==1)) && gameFields[desiredRow][desiredCol].getGameFigure()==null;
    }

    /**
     *  fill the figure with the specified color
     * @param graphics2D object of type Graphics2D
     */
    private void  fill(Graphics2D graphics2D){
        graphics2D.setColor(innerColor);
        graphics2D.fillOval(x,y, Constants.FIGURE_SIZE,Constants.FIGURE_SIZE);
    }

    /**
     *  Draw the figure with the specified color
     * @param graphics2D object of type Graphics2D
     */
    private void draw(Graphics2D graphics2D){
        graphics2D.setStroke(new BasicStroke(4));
        graphics2D.setColor(outlineColor);
        graphics2D.drawOval(x,y,Constants.FIGURE_SIZE,Constants.FIGURE_SIZE);
    }


}
