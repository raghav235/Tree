package linkedListReversal;

public class LinkedListReversalMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Node start= new Node(10);
		start.next=new Node(20);
		start.next.next=new Node(30);
		start.next.next.next=new Node(40);
		System.out.print("Before Reversal : ");
		printList(start);
		System.out.print("After Reversal  : ");
		Node reverseStartNode=reverseLinkedList(start);
		printList(reverseStartNode);
	}
	
	public static Node reverseLinkedList(Node start){
		Node t1=null,t2=null;
		while(start!=null){
			t2=start.next;
			start.next=t1;
			t1=start;
			start=t2;
		}
		return t1;
	}
	
	public static void printList(Node start){
		while(start!=null){
		System.out.print("   "+start.data);
		start=start.next;
		}
		System.out.println();
	}

}
