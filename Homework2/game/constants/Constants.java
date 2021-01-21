package game.constants;

import game.figures.Figure;
import game.figures.Guard;
import game.figures.Leader;

import java.awt.*;

/**
 * Class that hold all constants
 */
public class Constants {

    public static final Color[][] FIELD_COLORS = {{Color.RED, Color.DARK_GRAY, Color.WHITE, Color.DARK_GRAY, Color.RED},
            {Color.GRAY, Color.GRAY, Color.WHITE, Color.GRAY, Color.GRAY},
            {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE},
            {Color.GRAY, Color.GRAY, Color.WHITE, Color.GRAY, Color.GRAY},
            {Color.DARK_GRAY, Color.RED, Color.WHITE, Color.RED, Color.DARK_GRAY}};

    public static final Figure[][]FIGURES={
            {new Guard(Color.YELLOW, Color.GREEN,0,0), new Guard(Color.YELLOW, Color.GREEN,1,0), new Guard(Color.YELLOW, Color.GREEN,2,0), new Guard(Color.YELLOW, Color.GREEN,3,0), new Leader(Color.YELLOW, Color.GREEN,4,0)}
            ,{null,null,null,null,null}
            ,{null,null,new Guard(Color.GRAY, Color.GRAY,2,2),null,null}
            ,{null,null,null,null,null}
            ,{new Leader(Color.GREEN, Color.YELLOW,0,4), new Guard(Color.GREEN, Color.YELLOW,1,4), new Guard(Color.GREEN, Color.YELLOW,2,4), new Guard(Color.GREEN, Color.YELLOW,3,4), new Guard(Color.GREEN, Color.YELLOW,4,4)}
    };


    public static final int FIGURE_SIZE = 40;
    public static final int FIELD_SIZE=100;
}
