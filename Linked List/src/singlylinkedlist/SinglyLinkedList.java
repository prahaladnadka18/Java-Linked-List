package singlylinkedlist;

public class SinglyLinkedList {

	class Node{

		Object data;
		Node next;

		Node(Object data){
			this.data=data;
		}
		
	}
	
	Node head;

	//add method

	public void add(Object data) {
		
	Node n = new Node(data);
	
	if(head==null) {
		head=n;
		return;
	}
	
	Node t = head;
	while(t.next!=null) {
		t=t.next;
	}
	
	t.next=n;

	}
	
	//toString method
	@Override
	public String toString() {
		
		String st="";
		
		if(head==null) {
			return " ";
		}
		
		Node t=head;
		while(t!=null) {
			st=st+t.data;
			if(t.next!=null) {
				st=st+"->";
			}
			t=t.next;
		}
		return "["+st+"]";
	}

	//addFirst method
	public void addFirst(Object data) {
		
		Node n = new Node(data);
		
		n.next=head;
		head=n;
	}
	
	//deleteFirst method
	public Object deleteFirst() {
		
		if(head==null) {
			System.out.println("List is Empty!!!");
			return "";
		}
		
		Object data=head.data;
		head=head.next;
		
		return data;
		
	}

	public Object deleteLast() {
		
		if(head==null) {
			System.out.println("List is Empty!!!");
			return "";
		}
		
		Node t=head;
		Node p=head;
		while(t.next!=null) {
			p=t;
			t=t.next;
		}
		if(p==head)
			head=null;
		else 
			p.next=null;
		
		return t.data;
		
	}

	//add method to insert object at particular index
	public void add(Object data, int in) {
		
		if(in==0) {
			addFirst(data);
			return;
		}
		
		Node temp=head;
		
		while(temp!=null&&in>1) {
			temp=temp.next;
			in--;
		}
		
		if(temp==null) {
			System.out.println("Index out of range!!!");
			return;
		}
		
		Node n=new Node(data);
		n.next=temp.next;
		temp.next=n;
		
	}

	//delete method to delete object from particular index
	public Object delete(int in) {
		
		if(in==0) {
			return deleteFirst();
		}
		
		Node temp=head;
		while(temp!=null&&in>1) {
			temp=temp.next;
			in--;
		}
		
		if(temp==null||temp.next==null) {
			System.out.println("Index out of range!!!");
			return null;
		}
		
		Node n=temp.next;
		temp.next=n.next;
		
		return n.data;
		
	}

	//sumofList method
	public int sumOfList() {
		
		int sum=0;
		Node temp=head;
		
		while(temp!=null) {
			sum+=(int)temp.data;
			temp=temp.next;
		}
		
		return sum;
		
	}
	
	/*
	 
	//sumOfList method using Recursion
	public int sumOfList() {
	
		return sumOfList(head);
		
	}

	private int sumOfList(Node temp) {
		
		if(temp==null)
			return 0;
		
		return (int)temp.data+(int)sumOfList(temp.next);
	}
	
	*/

}
