import edu.princeton.cs.algs4.StdOut;

public class DLL {
    
    // Doubly linked positional list, made for Keylogger assignment.
    DLL_Node head;
    DLL_Node tail;
    DLL_Node pos;

    DLL(DLL_Node head, DLL_Node tail, DLL_Node pos){
        // Construct list and its attributes.
        this.head = head;
        this.tail = tail;
        this.pos = tail;
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public void addNode(DLL_Node newNode){

        // Adds a node and updates position.
        
        if (this.head.next == this.tail){
            newNode.next = this.tail;
            newNode.prev = this.head; 
            this.tail.prev = newNode;
            this.head.next = newNode;
        } else {
            newNode.next = this.pos.next;
            newNode.prev = this.pos;
            this.pos.next.prev = newNode;
            this.pos.next = newNode;
        }
        this.pos = newNode;
    }

    public void movePos(String data){

        // Move position left or right depending on input.

        if (data.equals("L") && this.pos.prev != null)
            this.pos = this.pos.prev;
        else if (data.equals("R") && this.pos.next != null)
            this.pos = this.pos.next;
    }

    public void removePos(String data){

        // Removes node at position pos.

        if (data.equals("B") && this.pos.prev != null){
            this.pos.prev.next = this.pos.next;
            this.pos.next.prev = this.pos.prev;
            this.pos = this.pos.prev;
        }
    }

    public void printList() {

        // Print list node by node.
        if (this.head.next != this.tail) {
            pos = this.head.next;
            StringBuilder str = new StringBuilder();

            while (this.pos != this.tail) {
                str.append(pos.data);
                pos = pos.next;
            }

            StdOut.print(str.toString());
    }
    }
}