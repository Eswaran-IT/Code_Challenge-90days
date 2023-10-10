package day_5;


class Node{
	Object data;
	Node next;
}

public class LinkedListO<T> {
      Node head;


	void insertFront(T value) {
		Node node=new Node();
		node.data=value;
		node.next=null;
		if(head==null) {
			head=node;
		}
		else {
			Node tempNode=head;
		    head=node;
		    head.next=tempNode;
		    System.out.println("Inserted Suceesfully");
		}
	}
public	void insertEnd(T  value) {
		Node node=new Node();
		node.data=value;
		node.next=null;
		if (head==null) {
			head=node;
		} else {
           Node temp=head;
           while (temp.next!=null) {
			temp=temp.next;
		}
           temp.next=node;
           System.out.println("Sucessfully inserted");
		}
	}
  public void merger(LinkedListO<T> list) {
	   {
		   Node node=new Node();
		   node=list.head;
		   if (this.head==null) {
			head.next=node;
		} else {
			Node tempNode=new Node();
			while (tempNode.next!=null) {
				tempNode=tempNode.next;
			}
			tempNode.next=node;
			System.out.println("Sucessfully merged!!");

		}
		   
	   }
   }
  public void display() {
	  Node dispNode=new Node();
	  dispNode=this.head;
	  if (this.head==null) {
		System.out.println("No Data Found!!");
	} else {
		while (dispNode!=null) {
			System.out.println(dispNode.data);
			dispNode=dispNode.next;
		}
		

	}
  }
   
    public void sizer() {
	   int count=0;
	   if (this.head==null) {
		   System.out.println("Oops!!,Not enough data to find length!! ");
		
	} else {
		Node tempNode=this.head;
		while (tempNode!=null) {
			System.out.println(tempNode.data);
			tempNode=tempNode.next;
			count++;
		}
		System.out.println("Size is "+count);

	}
   }
   public  void deleteFront() {
    	if (head==null) {
			System.out.println("No data Found");
		} else {
       head=head.next;
       System.out.println("Data Deleted:");
		
		}
		}
    	
   public void deleteEnd() {
	    if (head == null) {
	        System.out.println("No data Found");
	    } else if (head.next == null) {
	        head = null;
	        System.out.println("Successfully deleted the only element");
	    } else {
	        Node actNode = null;
	        Node tempNode = head;
	        while (tempNode.next != null) {
	            actNode = tempNode;
	            tempNode = tempNode.next;
	        }
	        actNode.next = null;
	        System.out.println("Successfully deleted " + tempNode.data);
	    }
	

    	 
    	 
     }
     
     public static void main(String[] args) {
		System.out.println("LinkedList Operations");
	   LinkedListO<Integer> l1=new LinkedListO<>();
	   LinkedListO<Integer> l3=new LinkedListO<Integer>();
	   LinkedListO<String> l2=new LinkedListO<String>();
	   l1.insertFront(12);
	   l1.insertEnd(234);
	   l1.display();
	   l2.insertFront("Hello");
	   l2.insertEnd("Prasad");
	   l2.display();
	   l1.sizer();
	   l2.sizer();
	   l1.deleteEnd();
	   l2.deleteFront();
	   l3.insertFront(25);
	   l3.insertFront(55);
	   l1.merger(l3);
	   l3.display();
	   l3.sizer();
	   
     }
}
	 
     


