package ChessBoard;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Chessboard board = new Chessboard();

        Piece[][] actualBoard = board.getBoard();
        print(actualBoard);

        Coordinate firstPiecePos = findPiece(actualBoard, input);
        Coordinate secondPiecePos = findPiece(actualBoard, input);

        Piece firstPiece = actualBoard[firstPiecePos.getX()][firstPiecePos.getY()];
        Piece secondPiece = actualBoard[secondPiecePos.getX()][secondPiecePos.getY()];

        firstPiece.swap(board, secondPiece);
        print(actualBoard);
    }

    private static Coordinate findPiece(Piece[][] actualBoard, Scanner input)
    {
        String piece = "";
        int xCoord = -1;
        while (xCoord < 0 || xCoord > 7)
        {
            System.out.println("Enter a letter (A-H)");
            piece = input.nextLine();
            xCoord = (piece.charAt(0)) - 65;
        }

        int yCoord = -1;
        while (yCoord < 0 || yCoord > 7)
        {
            System.out.println("Enter a number 1-8");
            yCoord = input.nextInt();
            input.nextLine();
            piece += yCoord;
            yCoord = Math.abs(yCoord - 8);
        }
        System.out.println("You selected the piece at: " + piece + ": " + actualBoard[yCoord][xCoord].getName());
        Coordinate newCoord = new Coordinate(yCoord, xCoord);
        return newCoord;
    }

    //Do not make alterations to this method!
    public static void print(Piece[][] array)
    {
        for(Piece[] row : array)
        {
            printSideLabel(row);
            for(Piece thing : row)
            {
                System.out.print(thing.getName() + "\t");
            }
            System.out.println();
        }

        printBottomLabels(array);
    }

    private static void printSideLabel(Piece[] row) {
        int yPos = Math.abs(row[0].getyPos() - 7) + 1;
        System.out.print(yPos + "\t");
    }
    private static void printBottomLabels(Piece[][] array)
    {
        System.out.print(" " + "\t");
        for (int i = 0; i < array[0].length; i++)
        {
            char letter = array[0][i].xToLetter();

            String labelName = array[0][i].getName();
            String label = "";
            for (int j = 0; j < labelName.length(); j++)
            {
                label += " ";
            }
            label = letter + label;

            System.out.print(label + "\t");
        }
        System.out.println();
    }
}