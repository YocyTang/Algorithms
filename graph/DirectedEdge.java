public class DirectedEdge{
	private final int v;
	private final int w;
	private final double weight;
	public DirectedEdge(int v, int w, double weight){
		this.v = v;
		this.w = w;
		this.weight = weight;
	}
	public double weight(){
		return weight;
	}
	public int from(){
		return v;
	}
	public int to(){
		return w;
	}
	public String toString(){
		return String.format("%d->%d %.2f",v, w, weight);
	}
}

public class EdgeWeightedDigraph{
	private final int V;
	private int E;
	private Bag<DirectedEdge>[] adj;
	public EdgeWeightedDigraph(int V){
		this.V = V;
		this.E = 0;
		adj = (Bag<DirectedEdge>[]) new Bag[v];
		for(int v = 0; v<V; v++){
			adj[v] = new Bag<DirectedEdge>();
		}
	}
	public int V(){
		return V;
	};
	public int E(){
		return E;
	}
	public void addEdge(DirectedEdge e){
		adj[e.from()].add(e);
		E++;
	}
	public Iterable<DirectedEdge> adj(int v){
		return adj[v];
	}
	public Iterable<DirectedEdge> edges(){
		Bag<DirectedEdge> bag = new Bag<DirectedEdge>();
		for(int v = 0; v < V; v++){
			for(DirectedEdge e:adj[v]){
				bag.add(e);
			}
			return bag;
		}
	}
}