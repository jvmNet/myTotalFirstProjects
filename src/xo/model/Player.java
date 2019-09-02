package xo.model;

public class Player {

    private final String playerName;

    private final String figure;

    public Player(final String playerName, final String figure) {
        this.playerName = playerName;
        this.figure = figure;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getFigure() {
        return figure;
    }
}
