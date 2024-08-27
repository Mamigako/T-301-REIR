import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Reverse {
    
    public static void main(String[] args) {
        
        int loop_num = StdIn.readInt();

        int[] nums = new int[loop_num];

        int temp;
    
        for (int i = 0; i < loop_num ; i++) {

            nums[i] = StdIn.readInt();
        }

        for (int i = 0; i < loop_num / 2 ; i++) {

            temp = nums[i];
            nums[i] = nums[loop_num - i - 1];
            nums[loop_num - i - 1] = temp;

        }

        for (int k = 0; k < nums.length; k++){ 
        StdOut.print(nums[k] + "\n");

    }
    }
}
