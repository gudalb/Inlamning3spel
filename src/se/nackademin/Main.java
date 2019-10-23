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
            System.out.printf("%4d",testGame.get(i) );
        }

    }

    public static List<Integer> genGame (int columns, int rows) {
        int[] numbers = new int[columns*rows];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        Random r = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int temp = numbers[i];
            int roll = r.nextInt(numbers.length);
            numbers[i] = numbers[roll];
            numbers[roll] = temp;
        }

        List<Integer> game = new ArrayList<>();

        for (int i = 0; i < (columns*rows); i++) {
            game.add(numbers[i]);
        }

        return game;
    }
}
