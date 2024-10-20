package singlylinkedlist;

public class MainSingleLinkedList {
	
	public static void main(String[] args) {
		
		SinglyLinkedList sl = new SinglyLinkedList();
		
		sl.add(10);
		sl.add(20);
		sl.add(30);
		sl.add(40);
		sl.add(50);
		System.out.println(sl);
		
		sl.addFirst(60);
		sl.addFirst(70);
		System.out.println(sl);
		
		System.out.println(sl.deleteFirst());
		System.out.println(sl);
		sl.deleteFirst();
		System.out.println(sl);
		
		sl.deleteLast();
		System.out.println(sl);
		System.out.println(sl.deleteLast());
		System.out.println(sl);
		
		sl.add(80,2);
		System.out.println(sl);
		sl.add(5,0);
		System.out.println(sl);
		
		sl.delete(2);
		System.out.println(sl);
		sl.delete(9);
		System.out.println(sl);
		System.out.println(sl.delete(0));
		
		System.out.println(sl.sumOfList());
		
	}

}
