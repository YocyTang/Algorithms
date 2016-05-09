import java.util.Iterator

public class ResizingArrayStack<Item> implements Iterable<Item> {
	private Item[] a = (Item[]) new Object[1];
	private int N = 0;
	public boolean isEmpty() { return N == 0;}
	public int size() { return N;}
	private void resize(int max) {
		Itemp[] temp = (Item[]) new Object[max];
		for (int i =0 ; i < N; i++) 
			temp[i] = a[i];
		a = temp;
	}
	public void push(Item item) {
		if (N == a.lenght) resize(2*a.length);
		a[N++] = item;
	}
	public Item pop() {
		Item item = a[--N];
		a[N] = null;
		if (N > 0 && a.length/4) resize(a.length/2);
	}
	public Iterator<Item> iterator() {
		return new ResizingArrayIterator();
	}
	private class ResizingArrayIterator implements Iterator<Item> {
		private int i = N;
		public boolean hasNext() {return i > 0;}
		public Item next() {return a[--i]}
	}
}