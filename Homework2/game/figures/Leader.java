package game.figures;

import game.constants.Constants;
import game.structure.Field;

import java.awt.*;

public class Leader extends Figure {

    public Leader(Color innerColor, Color outlineColor, int x, int y) {
        super(innerColor, outlineColor, x, y);
    }

    @Override
    public void render(Graphics g) {
        fill((Graphics2D) g);
    }

    /**
     * fill the figure with the specified color
     *
     * @param graphics2D object of type Graphics2D
     */
    private void fill(Graphics2D graphics2D) {
        graphics2D.setColor(innerColor);
        graphics2D.fillRect(x, y, Constants.FIGURE_SIZE, Constants.FIGURE_SIZE);
    }

    @Override
    public boolean valid(Field[][] gameFields,int previousCol, int previousRow, int desiredCol, int desiredRow) {
        int resultX = Math.abs(previousCol - desiredCol);
        int resultY = Math.abs(previousRow - desiredRow);

        if (!(((resultX > 0 && resultY == 0) || (resultX == 0 && resultY > 0)) && gameFields[desiredRow][desiredCol].getGameFigure() == null)) {
            return false;
        }


        int forCycleX = desiredCol - previousCol;
        int forCycleY = desiredRow - previousRow;

        int startingFrom = 0;
        int endingTo = 0;

        if (forCycleX != 0) {
            if (forCycleX > 0) {
                startingFrom = previousCol + 1;
                endingTo = desiredCol;

            } else {
                startingFrom = desiredCol;
                previousCol -= 1;
                endingTo = previousCol;
            }
            for (int i = startingFrom; i < endingTo; i++) {
                if (gameFields[previousRow][i].getGameFigure() != null) {
                    System.out.println("Figureee x>0");
                    return false;
                }
            }

        } else {

            if (forCycleY > 0) {
                startingFrom = previousRow + 1;
                endingTo = desiredRow;

            } else {
                startingFrom = desiredRow;
                previousRow -= 1;
                endingTo = previousRow;
            }

            for (int i = startingFrom; i < endingTo; i++) {
                if (gameFields[i][previousCol].getGameFigure() != null) {
                    return false;
                }
            }
        }

        return true;
    }
}
