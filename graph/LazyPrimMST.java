public class LazyPrimMST{
	private boolean[] marked;
	private Queue<Edge> mst;
	private MinPQ<Edge> pq;
	public LazyPrimMST(EdgeWeightGraph G){
		pq = new MinPQ<Edge>();
		marked = new boolean[G.V()];
		mst = new Queue<Edge>();
		visit(G, 0);
		while(!pq.isEmpty()){
			Edge e = pq.delMin();
			int v = e.ether(), w = e.other(v);
			if(marked[v]&&marked[w]) continue;
			mst.enqueue(e);
			if(!marked[v]) visit(G, v);
			if(!marked[w]) visit(G, w);
		}
	}
	private void visit(EdgeWeightGraph G, int v){
		marked[v]= true;
		for(Edge e: G.adj(v))
			if(!marked[e.other(v)]) pq.insert(e);
	}
	public Tterable<Edge> edges(){
		return mst;
	}
}