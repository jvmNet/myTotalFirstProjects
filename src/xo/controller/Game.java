package xo.controller;

import xo.model.Board;
import xo.model.Player;

import java.util.function.Function;

public class Game {

    private static final String DEFAULT_GAME_NAME = "XO";

    private final String gameName;

    private final Board board;

    private final Player[] players;

    public Game(final String gameName,
                final Player[] players,
                final Board board) {
        this.board = board;
        this.players = players;
        if(gameName == null || gameName.isEmpty()) {
            this.gameName = DEFAULT_GAME_NAME;
        } else {
            this.gameName = gameName;
        }
    }

    public void showPlayers() {
        for (Player mass: players) {
            System.out.println(mass.getPlayerName() + " " + mass.getFigure());
        }
    }

    public String getGameName() {
        return DEFAULT_GAME_NAME;
    }

    public Player currentPlayer() {
       // final Function<String, Integer> countCalculator = (figure) ->


        return null;
    }

    public Player[] getPlayers() {
        return players;
    }

    public boolean move(final int x, final int y) {
        if(!Check.checkCoordinate(x)) {
            if(!Check.checkCoordinate(y)) {

                //TODO logic move code

                return false;
            }
        }

        return true;
    }


}
