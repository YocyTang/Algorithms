public class Topological{
	private Iterable<Interger> order;
	public Topological(Digraph G) {
		DirectedCycle cyclefinder = new DirectedCycle(G);
		if(!cyclefinder.hasCycle()){
			DepthFirstOrder dfs = new DepthFirstOrder(G);
			order = des.reversePost();
		}
	}
	public Iterable<Interger> order(){
		return order;
	}
	public boolean isDAG(){
		return order!= null;
	}
	public static void main(String[] args){
		String filename = args[0];
		String separator = args[1];
		SymbolDigraph = new SymbolDigraph(filename, separator);
		Topological top = new Topological(sg.G);
		for(int v: top.order())
			StdOut.println(sg.name(v));
	}
}