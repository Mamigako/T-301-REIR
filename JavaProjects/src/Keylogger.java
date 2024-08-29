import edu.princeton.cs.algs4.StdIn;

public class Keylogger {
    
    public static void main(String[] args) {
        
        // Read in string and split into String array.
        String[] line = StdIn.readLine().split("");

        // Initialize nodes and DLL with pos as tail.
        DLL_Node head = new DLL_Node(null);
        DLL_Node tail = new DLL_Node(null);
        DLL list = new DLL(head, tail, tail); 
        

        // Loop through String Arr and determine whether to add character to DLL or move pos/remove node.
        for (int i = 0; i < line.length; i++) {
            if (line[i].equals("L") || line[i].equals("R"))
                list.movePos(line[i]);

            else if (line[i].equals("B"))
                list.removePos(line[i]);
            
            else {
                DLL_Node node = new DLL_Node(line[i]);
                list.addNode(node);
            }
        }
    
        // Print result.
        list.printList();
    
    }
}