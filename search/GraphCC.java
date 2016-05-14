public class CC{
	private boolean[] marked;
	private int[] id;
	private int count;
	public CC(Graph G) {
		marked = new boolean[G.V()];
		id = new int[G.V()];
		for(int s = 0; s < G.V(); s++)
			if(!marked[s]) {
				def(G, s);
				count++;
			}
	}
	private void def(Graph G, int v) {
		marked[v] = true;
		id[v] = count;
		for(int w:G.adj(v))
			if(!marked[w])
				def(G, w);
	}
	public boolean connected(int v, int w) {
		return id[w] == id[v];
	}
	public int id(int v) {
		return id[v];
	}
	public int count() {
		return count;
	}
}