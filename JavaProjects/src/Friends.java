import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Friends {

    public static void main(String[] args) {
        
        // Read input
        String[] friends_ops = StdIn.readLine().split(" ");
        int friends = Integer.parseInt(friends_ops[0]);
        friends++;  // Increment to account for 1-based indexing
        int ops = Integer.parseInt(friends_ops[1]);
        
        // Initialize the parent array and size array
        int[] friends_array = new int[friends];  // parent array
        int[] size = new int[friends];           // size array

        // Initialize arrays, each friend is their own parent, and size is initially 0
        for (int i = 1; i < friends; i++) {
            friends_array[i] = i;  // Each friend is their own parent
            size[i] = 0;           // Initial size is 0 until they make a friend
        }

        // Process the operations
        for (int k = 0; k < ops; k++) {
           String[] commands = StdIn.readLine().split(" ");
           
           if (commands.length > 2) {
               // Union operation: 1 a b
               int p = Integer.parseInt(commands[1]);  
               int q = Integer.parseInt(commands[2]); 
               union(friends_array, size, p, q);
           } else {
               // Size query operation: 2 a
               int p = Integer.parseInt(commands[1]); 
               int rootP = find(friends_array, p);    // Find the root of person p
               StdOut.println(size[rootP]);           // Print the size of the root component
           }
        }
    }

    // Find function to find the root of a friend.
    public static int find(int[] friends, int p) {
        while (p != friends[p]) {
            p = friends[p];  // Trace back to the root
        }
        return p;
    }

    // Union function to union two friends.
    public static void union(int[] friends, int[] size, int p, int q) {
        int rootP = find(friends, p);
        int rootQ = find(friends, q);

        if (rootP == rootQ) return;  // They are already connected

        // Initialize size if they haven't made any friends yet
        if (size[rootP] == 0) size[rootP] = 1;  // Person counts as their own friend
        if (size[rootQ] == 0) size[rootQ] = 1;  // Same for the other person

        // Union by size: attach the smaller tree to the larger tree
        if (size[rootP] < size[rootQ]) {
            friends[rootP] = rootQ;           // Make rootQ the parent of rootP
            size[rootQ] += size[rootP];       // Update the size of the new root (add rootP's size)
        } else {
            friends[rootQ] = rootP;           // Make rootP the parent of rootQ
            size[rootP] += size[rootQ];       // Update the size of the new root (add rootQ's size)
        }
    }
}
