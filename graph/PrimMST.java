public class PrimMST{
	private Edge[] edgeTo;
	private double[] disTo;
	private boolean[] marked;
	private IndexMinPQ<Double> pq;
	public PrimMST(EdgeweightGraph G){
		edgeTo = new Edge[G.V()];
		disTo = new double[G.V()];
		marked = new boolean[G.V()];
		for(int v = 0; v < G.V(); v++)
			disTo[v] = Double.POSITIVE_INFINITY;
		pq = new IndexMinPQ<Double>(G.V());

		disTo[0] = 0.0;
		pq.insert(0, 0.0);
		while(!pq.isEmpty()){
			visit(G, pq.delMin());
		}
	}
	private void visit(EdgeweightGraph G, int v){
		marked[v] = true;
		for(Edge e: G.adj(v)){
			int w = e.other(v);
			if(marked[w]) continue;
			if(e.weight() < disTo[w]){
				edgeTo[w] = w;
				disTo[w] = e.weight();
				if(pq.contains(w)) pq.change(w, disTo[w]);
				else pq.insert(w, disTo[w]);
			}
		}
	}
	
}