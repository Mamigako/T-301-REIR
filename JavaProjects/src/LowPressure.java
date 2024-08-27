import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class LowPressure {
    
    public static void main(String[] args) {
       
       // Initialize and read in row and col variables.
       int rows = StdIn.readInt();
       int columns = StdIn.readInt();
       StdIn.readLine();
       int i = 0;
       boolean low_pressure = false;

       // Initialize an int array of arrays the size "row" * "columns".
       int[][] system = new int[rows][columns];


       // Read in a line of inputs as string, split it into a string array and initialize an int array.
       for (i = 0; i < rows; i++) {

            String new_row_string = StdIn.readLine();
            String[] new_row_split = new_row_string.split(" ");
            int[] new_row_int = new int[columns];
        
            // Parse all elements of the String array as Int into the Int array.
            for (int k = 0; k < columns; k++) {
                    new_row_int[k] = Integer.parseInt(new_row_split[k]); 
            }
            // Insert Column array into Row array.
            system[i] = new_row_int;
       }

       // Compare each number(except for row/col 0 and -1 and index 0 and -1) to its neighbours vertically and horizontally. 
       // Set boolean to true if conditions are met.
       for (i = 1; i < rows-1; i++) {
            for (int j = 1; j < columns-1; j++) {

                if ((system[i][j] < system[i][j-1]) && (system[i][j] < system[i-1][j]) && (system[i][j] < system[i][j+1]) && (system[i][j] < system[i+1][j])) {
                    low_pressure = true;
                }
            } 
       }

    // Print result.
    if (low_pressure == true) {StdOut.print("Jebb");}

    else {StdOut.print("Neibb");}

       }
    }

