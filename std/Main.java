package std; // This goes at the top of every file.

public class Main {
    public static void main(String[] args) {

        // Driver code goes here.

        System.out.println();

        System.out.println("Create and run your tic-tac-toe game here!");
        System.out.println("Don't write the game login in Main! Write it in TicTacToe.java");

        TicTacToe tttGame = new TicTacToe();

        System.out.println();
        System.out.println("Let's print the board!");
        System.out.println();

        tttGame.printBoard(); // Should print the board.

        System.out.println();
        System.out.println("Whoops... that's not right!");


    }
}
