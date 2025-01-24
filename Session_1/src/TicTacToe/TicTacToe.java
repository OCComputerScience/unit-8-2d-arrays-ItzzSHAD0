package TicTacToe;

public class TicTacToe
{
    // Declare 2D array to store an empty board
    private String[][] board = new String[3][3];
    int turn;
    // and other required variables

    // Add constructor to initialize an empty board
    public TicTacToe()
    {
        board = new String[][]{{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        turn = 0;
    }
    // Add getter for 2D array
    public String[][] getBoard()
    {
        return board;
    }
    public int getTurn()
    {
        return turn;
    }

    /* Pick a location(row, col)
     This should return a boolean that indicates if the location is valid
     A valid location is whether the array bounds, and the location does not already
     contain an X or O
     */
    public boolean pickLocation(int row, int col)
    {
        return 4 > row && row > -1 &&
                4 > col && col > -1 &&
                board[row][col].equals("-");
    }

    /* Take turn(row, col)
       Add the appropriate symbol(X or O) to the location selected
       Update the current players turn
     */
    public void takeTurn(int row, int col)
    {
        if (turn % 2 == 0)
        {
            board[row][col] = "X";
        }
        else
        {
            board[row][col] = "O";
        }

        turn++;
    }

    /* Check columns
       This should return a boolean for if any column contains three consecutive X's or O's
     */
    public boolean checkCol()
    {
        int foundWin = 0;
        for (int i = 0; i < board.length; i++)
        {
            foundWin = 0;
            String firstVal = board[0][i];
            for (int j = 1; j < board[0].length; j++)
            {
                if (firstVal.equals(board[j][i]))
                {
                    foundWin++;
                }
            }
            if (foundWin == 2 && !firstVal.equals("-"))
                return true;
        }
        return false;
    }

    /* Check rows
       This should return a boolean for if any rows contains three consecutive X's or O's
     */
    public boolean checkRow()
    {
        int foundWin = 0;
        for (int i = 0; i < board.length; i++)
        {
            foundWin = 0;
            String firstVal = board[i][0];
            for (int j = 1; j < board[0].length; j++)
            {
                if (firstVal.equals(board[i][j]))
                {
                    foundWin++;
                }
            }
            if (foundWin == 2 && !firstVal.equals("-"))
                return true;
        }
        return false;
    }

     /* Check rows
       This should return a boolean for if any diagonal contains three consecutive X's or O's
     */
     public boolean checkDiagnols()
    {
        int foundWin = 0;
        String firstVal = board[1][1];

        if (firstVal.equals("-"))
            return false;

        for (int diag = 0; diag < board.length; diag += 2)
        {
            int col = diag;
            foundWin = 0;
            for (int row = 0; row < board.length; row++)
            {
                if (firstVal.equals(board[row][col]))
                    foundWin++;

                if (diag == 0)
                    col++;
                else
                    col--;
            }
            if (foundWin == 3)
                return true;
        }
        return false;
    }

     /* Check wins
       This should return a boolean if the other 3 methods return true
     */
    public boolean checkWin()
    {
        return checkRow() || checkCol() || checkDiagnols();
    }
}
