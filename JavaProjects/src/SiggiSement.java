import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;


public class SiggiSement {

    //Finding out which 2 bags of cement can fill a hole of a certain size.
    //each bag can only be chosen once.

    public static void main(String[] args) {
        
        //Read in amount of bags and hole size.
        String[] bags_and_weight = StdIn.readLine().split(" ");
        //If there is only one bag, exit.
        if (bags_and_weight[0] == "1"){StdOut.print("Neibb"); return;}

        //If the hole size is below max int capacity use int.
        if (Long.parseLong(bags_and_weight[1]) < 2147483647) {
        
        //Cast number of bags and hole size into int.
        int bags = Integer.parseInt(bags_and_weight[0]);
        int weight = Integer.parseInt(bags_and_weight[1]);
        int[] bag = new int[bags];
        int[] chosen_bags = new int[2];

        //Read bags into int array.
        for (int i = 0; i < bags; i++){
            bag[i] = StdIn.readInt();
        }

        //Sort the array.
        Arrays.sort(bag);

        //Find bags that equal hole size using 2 pointers traversing the array from both sides and comparing sum of elements.
        int left = 0;
        int right = bags - 1;
        boolean found = false;

        while (left < right){
            
            int sum = bag[left] + bag[right];

            if (sum == weight){                 
            chosen_bags[0] = bag[left];
            chosen_bags[1] = bag[right];
            found = true;
            break;}
            
            else if (sum < weight)
                left++;

            else
                right--;
        }
           
        // If bag not found, exit. Else print both bags.
        if (!found){
            StdOut.print("Neibb");} 
        else {
        StdOut.print(chosen_bags[0] + " " + chosen_bags[1]);
        }

}

    // Same as above, but using long.
    else { 

        int bags = Integer.parseInt(bags_and_weight[0]);
        long weight = Long.parseLong(bags_and_weight[1]);
        long[] bag = new long[(int)bags];
        long[] chosen_bags = new long[2];

    for (int i = 0; i < bags; i++){
        bag[i] = StdIn.readLong();
    }

    Arrays.sort(bag);

    int left = 0;                    
    int right = bags - 1;             
    boolean found = false;
    long weightlong = weight;         
    
    while (left < right) {
        long sum = (long) bag[left] + (long) bag[right]; 
    
        if (sum == weightlong) {                          
            chosen_bags[0] = bag[left];   
            chosen_bags[1] = bag[right];
            found = true;
            break;
        } else if (sum < weightlong) {
            left++;   
        } else {
            right--;  
        }
    }
       
    if (!found){
        StdOut.print("Neibb");} 
    else {
    StdOut.print(chosen_bags[0] + " " + chosen_bags[1]);}
    
        }
    }
}