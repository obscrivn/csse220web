package linked01;


/**
 * LinkedList object
 * Stores:
 * - head → reference to the first node
 *
 * Node object
 * Stores:
 * - value → data inside the node
 * - next → reference to the next node
 */
public class LinkedList {
	// head points to the first node in the list.
    // If head is null, the list is empty.
	private Node head;
	
	public LinkedList() {
		// TODO 1: Start with a null head because the list is empty.
		
	}
	

	
	public void addAtBeginning(int value) {
		
		// TODO 2: Create a new node. The new node stores value and points to the OLD head.
		
		
		// TODO 3: Move head so it points to the NEW first node.
        

    }
	
	/**
	 * Counts how many nodes exist in the list.
	 */
	public int size() {

	    // TODO 12 calculate the list size: 
		
		// Start count at 0.
		
	    // Start current at the FIRST node.
	  
	    // (begin while loop) Keep walking until current becomes null.
	   
	        // Count this node.
	      
	        // Move current to the next node.
	   // end while loop
		// Return the total number of nodes.
	    return 0;
	}
	
	public String toString() {
		// Start at the head.
	    // head always stores where the list begins.
        Node current = this.head;
        String result ="head->";
     // Keep walking through the list
        // until current node reaches null (the end).
        while(current!=null) {
        // Add the current node's value.
          result+= current.value;
          result+="->";
          // Move current forward to the next node.
          current=current.next;
        }
        // The last node points to null.
        result+="null";
        return result;
      }
	
	/**
	 * Removes the FIRST node from the list.
	 */
	public void deleteFirst() {

	    // TODO 8: Check if the list is already empty.


	    // TODO 9: Move head to the next node.
	    // The old first node is removed from the list.

	}
	

	/**
	 * Node class stores:
	 * - value → data stored in this node
	 * - next → reference to ANOTHER Node object
	 *
	 * Why is next type Node?
	 * Because each node connects to another node in the chain.
	 */
	private class Node {
		int value;
		Node next;

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	
	public static void main(String[] args) {
		// TODO 4: Create a new empty LinkedList.
	
		
		// TODO 5: Add 3 at the beginning.
	
	    
	    // TODO 6: Add 5 at the beginning.

	    
	 // TODO 7: Print the list.
		
		
		 // TODO 10: Delete the first node.

	 // TODO 11: Print the list again.

	    // TODO 13: Print the size.

	}
	
}	
	
	
	


