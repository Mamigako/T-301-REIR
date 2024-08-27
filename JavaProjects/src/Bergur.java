import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Bergur {
    
    public static void main(String[] args) {
        
        int num_of_days = StdIn.readInt();
        int[] days = new int[num_of_days];
        int lowest = 0;

        for (int i = 0; i < num_of_days; i++) {

            days[i] = StdIn.readInt(); 
        }
        
        lowest = days[num_of_days-1];

        int sum = 0;

        for (int i = num_of_days-1; i > -1; i--) {           
        
            if (days[i] < lowest) {

                sum += days[i];
                lowest = days[i];

            }
                else {
                sum += lowest;
            }
            }

            StdOut.print(sum);

        }

    }

