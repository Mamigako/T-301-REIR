import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class PiDigits {
    

    public static void main(String[] args) {
        
        long seconds = StdIn.readLong();
        
        long hi = (long) (1.34*Math.pow(10, 6));
        
        long lo = 0;
        
        long mid = lo + ((hi - lo)/2);
        
        double calc = 0;

        while (lo <= hi){
                    
            double mid_calc = (double) mid;
            calc = (mid_calc*Math.log10(mid_calc)) / Math.pow(10, 6);
            mid = (long) mid_calc;
 
            if ((calc < seconds)){
            lo = mid + 1;}

            else if (calc > seconds){
            hi = mid -1;
            }
            
            else {
            StdOut.print(mid);
            System.exit(0);}

            mid = lo + (hi - lo)/2;

        }
        StdOut.print(mid);
    }
}
