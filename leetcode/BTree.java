public class BTree<Key extends Comparable<Key>>{
	private Page root = new Page(true);
	public BTree(Key sentinel){
		add(sentinel);
	}
	public boolean contains(Key key){
		return contains(root, key);

	}
	private boolean contains(Page h, Key key){
		if(h.isExternal())
			return h.contains(key);
		return contains(h.next(key), key);
	}
	public void add(Key key){
		add(root, key);
		if(root.isFull()){
			Page leftHalf= root;
			Page rightHalf = root.split();
			root = new Page(false);
			root.add(leftHalf);
			root.add(rightHalf);
		}
	}
	public void add(Page h, Key key){
		if(h.isExternal()){
			h.add(key);
			return;
		}
		Page next = h.next(key);
		add(next, key);
		if(next.isFull())
			h.add(next.split());
		next.close();
	}
}