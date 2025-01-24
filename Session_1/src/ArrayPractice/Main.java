package ArrayPractice;

public class Main
{
    public static void main(String[] args)
    {
        // Create 2D array
        int[][] myArray = {{18, 7, 23, 12, 5, 0},
                           {524, 789, 312, 456, 871, 193, 634, 219},
                           {3, 6, 9}};

        // Change the final element of the 1D array at index 0 to the total length of the 2D array
        updateValue(myArray, 0, myArray[0].length - 1, myArray[0].length);

        // Add the value at the 1st and last index of the 2D array to the value of the last element in the 1D array at index 1
        updateValue(myArray, 1, myArray[1].length-1, myArray[0][0] + myArray[myArray.length - 1][myArray[myArray.length - 1].length - 1] + myArray[1][myArray[1].length-1]);

        // Change each value of the 1D array at index 2 to display the length of each respective 1D array.
        updateValue(myArray, myArray.length - 1, 0, myArray[0].length);
        updateValue(myArray, myArray.length - 1, 1, myArray[1].length);
        updateValue(myArray, myArray.length - 1, 2, myArray[2].length);

        // Print the new array
        print(myArray);
    }


    //Do not make alterations to this method!
    public static void print(int[][] array)
    {
        for(int[] row: array)
        {
            for(int num: row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void updateValue(int[][] array, int row, int col, int value)
    {
        array[row][col] = value;
    }
}
