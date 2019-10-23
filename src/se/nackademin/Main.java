package se.nackademin;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<List<Integer>> spelTest = generateGame(5,5);

        for(int i = 0; i < spelTest.size(); i++) {
            for(int e : spelTest.get(i)) {
                System.out.print(e + "  ");
            }
            System.out.println();
        }

    }

    public static List<List<Integer>> generateGame (int columns, int rows) {
        List<List<Integer>> newGame = new ArrayList<>();

        List<Integer> tempList = new ArrayList<>();

        for (int e = 0; e < columns; e++) {
            tempList.clear();
            for (int i = 0; i < rows; i++) {
                tempList.add(0);
            }
            newGame.add(tempList);
        }


        return newGame;
    }
}
