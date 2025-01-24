package TicTacToe;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        TicTacToe board = new TicTacToe();

        boolean hasWon = false;

        while (!hasWon)
        {
            boolean validSpot = false;
            int row = -1;
            int col = -1;

            while (!validSpot)
            {
                System.out.println("Pick a row:");
                row = input.nextInt();

                System.out.println("Pick a column:");
                col = input.nextInt();

                validSpot = board.pickLocation(row, col);
            }
            board.takeTurn(row, col);
            printBoard(board.getBoard());
            hasWon = board.checkWin();
        }

    }

    public static void printBoard(String[][] array)
    {
        for(String[] row: array)
        {
            for(String play: row)
            {
                System.out.print(play + " ");
            }
            System.out.println();
        }
    }
}
