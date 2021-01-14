package game.figures;

import java.awt.*;

public class Guard  extends Figure{
    public Guard(Color innerColor, Color outlineColor, int x, int y,int figureSize) {
        super(innerColor, outlineColor, x, y,figureSize);
    }

    @Override
    public void render(Graphics g) {
        Graphics2D graphics2D=(Graphics2D)g;
        fill(graphics2D);
        draw(graphics2D);


    }

    /**
     *  fill the figure with the specified color
     * @param graphics2D object of type Graphics2D
     */
    private void  fill(Graphics2D graphics2D){
        graphics2D.setColor(innerColor);
        graphics2D.fillOval(x,y,super.figureSize,super.figureSize);
    }

    /**
     *  Draw the figure with the specified color
     * @param graphics2D object of type Graphics2D
     */
    private void draw(Graphics2D graphics2D){
        graphics2D.setStroke(new BasicStroke(4));
        graphics2D.setColor(outlineColor);
        graphics2D.drawOval(x,y,super.figureSize,super.figureSize);
    }


}
