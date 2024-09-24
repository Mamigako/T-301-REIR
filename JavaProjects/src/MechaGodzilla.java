import java.util.Arrays;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class MechaGodzilla {

    // Godzilla and MechaGodzilla are battling, and their armies have monsters woth positive integer strengths.
    // This program determines who wins, based on the weakest monster in each round.
    // It is biased towards Godzilla winning.

    public static void main(String[] args) {
        
        // Read in nr. of cases.
       int number_of_cases = StdIn.readInt();
        // Read a blank line(as per assignment description).
       String blank = StdIn.readLine();
       
       // Loop through once for each case.
       for (int i = 0; i < number_of_cases; i++){
           
            // Read a blank line(as per assignment description).
           blank = StdIn.readLine(); 
            // Read in size of both armies. 
           String[] nr_of_monsters_str = StdIn.readLine().split(" ");

           // Godzilla´s army:
           
           // Create int array of size of army, read in monsters as a string and cast into int array.
           String[] NgSTR = StdIn.readLine().split(" ");
           int[] Ng = new int[Integer.parseInt(nr_of_monsters_str[0])];
           for (int j = 0; j < Ng.length; j++)
                Ng[j] = Integer.parseInt(NgSTR[j]);
            
            // Sort the army.
            Arrays.sort(Ng);


            // MechaGodzilla´s army:
           
           // Create int array of size of army, read in monsters as a string and cast into int array.
           String[] NmSTR = StdIn.readLine().split(" ");
           int[] Nm = new int[Integer.parseInt(nr_of_monsters_str[1])];
           for (int j = 0; j < Nm.length; j++)
                Nm[j] = Integer.parseInt(NmSTR[j]);
            
            // Sort the army.    
            Arrays.sort(Nm);

            
            int Mechaweakest = Nm.length-1; 
            int Godzillaweakest = Ng.length-1;

            // The "Battle-loop", pointer gets incremented everytime a monster is slain.
            while (Mechaweakest >= 0 && Godzillaweakest >= 0){

                if (Nm[Mechaweakest] < Ng[Godzillaweakest])
                    Mechaweakest--;
                else if (Ng[Godzillaweakest] < Nm[Mechaweakest])
                    Godzillaweakest--;
                else
                    Mechaweakest--;
            }

            // Print result.
            if (Mechaweakest > Godzillaweakest)
            StdOut.println("MechaGodzilla");
            else if (Mechaweakest < Godzillaweakest)
            StdOut.println("Godzilla");
            else StdOut.println("uncertain");}
       
    }
    
}
