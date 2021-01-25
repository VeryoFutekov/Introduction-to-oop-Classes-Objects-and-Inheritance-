package game.figures;

import game.constants.Constants;
import game.structure.Field;

import java.awt.*;

public class Center extends Figure{
    public Center(Color inner, Color outline, int x, int y) {
        super(inner, outline, x, y, false);
    }

    @Override
    public void render(Graphics g) {
        Graphics2D graphics2D=(Graphics2D)g ;
        graphics2D.setColor(outlineColor);
        graphics2D.setStroke(new BasicStroke(3));
        graphics2D.drawOval(x, y, Constants.FIGURE_SIZE, Constants.FIGURE_SIZE);
        graphics2D.setColor(innerColor);
        graphics2D.fillOval(x, y, Constants.FIGURE_SIZE,Constants.FIGURE_SIZE);
    }

    @Override
    public boolean valid(Field[][] gameFields, int previousCol, int previousRow, int desiredCol, int desiredRow) {
        return super.isMovable;
    }
}
