import edu.princeton.cs.algs4.StdOut;

public class CountingSort {

    // Sorting an array using counting sort in O(n + k) time and added k+1 space complexity.
    
    public static void main(String[] args) {

        int[] array = {1, 5, 2, 3, 5, 5, 7};
        int k = array.length;
        countingsort(array, k);
        for (int i = 0; i < k; i++)
            StdOut.print(array[i] + " ");
    }
    public static void countingsort(int[] arr, int k) {
        
        // Count array to store the frequency of each element
        int[] count = new int[k + 1]; 
        
        // Count the occurrences of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // Rebuild the sorted array
        int index = 0;
        for (int i = 0; i <= k; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }
    
}
