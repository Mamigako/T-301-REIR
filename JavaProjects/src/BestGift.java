import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BestGift {
    

    public static void main(String[] args) {
        
        int highest_rating = 0; 
        String[] highest_rated_combo = {};
        int num_of_guests = StdIn.readInt();
        StdIn.readLine();
        String[] guest_list = new String[num_of_guests]; 

        for (int i = 0; i < num_of_guests; i++) {

            String guest = StdIn.readLine();
            guest_list[i] = guest;

        }
    
        for (int k = 0; k < num_of_guests; k++) {
            
            String[] guest_split = guest_list[k].split(" ");
            int gift_rating = Integer.parseInt(guest_split[1]);
            
            if (gift_rating > highest_rating) {
                highest_rating = gift_rating;
                highest_rated_combo = guest_split;

            }    
        }

        StdOut.print(highest_rated_combo[0]);
        
    }
}
