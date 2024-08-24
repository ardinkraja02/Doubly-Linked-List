

/*
Your Name: Ardin Kraja
Pace Email: AK55233p@pace.edu
Write a few sentences about some of the special cases and considerations you had
when working on the insert and remove methods.
I needed to consider whether or not the list was empty on insert. I also needed
to make cases where it could insert before head or after tail if needed. Then 
I created the regular case where it goes through the list comparing strings. 
For remove I needed to make two special cases of removing from the front and the back. 
Then I was able to make my normal loop with string comparisons.
*/


public class main {

	
		public static void main (String [] args) {
			
			DoublyLinkedList list = new DoublyLinkedList();
			
			list.insert("Beta");
			list.insert("Alpha");
			list.insert("Charlie");
			list.insert("Echo");
			list.insert("Delta");
			list.remove("*Put whatever you want here");
			list.print();
			System.out.println();
			
			list.printReverse();
			
		}
}
