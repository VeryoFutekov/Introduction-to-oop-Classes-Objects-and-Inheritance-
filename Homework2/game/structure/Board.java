package game.structure;

import game.constants.Constants;
import game.figures.Figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Board extends JFrame implements MouseListener {

    private Field[][] fields = new Field[5][5];

    private Figure bufferFigure = null;
    private int currentX;
    private int currentY;

    public Board() throws HeadlessException {
        initWindow();
        super.addMouseListener(this);
        fieldsInitialization();

    }


    /**
     * initialization of the window board
     */
    private void initWindow() {
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500, 500);
        super.setVisible(true);

    }


    /*
            Painting
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                fields[i][j].render(g);
            }
        }

    }


    /*
    method that process click mouse event and move the figure
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        int clickedRow = e.getY() / Constants.FIELD_SIZE;
        int clickedCol = e.getX() / Constants.FIELD_SIZE;

        if (bufferFigure == null) {
            this.bufferFigure = fields[clickedRow][clickedCol].getGameFigure();
            currentX = clickedCol;
            currentY = clickedRow;

            return;

        }

        if (bufferFigure.valid(fields,currentX, currentY, clickedCol, clickedRow)) {
            this.fields[clickedRow][clickedCol].setGameFigure(bufferFigure);
            this.fields[currentY][currentX].setGameFigure(null);

            bufferFigure.setX(clickedCol);
            bufferFigure.setY(clickedRow);
            bufferFigure = null;

            super.repaint();
        } else {
            bufferFigure = null;

        }

        currentX = 0;
        currentY = 0;


    }


    /*
        field initialization
     */
    private void fieldsInitialization() {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {

                Figure figure = Constants.FIGURES[row][col];

                Field field = new Field(col, row, Constants.FIELD_COLORS[row][col], figure);
                this.fields[row][col] = field;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
