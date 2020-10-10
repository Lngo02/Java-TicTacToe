package tictactoe;

import java.util.Scanner;
import java.lang.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    // Checks if the cells from cell1 to cell3 are the same.
    static boolean checkSame(int cell1, int cell2, int cell3, char[] array){
        char A = array[cell1];
        char B = array[cell2];
        char C = array[cell3];
        if (A == B && B == C && A !='_'){
            return true;
        }
        return false;
    }

    static void printBoard(char[] ch){
        String row = "";
        System.out.println("---------");
        for (int i = 0, n = ch.length; i < n; i++) {
            row = row + ch[i] + " ";
            if ((i+1) % 3 == 0 && i != 0) {
                System.out.println("| " + row + "|");
                row = "";
            }
        }
        System.out.println("---------");
    }

    static char[] playCoordinates(char player, char[] ch){
        boolean validCoordinates = false;
        char[] newCh = ch;

        while (validCoordinates == false) {
            String coordinateStr = sc.nextLine();
            String[] coordinates = coordinateStr.split(" ");
            int coordinatesX = Integer.parseInt(coordinates[0]);
            int coordinatesY = Integer.parseInt(coordinates[1]);

            if (coordinatesX == 1 && coordinatesY == 3) {
                // Replace at 0
                if (ch[0] == '_'){
                    ch[0] = player;
                    validCoordinates = true;
                }
            }
            else if (coordinatesX == 2 && coordinatesY == 3) {
                // Replace at 1
                if (ch[1] == '_'){
                    ch[1] = player;
                    validCoordinates = true;
                }
            }
            else if (coordinatesX == 3 && coordinatesY == 3) {
                // Replace at 2
                if (ch[2] == '_'){
                    ch[2] = player;
                    validCoordinates = true;
                }
            }
            else if (coordinatesX == 1 && coordinatesY == 2) {
                // Replace at 3
                if (ch[3] == '_'){
                    ch[3] = player;
                    validCoordinates = true;
                }
            }
            else if (coordinatesX == 2 && coordinatesY == 2) {
                // Replace at 4
                if (ch[4] == '_'){
                    ch[4] = player;
                    validCoordinates = true;
                }
            }
            else if (coordinatesX == 3 && coordinatesY == 2) {
                // Replace at 5
                if (ch[5] == '_'){
                    ch[5] = player;
                    validCoordinates = true;
                }
            }
            else if (coordinatesX == 1 && coordinatesY == 1) {
                // Replace at 6
                if (ch[6] == '_'){
                    ch[6] = player;
                    validCoordinates = true;
                }
            }
            else if (coordinatesX == 2 && coordinatesY == 1) {
                // Replace at 7
                if (ch[7] == '_'){
                    ch[7] = player;
                    validCoordinates = true;
                }
            }
            else if (coordinatesX == 3 && coordinatesY == 1) {
                // Replace at 8
                if (ch[8] == '_'){
                    ch[8] = player;
                    validCoordinates = true;
                }
            }

            if (validCoordinates == false){
                System.out.println("This cell is occupied! Choose another one!");
            }
        }

        newCh = ch;
        return newCh;
    }

    static int countWinners(char[] ch){
        int numWinners = 0; // Check number of winners

        // Check row wins.
        if (checkSame(0,1,2, ch)) {
            numWinners++;
        }
        if (checkSame(3,4,5, ch)) {
            numWinners++;
        }
        if (checkSame(6,7,8, ch)) {
            numWinners++;
        }

        // Check diagonal wins.
        if (checkSame(0,4,8, ch)) {
            numWinners++;
        }
        if (checkSame(2,4,6, ch)) {
            numWinners++;
        }

        // Check column wins.
        if (checkSame(0,3,6,ch)){
            numWinners++;
        }
        if(checkSame(1,4,7, ch)){
            numWinners++;
        }
        if(checkSame(2,5,8,ch)){
            numWinners++;
        }

        return numWinners;
    }

    static char getWinner(char[] ch) {
        char winner = 'N'; // Check who the winner is.

        // Check row wins.
        if (checkSame(0,1,2, ch)) {
            winner = ch[0];
        }
        if (checkSame(3,4,5, ch)) {
            winner = ch[3];
        }
        if (checkSame(6,7,8, ch)) {
            winner = ch[6];
        }

        // Check diagonal wins.
        if (checkSame(0,4,8, ch)) {
            winner = ch[0];
        }
        if (checkSame(2,4,6, ch)) {
            winner = ch[2];
        }

        // Check column wins.
        if (checkSame(0,3,6,ch)){
            winner = ch[0];
        }
        if(checkSame(1,4,7, ch)){
            winner=ch[1];
        }
        if(checkSame(2,5,8,ch)){
            winner=ch[2];
        }

        return winner;
    }

    static boolean boardFull(char[] ch){
        String cells = new String(ch);
        if (cells.contains("_")) {
            return false;
        }
        return true;
    }

    static boolean gameOver(char[] ch){
        if (countWinners(ch) > 0 || boardFull(ch)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // write your code here

        //String cells = sc.nextLine();

        String cells = "_________";
        // Count number of X's and O's
        int numX = 0;
        int numO = 0;

        // Creating array of string length
        char[] ch = new char[cells.length()];
        // Copy character by character into array
        for (int i = 0; i < cells.length(); i++){
            ch[i] = cells.charAt(i);
            if (ch[i] == 'X') {
                numX++;
            }
            else if (ch[i] == 'O') {
                numO++;
            }
        }

        printBoard(ch);

        char player = 'X';
        while (!gameOver(ch)){
            ch = playCoordinates(player, ch);
            printBoard(ch);
            if(player == 'X'){
                player = 'O';
            } else {
                player = 'X';
            }
        }

        // Count X and O
        numX = 0;
        numO = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'X') {
                numX++;
            } else if (ch[i] == 'O') {
                numO++;
            }
        }

        cells = new String(ch);
        // More X's than O's
        int numWinners = countWinners(ch);
        System.out.println(numWinners);
        if (numWinners == 0){
            if (cells.contains("_")) {
                System.out.println("Game not finished");
            } else {
                System.out.println("Draw");
            }
        } else if (numWinners > 0) {
            System.out.println(getWinner(ch) + " wins");
        }


    }
}
