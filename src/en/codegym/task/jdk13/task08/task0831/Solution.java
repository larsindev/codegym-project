package en.codegym.task.jdk13.task08.task0831;

import java.util.Arrays;

/* 
Favorite board games
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        BoardGame chess = new BoardGame();
        chess.name = "Battleship";
        collection[0] = chess;

        BoardGame catan = new BoardGame();
        catan.name = "Catan";
        collection[1] = catan;

        BoardGame dog = new BoardGame();
        dog.name = "Dog";
        collection[2] = dog;

        BoardGame monopoly = new BoardGame();
        monopoly.name = "Monopoly";
        collection[3] = monopoly;

        BoardGame poker = new BoardGame();
        poker.name = "Poker";
        collection[4] = poker;

        System.out.println(Arrays.toString(collection));
    }
}