import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class StarWarsSort {

    public static void main(String[] args) {


        // Read in the number of elements
        int num_of_elements = StdIn.readInt(); 
        StdIn.readLine(); 
        int[] elements_array = new int[num_of_elements]; 

        // Read in array values. Split and cast into int.
        String inputLine = StdIn.readLine();
        String[] inputArr = inputLine.split(" ");

        for (int i = 0; i < num_of_elements; i++) {  
            elements_array[i] = Integer.parseInt(inputArr[i]);}
        
        // Numerical sort
        Arrays.sort(elements_array); 
        // Star Wars sort
        starwarsify(elements_array);
        // Print result
        printArr(elements_array);
        
    }
    // Function to swap the first third with the middle third
    public static void starwarsify(int[] elements_array) {
        int N = elements_array.length / 3; 

        for (int i = 0; i < N; i++) {
            int j = i + N;  // Adjust indices for swapping

            exch(elements_array, i, j);  // Swap first third with middle third
        }
    }

    // Exchange function that swaps two elements in the array
    private static void exch(int[] elements_array, int i, int j) {
        int swap = elements_array[i];
        elements_array[i] = elements_array[j];
        elements_array[j] = swap;
    }


    // Print the array
    public static void printArr(int[] elements_array) {
        for (int i = 0; i < elements_array.length; i++) {
            StdOut.print(elements_array[i] + " ");
        }
    }
}
