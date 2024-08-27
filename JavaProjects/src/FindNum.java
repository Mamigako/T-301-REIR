import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FindNum {
    
    public static void main(String[] args) {
        
        int n = StdIn.readInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = StdIn.readInt();
        

        boolean[] hak = new boolean[n];
        for (int i = 0; i < n; i++)
            hak[A[i]] = true;

            int vantar = -1;

            for (int i = 0; i < n; i++)    
                if (hak[i] == false)
                    vantar = i;
            
                    StdOut.println("Vantar: "+ vantar);
     
        }
}
