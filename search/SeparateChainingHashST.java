public class SeparateChainingHashST<Key, Value> {
	private int N;
	private int M;
	private SequentialSearchST<Key, Value>[] st;
	public SequentialSearchST() {
		this(997);
	}
	public SequentialSearchST(int M) {
		this.M = M;
		st = (SequentialSearchST<Key, Value)[]) new SequentialSearchST[M];
		for(int i = 0; i < m; i++)
			st[i] = new SequentialSearchST();
	}
	private int hash(Key key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}
	public Value get(Key key) {
		return (Value) st[hash(key)].get(key);
	}
	public void put(Key key, Value val) {
		st[hash(key)].put(key, val);
	}
}