import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Bergmal {
    public static void main(String[] args) {
        
        String bergurscode = StdIn.readLine();
        char bergurschar = 0;

        for (int i = 0; i < bergurscode.length(); i++){
             
        bergurschar = bergurscode.charAt(i); 

        StdOut.print(bergurschar);
        
        }
    }
    
}
