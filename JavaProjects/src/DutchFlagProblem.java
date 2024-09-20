import edu.princeton.cs.algs4.StdOut;

public class DutchFlagProblem {
 
    // Sorts 0s, 1s, 2s using Dijkstra´s 3 partitioning algorithm.
    
    public static void main(String[] args) {

        // Initialize array
        int[] arr = {0,2,2,1,0,1,2,1,0,1};

        // Sort
        threewaysort(arr);
        
        // Print array
        for (int i = 0; i < arr.length; i++){
            StdOut.print(arr[i] + " ");
        }
    }

    public static void threewaysort(int[] arr) {

        // Set pointers to low, mid, high
        int low = 0, mid = 0, high = arr.length - 1;


        // Loop through array
        while (mid <= high) {

            // If mid finds a 0, swap numbers in mid and low, increment both
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;

              // If mid finds 1, increment mid only 
            } else if (arr[mid] == 1) {
                mid++;
              
              // if mid finds 2, swap numbers in mid and high, decrement high
            } else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }
    
}
