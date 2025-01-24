package ChessBoard;

public class Chessboard
{
    private Piece[][] board;

    public Chessboard()
    {
        board = new Piece[8][8];

        resetBoard();
    }

    public void resetBoard()
    {
        resetRoyals();
        resetPawns();
        resetSpace();
    }

    private void resetPawns()
    {
        for (int j = 0; j < board[1].length; j++)
        {
            board[1][j] = new Piece("Pawn", j, 1, 1);
        }
        for (int j = 0; j < board[1].length; j++)
        {
            board[6][j] = new Piece("Pawn", j, 6, 0);
        }
    }
    private void resetSpace()
    {
        for (int i = 2; i < board.length - 2; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                board[i][j] = new Piece("----", j, i, -1);
            }
        }
    }
    private void resetRoyals()
    {
        board[0] = new Piece[]{new Piece("Rook", 0, 0, 1),
                               new Piece("Knight", 1, 0, 1),
                               new Piece("Bishop", 2, 0, 1),
                               new Piece("Queen", 3, 0, 1),
                               new Piece("King", 4, 0, 1),
                               new Piece("Bishop", 5, 0, 1),
                               new Piece("Knight", 6, 0, 1),
                               new Piece("Rook", 7, 0, 1),};

        board[7] = new Piece[]{new Piece("Rook", 0, 7, 0),
                               new Piece("Knight", 1, 7, 0),
                               new Piece("Bishop", 2, 7, 0),
                               new Piece("Queen", 3, 7, 0),
                               new Piece("King", 4, 7, 0),
                               new Piece("Bishop", 5, 7, 0),
                               new Piece("Knight", 6, 7, 0),
                               new Piece("Rook", 7, 7, 0),};
    }

    public Piece[][] getBoard()
    {
        return board;
    }
}
