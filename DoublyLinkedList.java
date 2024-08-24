
public class DoublyLinkedList {

	
		Node head;
		Node tail;
		
		public DoublyLinkedList() {
			head = null;
			tail = null;
		}
	public void insert(String name) {
		Node n = new Node(name);
		
		//sets head and tail equal to node if they are both null
		if (head == null && tail == null) {
			head = n;
			tail = n;
			n.next = null;
			n.prev = null;
			return;
		}
		//checks if it goes before head
		if (n.name.compareTo(head.name)<0) {
			addFront(n);
			return;
		}
		//compares to the last node
		 if (n.name.compareTo(tail.name)>0) {
			addEnd(n);
			return;
		}
		// compares the string to the next string
		Node current = head;
		while (current.next != null) {
			if (n.name.compareTo(current.next.name)<0) {
				current.next.prev = n;
				n.next = current.next;
				n.prev = current;
				current.next=n;
				return;
			}
			current=current.next;
		}
	
	}
	// make previous reference behind the removed one and next reference the next next one
	public void remove(String name) {
		
		if (head == null && tail == null) return;
		
		Node current = head;
		
		
		
		
		//special case removing from the front
		if(head.name.equals(name)) {
			//special case for 1 element
			if (head == tail) {
				head = null;
				tail = null;
				return;
			}
			head = current.next;
			current.next.prev = null;
			current = head;
			return;
		}
		//special case removing from the back
		if (tail.name.equals(name)) {
			current = tail;
			tail = current.prev;
			current.prev.next= null;
			current.next = null;
			return;
		}
		while (current.next != null) {
			if (current.name.equals(name)) {
				current.next.prev = current.prev;
				current.prev.next = current.next;
				return;
			}
			
				current = current.next;
		}
		}
	
		
	
	//searches from beginning to end as if it were a single list
	
	public Node find(String search) {
		
		if (head == null) return null;
		
		Node current = head;
		
		while (current !=null) {
			if (current.name.equals(search)) return current;
		
			
	current = current.next;
		}
		return null;
	}
	// returns the first thing (head)  
	public Node getFirst() {
		return head;
	}
	//returns the last thing(tail)
	public Node getLast() {
		return tail;
	}
	// same as the single linked list since it is going in one direction
	public void print() {
		if (head == null)return;
		Node current = head;
		
		while (current != null) {
			System.out.println(current.name);
			current = current.next;
		}
	}
	// starts from the back and references previous nodes by using current.prev 
	public void printReverse() {
		if (tail == null) return;
		
		Node current = tail;
		
		while (current != null) {
		
		System.out.println(current.name);
		current = current.prev;
		}
	
	}
	//add to the front and back to make certain cases easier
	public void addFront(Node n) {
		if (head != null) {
		n.next = head;
		n.prev = null;
		head.prev = n;
		head = n;
		}
	}
	public void addEnd(Node n) {
		tail.next = n;
		n.prev = tail;
		tail = n;
		n.next = null;
		return;
		
		
		
		
		
	}
	}
//current.prev.next = curr.next
//current.next.prev = current.prev
