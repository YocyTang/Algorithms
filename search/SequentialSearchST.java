public class SequentialSearchST<Key, Value>{
	private Node first;
	private class Node{
		Key key;
		Value val;
		Node next;
		public Node(Key key, Value val, Node next) {
			this.key = key;
			this.val = val;
			this.next = next;
		}
	}
	public Value get(Key, key) {
		for(Node x = first; x!= null; x = x.next){
			if(key.equals(x.key))
				return x.val;
		}
		return null;
	}

	public void put(Key key, Value val) {
		for(Node x= first; x != null; x = x.next) {
			if(key.equals(x.key)){
				x.val = val;
				return;
			}
		}
		first = new Node(key, val, first);
	}
	public void delete(Key key) {
		for(Node x = first; x != null; x = x.next) {
			if(Key.equals(x.key)){
				x.val = null;
				Node find = first;
				if(find.next != x){
					find = find.next;
				}
				Node another = x.next;
				x.key = null;
				find.next = another;
				return;
			}
			else 
				return;
		}
	}
}