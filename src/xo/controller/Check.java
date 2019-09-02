package xo.controller;

public class Check {

    private static final int MIN_SIZE_COORDINATE = 0;

    private static final int MAX_SIZE_COORDINATE = 2;

    public static boolean checkCoordinate(final int coordinate) {
        if(coordinate < MIN_SIZE_COORDINATE || coordinate > MAX_SIZE_COORDINATE)
            return false;

        return true;
    }

}
