import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BracketMatching {
    
    public static void main(String[] args) {
        
        // Read in number of elements.
        int elements = StdIn.readInt();
        StdIn.readLine();
    
        // Initialize arrays of size elements(one is a stack).
        char[] stack = new char[elements];

        // Read in elements string and split to separate
        char[] stack_elements = StdIn.readString().toCharArray();

        // Initialize allowed elements.
        char round_bracket_left = '(';
        char round_bracket_right = ')';
        char square_bracket_left = '[';
        char square_bracket_right = ']';
        char curly_bracket_left = '{';
        char curly_bracket_right = '}';

        // Stack pointer.
        int stack_pointer = 0;
    
    
        // Loop through elements and add left brackets to stack, and pop them once a corresponding right bracket is found.
        for (int i = 0; i < elements; i++) {
            if (stack_elements[i] == round_bracket_left || stack_elements[i] == square_bracket_left || stack_elements[i] == curly_bracket_left) {
                stack[stack_pointer] = stack_elements[i];
                stack_pointer++;
                continue;
            }

            if (stack_elements[i] == round_bracket_right || stack_elements[i] == square_bracket_right || stack_elements[i] == curly_bracket_right) {
                if (stack_pointer == 0) {
                    stack_pointer = -1;
                    break;
                }

                if ((stack[stack_pointer - 1] == round_bracket_left && stack_elements[i] == round_bracket_right) ||
                        ((stack[stack_pointer - 1]) == (stack_elements[i] - 2))) {
                    stack_pointer--;

                } else {

                    StdOut.println("Invalid");
                    System.exit(0);
                }
            }
        }

        // If Stack is empty at the end, sequence is valid, otherwise it is invalid.
        if (stack_pointer == 0) {
            StdOut.print("Valid");
        } else {
            StdOut.print("Invalid");
        }
    }
}
