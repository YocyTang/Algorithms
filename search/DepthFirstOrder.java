public class DepthFirstOrder {
	private boolean marked;
	private Queue<Integer> pre;
	private Queue<Integer> post;
	private Stack<Integer> reversePost;
	public DepthFirstOrder(Digraph G){
			pre = new Queue<Integer>();
			post = new Queue<Integer>();
			reversePost = new Stack<Integer>();
			marked = new boolean[G.V()];
			for(int v = 0; v < G.V(); v++) {
				if(!marked[v]) dfs(G, v);
			}
	}
	private void dfs(Digraph G, int v) {
		pre.enqueue(v);
		marked[v] = true;
		for (int w:G.adj(v))
			if(!marked[w])
				dfs(G, w);
		post.enqueue(v);
		reversePost.push(v);
	}
	public Iterable<Integer> pre() {
		return pre;
	}
	public Iterable<Integer> post() {
		return post;
	}
	public Iterable<Integer> reversePost() {
		return reversePost;
	}
}


public class Topological{
	private Iterable<Integer> order;
	public Topological(Digraph G) {
		DirectedCycle cyclefinder = new DirectedCycle(G);
		if(!cyclefinder.hasCycle()){
			DepthFirstOrder dfs = new DepthFirstOrder(G);
			order = dfs.reversePost();
		}
	}
	public Iterable<Integer> order(){
		return order;
	}
	public boolean isDAG(){
		return order != null;
	}
	public static void main(String[] args) {
		String filename = args[0];
		String separator = args[1];
		SymbolDigraph sg = new SymbolDigraph(filename. separator);
		Topological top = new Topological(sg.G());
		for(int v: top.order())
			StdOut.println(sg.name(v));
	}
}