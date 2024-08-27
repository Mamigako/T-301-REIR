import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;


public class Sith {
    
    public static void main(String[] args) {
    
    String force_user = StdIn.readLine();
    int a = StdIn.readInt();
    int b = StdIn.readInt();
    int ab = StdIn.readInt();

    int abchecker = a - b;

    if (abchecker < 0 && (abchecker == ab)){

        StdOut.print("JEDI");
    } 

    else if (abchecker < 0 && (abchecker != ab)) {

        StdOut.print("SITH");
    }

    else if (abchecker > 0) {

        StdOut.print("VEIT EKKI");
    }
    
    }
}
