package xo.model;

import xo.controller.Check;

import java.util.Arrays;

public class Board {

    private static final int SIZE_FIELD = 3;

    private Figure[][] figures = new Figure[SIZE_FIELD][SIZE_FIELD];

    public Board() {
        figures[0][0] = new Figure("X");
        figures[1][1] = new Figure("O");

    }

    public Figure getFigure(final int x, final int y) {
        if(!Check.checkCoordinate(x) || !Check.checkCoordinate(y))
            return null;

        return figures[x][y];
    }

    public boolean setFigure(final int x, final int y, final Figure figure) {
        if(!Check.checkCoordinate(x) || !Check.checkCoordinate(y))
            return false;

        if(figures[x][y] != null)
            return false;

        figures[x][y] = figure;

        return true;
    }

    public void showFigure() {
        System.out.println(Arrays.deepToString(this.figures));
    }
}
