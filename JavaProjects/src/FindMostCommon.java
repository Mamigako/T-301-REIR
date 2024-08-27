import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

//UNFINISHED

public class FindMostCommon {

    public static void main(String[] args) {
        
        int n = StdIn.readInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = StdIn.readInt();
        
        //Increase counter
        int[] count = new int[n];
        for (int i = 0; i < n; i++)
            count[A[i]]++;

            int maxi = 0;
            
            //count
            for (int i = 0; i < n; i++)    
                if (count[i] > count[maxi])
                    maxi = i;
                    StdOut.println("Agengast: "+ maxi +" kom fyrir" + count[maxi]);
     
        }
}

