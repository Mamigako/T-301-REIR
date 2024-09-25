import java.util.Arrays;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ColouringSocks {
    
    public static void main(String[] args) {

        // Read input data.
        String[] commandArrSTR = StdIn.readLine().split(" ");
        String[] sockArrSTR = StdIn.readLine().split(" ");
        int[] socks = new int[sockArrSTR.length];
        for (int i = 0; i < socks.length; i++)
            socks[i] = Integer.parseInt(sockArrSTR[i]);

        int nr_of_socks = Integer.parseInt(commandArrSTR[0]);
        int capacity = Integer.parseInt(commandArrSTR[1]);
        int absolute_diff = Integer.parseInt(commandArrSTR[2]);

        // Calculate the minimum number of washing machines needed an print result.
        StdOut.println(minWashingMachines(socks, nr_of_socks, capacity, absolute_diff));
    }


    // Function to calculate the minimum number of washing machines needed
    public static int minWashingMachines(int[] socks, int nr_of_socks, int capacity, int absolute_diff) {

        // Sort the socks by their color values
        Arrays.sort(socks);

        int washing_machine_counter = 0;  // Count of machines needed
        int current_machine_socks = 0;    // Number of socks in the current machine
        int first_sock_in_machine = socks[0];  // Track the color of the first sock in the current machine

        for (int i = 0; i < nr_of_socks; i++) {

            // If the current machine is full or the next sock's color difference exceeds the limit.
            if (current_machine_socks == capacity || Math.abs(socks[i] - first_sock_in_machine) > absolute_diff) {
            
                // Start a new machine.
                washing_machine_counter++;
                current_machine_socks = 0;
                // First sock in the new machine.
                first_sock_in_machine = socks[i]; 
            }
            // Add the current sock to the machine
            current_machine_socks++;
        }

        // Counting last machine.
        if (current_machine_socks > 0) {
            washing_machine_counter++;
        }

        return washing_machine_counter;
    }
}
