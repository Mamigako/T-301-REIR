import edu.princeton.cs.algs4.StdIn;

public class Exp_noRec {
    
    public static long power() {

        long n = StdIn.readInt();
        long a = StdIn.readInt();
        long result = 1;

        while (n > 0) {

            if (n % 2 ==1) {result *= a;}

            a *= a;
            n /= 2;
        
        }

        return result;

    }
}