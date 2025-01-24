package SumRows;

public class Main
{
    public static void main(String[] args)
    {
        // Declare 2D array
        int[][] myArray = {{4, 4, 5, 6, 3, 1},
                           {14, 2, 5, 4, 8, 2},
                           {45, 12, 13, 5, 2, 1}};

        // Display sum of all rows
        int sumOfRows = sumRow(myArray, 2);
        System.out.println(sumOfRows);

        // Display sum of all columns
        int sumOfCols = sumCol(myArray, 2);
        System.out.println(sumOfCols);

        // Display sum of all elements
        int sumOfArray = sumArray(myArray);
        System.out.println(sumOfArray);

        // Print entire array
        for (int[] row : myArray)
        {
            for (int value : row)
            {
                System.out.print(value + ", ");
            }
        }

    }

    public static int sumRow(int[][] myArray, int row)
    {
        int sum = 0;
        for (int value : myArray[row])
        {
            sum += value;
        }
        return sum;
    }

    public static int sumCol(int[][] myArray, int col)
    {
        int sum = 0;
        for (int[] value : myArray)
        {
            sum += value[col];
        }
        return sum;
    }

    public static int sumArray(int[][] myArray)
    {
        int sum = 0;
        for (int[] row : myArray)
        {
            for (int value : row)
            {
                sum += value;
            }
        }
        return sum;
    }

}
