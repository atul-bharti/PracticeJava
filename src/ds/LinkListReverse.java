package ds;

import java.util.ArrayList;
import java.util.List;

public class LinkListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<Integer>();
		MyLinkedList l1 = new MyLinkedList(1);
		MyLinkedList l2 = new MyLinkedList(2);
		MyLinkedList l3 = new MyLinkedList(3);
		MyLinkedList l4 = new MyLinkedList(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;
		//print(l1);
		MyLinkedList l5 = reverse1(l1);
		
		print(l5);
		

	}
	static void reverse(MyLinkedList<Integer> link){
		if(link.next == null )
			return;
		MyLinkedList<Integer> prev = link;
		MyLinkedList<Integer> nextLink = link.next;
		reverse(nextLink);
		
		nextLink.next = prev;
		if(prev.data.equals(1))
			prev.next = null;
		
		
		
	}
	static MyLinkedList<Integer> reverse1(MyLinkedList<Integer> link){
		MyLinkedList<Integer> prev = null;
		MyLinkedList<Integer> nextLink ;
		while(link != null ) {
			nextLink = link.next;
			link.next = prev;
			prev = link;
			link = nextLink;
		}
		return prev;
		
	}
	static void print(MyLinkedList link) {
		if(link == null)
			return;
		System.out.println(link.data);
		print(link.next);
	}

}

class MyLinkedList<T>{
	T data ;
	MyLinkedList<T> next;
	public MyLinkedList(T data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	@Override
	public String toString() {
		return ""+this.data;
	}
}
