package ChessBoard;

public class Piece
{
    private String name;
    private int xPos;
    private int yPos;
    private int team;

    public Piece(String name, int xPos, int yPos, int team)
    {
        this.name = name;
        this.xPos = xPos;
        this.yPos = yPos;
        this.team = team;
    }

    public String getName()
    {
        return name;
    }
    public int getxPos()
    {
        return xPos;
    }
    public int getyPos()
    {
        return yPos;
    }
    public int getTeam()
    {
        return team;
    }
    public void swap(Chessboard board, Piece other)
    {
        if (other.getTeam() == team)
        {
            System.out.println("Cannot move " + xToLetter() + (yPos + 1) + " to " + other.xToLetter() + (other.getyPos() + 1) + ", same team...");
        }
        else if (other.getTeam() == -1 || other.getTeam() == Math.abs(team - 1))
        {
            Piece tempOther = this;

            xPos = other.xPos;
            yPos = other.yPos;

            other.xPos = tempOther.xPos;
            other.yPos = tempOther.yPos;

            board.getBoard()[yPos][xPos] = other;
            board.getBoard()[other.yPos][other.xPos] = this;
        }
        else
        {
            System.out.println("Got incorrect team...");
        }
    }

    public char xToLetter()
    {
        String letterStr = Character.toString((char) (xPos + 65));

        char letter = letterStr.charAt(0);

        return letter;
    }
}
