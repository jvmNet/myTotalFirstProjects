package xo.view;

import xo.controller.Game;

import java.util.Arrays;

public class AdvConsoleView extends ConsoleView {

    public AdvConsoleView(Game game) {
        super(game);
    }

    @Override
    public void showGameName() {
        println();
        System.out.println(game.getGameName());
        println();
    }

    public void showPlayerName() {
        System.out.println(Arrays.toString(game.getPlayers()));
    }

    public void println() {
        System.out.println("***");
    }

}
