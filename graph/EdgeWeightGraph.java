public class EdgeWeightGraph{
	private final int V;
	private int E;
	private Bag<Edge>[] adj;
	public EdgeWeightGraph(int V){
		this.V = V;
		this.E = E;
		adj = (Bag<Edge>[]) new Bag[V];
		for(int v= 0; v < V; v++)
			adj[v] = new Bag<Edge>();
	}
	public int V(){
		return V;
	}
	public int E(){
		return E;
	}
	public void addEdge(Edge e){
		int v = e.ether(), w = e.other(v);
		adj[v].addEdge(e);
		adj[w].addEdge(e);
		E++;
	}
	public Iterable<Edge> adj(int v){
		return adj[v];
	}
}