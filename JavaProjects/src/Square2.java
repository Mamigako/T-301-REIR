import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Square2 {
    
    public static void main(String[] args) {
        

        //read user input(size of square).
        int l_num = StdIn.readInt();

        //first loop, iterates through vertical positions.
        for (int i = 0; i < l_num; i++) {

            for (int j = 0; j < l_num; j++) {

                if (i == 0 || i == l_num-1 ) {
                    
                    if (j == (l_num-1)){

                        StdOut.print("*"+"\n");
                    }
                    else{
                    StdOut.print("* ");
                    }
                }

                else {

                    if (j == 0){
                        StdOut.print("* ");
                    }

                    else if (j == l_num-1){
                        StdOut.print("*"+"\n");
                    }

                    else {
                        StdOut.print("  ");
                    }

                }

            }
        }

    }
}
