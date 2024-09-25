import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class MinimumScalarProduct {
 
    
    public static void main(String[] args) {
        
        int nr_of_testcases = StdIn.readInt();
        int count = 0;

        for (int i = 0; i < nr_of_testcases; i++){
            count++;
            int array_len = StdIn.readInt();
            StdIn.readLine();
            long sum = 0;

            String[] str_array1 = new String[array_len];
            String[] str_array2 = new String[array_len];
            
            long[] array1 = new long[array_len];
            long[] array2 = new long[array_len];
            
            str_array1 = StdIn.readLine().split(" ");
            str_array2 = StdIn.readLine().split(" ");

            for (int j = 0; j < array_len; j++){
                    array1[j] = Long.parseLong(str_array1[j]);
                    array2[j] = Long.parseLong(str_array2[j]);

                }
            
            Arrays.sort(array1);
            Arrays.sort(array2);
            reverse(array2);


            for (int x = 0; x < array_len; x++)
                sum += array1[x]*array2[x];
            
            StdOut.println("Case #"+ (count) + ": " + sum);

            }
        

        }




        public static void reverse(long[] array) {
            int left = 0, right = array.length - 1;
            while (left < right) {
                long temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
    }
}
