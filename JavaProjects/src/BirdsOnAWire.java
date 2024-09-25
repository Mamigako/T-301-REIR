import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;


public class BirdsOnAWire {

    // Counts how many birds can sit on a wire, given certain parameters.

    public static void main(String[] args) {
        
        // Read input.
        String[] commands = StdIn.readLine().split(" ");
        int wire_length = Integer.parseInt(commands[0]);
        int min_distance =  Integer.parseInt(commands[1]);
        int birds =  Integer.parseInt(commands[2]);

        int bird_counter = 0;
        
        // Adjust wire length to exclude 6 cm from each side.
        int effective_wire_length = wire_length - 12;

        if (birds == 0) {
            // No birds on the wire, use the entire effective wire length and add 1.
            bird_counter = (effective_wire_length / min_distance)+1;

        } else {
            // Read bird positions
            int[] bird_positions = new int[birds];
            for (int i = 0; i < birds; i++) {
                bird_positions[i] = StdIn.readInt();
            }
            
            // Sort bird positions to process gaps between them
            Arrays.sort(bird_positions);

            // Count birds before the first bird.
            bird_counter += (bird_positions[0] - 6) / min_distance;

            // Count birds between each pair of birds.
            for (int i = 1; i < birds; i++) {
                int gap = bird_positions[i] - bird_positions[i - 1];
                // -1 because the birds already occupy these positions.
                bird_counter += (gap / min_distance) - 1;  
            }

            // Count birds after the last bird.
            bird_counter += (wire_length - 6 - bird_positions[birds - 1]) / min_distance;
        }

        // Output the number of additional birds that can sit on the wire
        StdOut.println(bird_counter);

    }
}
