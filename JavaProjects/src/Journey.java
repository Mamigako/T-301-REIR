import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Journey {
    
    public static void main(String[] args) {
        
        // Read in journey sequence to a char array.
        char[] journey_sequence = StdIn.readString().toCharArray();

        // Initialize stack for Óli's backpack.
        char[] stack = new char[journey_sequence.length];
        int stack_pointer = 0;

        // Initialize loot counts.
        int money_count = 0;
        int gold_count = 0;
        int jewels_count = 0;

        // For-each loop through the journey.
        for (char c : journey_sequence) {

            // Push item onto the stack
            if (c == 'p' || c == 'g' || c == 'o') {
                stack[stack_pointer++] = c;  
            } 
            // If Evil is encountered, define required item.
            else if (c == 'P' || c == 'G' || c == 'O') {
                char required_item = ' ';
                
                if (c == 'P')
                    required_item = 'p';
                else if (c == 'G')
                    required_item = 'g';
                else if (c == 'O')
                    required_item = 'o';
                

                // Search the stack for the required item using boolean value.
                boolean found = false;

                while (stack_pointer > 0) {
                    // Assign the top of the stack to top.
                    char top = stack[stack_pointer - 1];
                    // Pop from the stack by decrementing the stack pointer.  
                    stack_pointer--;  

                    if (top == required_item) {
                        found = true;
                        break;
                    }
                }

                // If item is not found, journey cannot be completed.
                if (!found) {
                    StdOut.println("Neibb");
                    return;
                }
            }
        }

        // Count the remaining items in the stack.
        for (int i = 0; i < stack_pointer; i++) {
            if (stack[i] == 'p') 
            money_count++;
            else if (stack[i] == 'g') 
            gold_count++;
            else if (stack[i] == 'o') 
            jewels_count++;
        }

        // Print out loot counts.
        StdOut.println(money_count);
        StdOut.println(gold_count);
        StdOut.println(jewels_count);
    }
}
