import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Vindhradi {

    public static void main(String[] args) {
        
        float input_speed = StdIn.readFloat();

        if (input_speed <= 0.2f) {
            StdOut.print("Logn");

        }
        else if (input_speed >= 0.3f && input_speed <= 1.5f) {
            StdOut.print("Andvari");
        }

        else if (input_speed >= 1.6f && input_speed <= 3.3f) {
            StdOut.print("Kul");
    
        }

        else if (input_speed >= 3.4f && input_speed <= 5.4f) {
            StdOut.print("Gola");

        }

        else if (input_speed >= 5.5f && input_speed <= 7.9f) {
            StdOut.print("Stinningsgola");

        }

        else if (input_speed >= 8.0f && input_speed <= 10.7f) {
            StdOut.print("Kaldi");

        }

        else if (input_speed >= 10.8f && input_speed <= 13.8f) {
            StdOut.print("Stinningskaldi");

        }

        else if (input_speed >= 13.9f && input_speed <= 17.1f) {
            StdOut.print("Allhvass Vindur");

        }

        else if (input_speed >= 17.2f && input_speed <= 20.7f) {
            StdOut.print("Hvassvidri");

        }

        else if (input_speed >= 20.8f && input_speed <= 24.4f) {
            StdOut.print("Stormur");

        }

        else if (input_speed >= 24.5f && input_speed <= 28.4f) {
            StdOut.print("Rok");

        }

        else if (input_speed >= 28.5f && input_speed <= 32.6f) {
            StdOut.print("Ofsavedur");

        }

        else if (input_speed >= 32.7f) {
            StdOut.print("Farvidri");

        }

        } 
    }
    

