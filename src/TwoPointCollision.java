import java.util.Scanner;

public class TwoPointCollision {
	 public class Node{
		 int data;
	     Node next;
	     public Node(int data) {
	    	 this.data = data;
	     }
	 }
	 public Node head = null;
	 public Node tail = null;
	 public void add(int data){
		 Node newnode = new Node(data);
		 if(head == null) {
			 head = newnode;
			 tail = newnode;
			 newnode.next = head;
		 }
		 else {
			 tail.next = newnode;
			 tail = newnode;
			 tail.next = head;
		 }
	 }
	 public void display() {
		 Node temp = head;
	     if(head == null) {
	    	 System.out.println("List is empty");
	     }
	     else {
	    	 System.out.println("Current List:");
	    	 do{
	    		 System.out.print(" "+ temp.data);
	             temp = temp.next;
	          }while(temp != head);
	          System.out.println();
	     }
	 }
	 public int computePointOfInterception(int a, int b) {
	    	Node x = head;
	    	Node y = head;
	    	 if(head == null)
	    		 System.out.println("List is empty");
	    	 else {
	    		 while(x.data !=a)
	    			 x = x.next;
	    		 while(y.data !=b)
	    			 y = y.next;
	    		 while(x.data != y.data)
	        	 {
	        		 x = x.next;
	        		 x = x.next;
	        		 y = y.next;
	        	 }
	    	 }
	    	 return y.data;
	     }
	    public static void main(String[] args) {
	        TwoPointCollision cl = new TwoPointCollision();
	        Scanner s=new Scanner(System.in);
	        System.out.print("Enter two values: ");
	        int x=s.nextInt();
	        int y=s.nextInt();
	        cl.add(1);
	        cl.add(2);
	        cl.add(3);
	        cl.add(4);
	        cl.add(5);
	        cl.add(6);
	        cl.add(7);
	        cl.add(8);
	        cl.add(9);
	        cl.add(10);
	        cl.add(11);
	        cl.add(12);
	        cl.display();
	        int ans;
	        ans = cl.computePointOfInterception(x, y);
	        System.out.println("Collided Position = "+ans);
	    }
}
