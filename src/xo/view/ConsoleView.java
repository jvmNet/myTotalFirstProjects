package xo.view;

import xo.controller.Game;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleView {

    protected final Game game;

    private static Scanner IN = null;

    public ConsoleView(Game game) {
        this.game = game;
    }

    public void showGameName() {
        System.out.println(game.getGameName());
    }

    public void showPlayerName() {
        System.out.println(Arrays.toString(game.getPlayers()));
    }

    public int getCoordinate(final String coordinateName) {
        while (true) {
            System.out.printf("Input the coordinate %s", coordinateName);
            try {
                IN = new Scanner(System.in);
                return IN.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Coordinate is incorrect");
            }
        }
    }
}
