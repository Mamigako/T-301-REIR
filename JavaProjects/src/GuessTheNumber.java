import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class GuessTheNumber {
    
    public static void main(String[] args) {
        
        //Binary search algorithm for range 1-1000.
        
        // Initialize low and high ends as well as initial guesss and response.
        int hi = 1000;
        int lo = 1;
        int guess = 500;
        String response = "";
        
        // For loop defining 10 attempts exactly.
        for (int counter = 0; counter < 10; counter++){
            
            // Print out the guess and read in response to guess.
            StdOut.println(guess);
            System.out.flush();
            response = StdIn.readLine();
            
        // If guess is higher than number, assign guess- 1 to high end, if lower than number assign guess +1 to low end.
        // If correct, print correct and terminate program.
        switch (response) {
            case "lower":
                hi = guess -1;
                break;
            case "higher":
                lo = guess +1;
                break;
            case "correct":
                System.exit(0);
                break;

            }
            
            // assign new middle of range as guess.
            guess = (hi + lo) / 2;

        }
    }
}
