public class Stack<Item> implements Iterable<Item>{
	private Node first;
	private int N;
	private class Node {
		Item item;
		Node next;
	}
	public boolean isEmpty() { return first == null;}
	public int size() {return N;}
	public void push(Item item) {
		Node oldfirst = first;
		first.item = item;
		first.next = oldfirst;
		N++;
	}
	public Item pop(){
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
} 