package xo;

import xo.controller.Game;
import xo.model.Board;
import xo.model.Player;
import xo.view.AdvConsoleView;
import xo.view.ConsoleView;

public class App {

    public static void main(String[] args) {

        final Board board = new Board();

        final Game game = new Game("XO", new Player[]{new Player("Irina", "O"),
                                                new Player("Alla", "X")}, board);

        final ConsoleView consoleView = new ConsoleView(game);
        final AdvConsoleView advConsoleView = new AdvConsoleView(game);

        game.showPlayers();

        consoleView.getCoordinate("X: ");

        startGame(advConsoleView);

        board.showFigure();

    }

    public static void startGame(ConsoleView consoleView) {
        consoleView.showGameName();
    }

}
