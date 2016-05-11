public class BST<Key extends Comparable<Key>, Value> {
	private Node root;
	private class Node{
		private Key key;
		private Value val;
		private Node left, right;
		private int N;
		public Node(Key key, Value val, int N) {
			this.key = key;
			this.val = val;
			this.N = N;
		}
	}


	public int size() {
		return size(root);
	}
	private int size(Node x) {
		if (x == null) return 0;
		else return x.N;
	}


	public Value get(Key key) {
		return get(root, key);
	}
	private Value get(Node x, Key key) {
		if(x == null) return null;
		int cmp = key.compareTo(x.key);
		if (cmp < 0) return get(x.left, key);
		else if (cmp > 0) return get(x.right, key);
		else return x.val;
	}


	public void put(Key key, Value val) {
		put(root, key, val);
	}
	private Node put(Node x, Key key, Value val) {
		if(x == null) return new Node(key, val, 1);
		int cmp = key.compareTo(x.key);
		if(cmp > 0) x.right = put(x.right, key, val);
		else if (cmp < 0) x.left = put(x.left, key, val);
		else x.val = val;
		x.N = size(x.left) +size(x.right) + 1;
		return x;
	}


	public Key min() {
		return min(root).key;
	}
	private Node min(Node x) {
		if(x.left == null) return x;
		return min(x.left);
	}


	public Key max() {
		return max(root).key;
	}
	private Node max(Node x) {
		if(x.right == null) return x;
		return max(x.right);
	}


	public Key floor(Key key) {
		Node x = floor(root, key);
		if(x == null) return null;
		return x.key;
	}
	private Node floor(Node x, Key key) {
		if(x == null) return null;
		int cmp = key.compareTo(x.key);
		if(cmp == 0) return x;
		if (cmp < 0) return floor(x.left, key);
		Node t = floor(x.right, key);
		if(t != null) return t;
		else return x;
	}


	public void deleteMin() {
		root = deleteMin(root);
	}
	private Node deleteMin(Node x) {
		if(x.left == null) return x.right;
		x.left = deleteMin(x.left);
		x.N = size(x.left) + size(x.right) +1;
		return x;
	}


	public void delete(Key key) {
		root = delete(root, key);
	}
	private Node delete(Node x, Key key) {
		if (x == null ) return null;
		int cmp = key.compareTo(x.key);
		if (cmp > 0) x.right = delete(x.right, key);
		else if (cmp < 0) x.left = delete(x.left, key);
		else {
			if(x.right == null) return x.left;
			if(x.left == null) return x.right;
			Node t = x;
			x = min(t.right);
			x.right = deleteMin(t.right);
			x.left = left;
		}
		x.N = size(x.left) + size(x.right) +1;
		return x;
	}


	public int height() {
		private count = 0;
		return height(root);
	}
	private int height(Node x) {
		if(x == null) return count;
		if(x.left == null) {
			count++;
			return height(x.right);
		}
		if(x.right == null) {
			count++;
			return height(x.left);
		}
		left = height(x.left);
		right = height(x.right);
		count = Math.max(left, right);
	}
}