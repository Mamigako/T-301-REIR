import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

//UNFINISHED

public class Permutations {
    
    public static void main(String[] args) {
        
        int n = StdIn.readInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = StdIn.readInt();

        int[] B = new int[n];
        for (int i = 0; i < n; i++)
            B[A[i]] = i;

        for (int i = 0; i < n; i++)
            StdOut.print(B[i] + " ");
            StdOut.println();
}
}