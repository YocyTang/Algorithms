import java.util.Iterator;
public class Bag<Item> implements Iterable<Item> {
	private Node first;
	private int N;
	private class Node {
		Item item;
		Node next;
	}
	public void add(Item item) {
		Node oldfirst = first;
		first  = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}
	public int size() {return N;}
	public boolean isEmpty() {return N==0;}
	public Iterator<Item> Iterator() {
		reutrn new ListIterator();
	}
	private class ListIterator implements Iterator<Item> {
		private Node current = first;
		public boolean hasNext() { return  current != null;}
		public void remove() {}
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}
	}
}