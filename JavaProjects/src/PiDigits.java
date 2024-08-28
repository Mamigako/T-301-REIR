import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class PiDigits {
    
    // Calculate the amount of digits of pi that can be calculated within a given amount of seconds using binary search.

    public static void main(String[] args) {
        
        // Input secconds.
        double seconds = StdIn.readDouble();
        
        // Initiate high end value.
        long hi = (long) (Math.pow(10, 15));
        
        // Initiate low end value.
        long lo = 0;
        
        // Calculate midpoint.
        long mid = (hi + lo)/2;
        
        double calc = 0;

        while (lo <= hi){
            
            // cast the midpoint into double to calculate amount of seconds using the midpoint as a guess for amount of digits.
            double mid_calc = (double) mid;
            calc = (mid_calc*Math.log10(mid_calc)) / Math.pow(10, 6);
            mid = (long) mid_calc;
 
            // if the estimate is smaller than given seconds, assign midpoint+1 to low end.
            if ((calc < seconds)){
            lo = mid + 1;}

            // If the estimate is larger than given seconds, assign midpoint-1 to high end.
            else if (calc > seconds){
            hi = mid -1;
            }
            
            // If it´s equal(unlikely), print out midpoint as final answer.(Result)
            else {
            StdOut.print(mid);
            System.exit(0);}

            // find new midpoint.
            mid = (hi + lo)/2;

        }

        // Print amount of digits.(Result)
        StdOut.print(mid);
    }
}
