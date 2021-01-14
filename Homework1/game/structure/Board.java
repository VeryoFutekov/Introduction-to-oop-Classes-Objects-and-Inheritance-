package game.structure;

import game.constants.Constants;
import game.figures.Figure;
import game.figures.Guard;
import game.figures.Leader;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Board extends JFrame {

    public Board() throws HeadlessException {
        initWindow();

    }


    /**
     * initialization of the window board
     */
    private void initWindow() {
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500, 500);
        super.setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);


        renderFields(g);
        renderFigures(g);


    }

    /**
     * render fields of the board
     * @param g object of type Graphics
     */
    private void renderFields(Graphics g) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Field field = new Field(j, i, 100, Constants.FIELD_COLORS[i][j]);
                field.render(g);
            }
        }

    }


    /**
     * rendering the figures
     * @param g object of type G
     */
    private void renderFigures(Graphics g) {
        renderGreenFigures(g);
        renderCenter(g);
        renderYellowFigures(g);

    }

    /**
     * rendering the green figures
     * @param g object of type Graphics
     */
    private void renderGreenFigures(Graphics g) {
        int y = 430;
        int x = 0;

        List<String> figures = Arrays.asList("Leader", "Guard", "Guard", "Guard", "Guard");
        for (int i = 0; i < figures.size(); i++) {
            x = (i * 100) + 30;


            String type = figures.get(i);
            Figure figure = switch (type) {
                case "Guard" -> new Guard(Color.GREEN, Color.YELLOW, x, y, 40);
                case "Leader" -> new Leader(Color.GREEN, Color.YELLOW, x, y, 40);
                default -> null;
            };


            figure.render(g);
        }

    }

    /**
     * rendering the center
     * @param g object of type Graphics
     */
    private void renderCenter(Graphics g) {
        Figure center = new Guard(Color.GRAY, Color.GRAY, 230, 230, 40);
        center.render(g);
    }

    /**
     * rendering the yellow figures
     * @param g object of type Graphics
     */
    private void renderYellowFigures(Graphics g) {
        int y = 40;
        int x = 0;
        List<String> figures = Arrays.asList("Guard", "Guard", "Guard", "Guard", "Leader");

        for (int i = 0; i < figures.size(); i++) {
            x = (i * 100) + 30;

            String type = figures.get(i);
            Figure figure = switch (type) {
                case "Guard" -> new Guard(Color.YELLOW, Color.GREEN, x, y, 40);
                case "Leader" -> new Leader(Color.YELLOW, Color.GREEN, x, y, 40);
                default -> null;
            };


            figure.render(g);
        }
    }


}
