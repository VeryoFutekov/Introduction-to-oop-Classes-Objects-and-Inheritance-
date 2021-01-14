package game.figures;

import java.awt.*;

public class Leader extends Figure {

    public Leader(Color innerColor, Color outlineColor, int x, int y, int figureSize) {
        super(innerColor, outlineColor, x, y, figureSize);
    }

    @Override
    public void render(Graphics g) {
        fill((Graphics2D) g);
    }
    /**
     *  fill the figure with the specified color
     * @param graphics2D object of type Graphics2D
     */
    private void fill(Graphics2D graphics2D) {
        graphics2D.setColor(innerColor);
        graphics2D.fillRect(x, y, super.figureSize, super.figureSize);
    }
}
