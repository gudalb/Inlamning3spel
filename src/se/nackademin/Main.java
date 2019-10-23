package se.nackademin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int c = 4;
        int r = 6;

        List<Integer> testGame = genGame(c,r);

        for (int i = 0; i < testGame.size(); i++) {
            if (i % c == 0) System.out.println();
            System.out.print(testGame.get(i));
        }

    }

    public static List<Integer> genGame (int columns, int rows) {
        List<Integer> game = new ArrayList<>();

        for (int i = 0; i < (columns*rows); i++) {
            game.add(0);
        }

        return game;
    }
}
