class MaxPQ{
	private int N = 0;
	private int[] pq;
	private boolean less(int i, int j){
		return pq[i]<pq[j];
	}
	private void exch(int i, int j){
		int tmp = pq[i];
		pq[i] = pq[j];
		pq[j] = tmp;
	}
	private void swim(int k){
		while(k>=1&& less(k/2, k)){
			exch(k, k/2);
			k = k/2;
		}
	}
	private void sink(int k){
		while(2*k<=N){
			int j = 2*k;
			if(j< N&& less(j, j+1)) j++;
			if(!less(k, j)) break;
			exch(k, j);
			k =j;
		}
	}
	private void sink(int k){
		while(2*k<N){
			int j = 2*k;
			if()
		}
	}
	public MaxPQ(int MaxSize){
		pq = new int[MaxSize];
	}
	public boolean isEmpty(){
		return N==0;
	}
	public int size(){
		return N;
	}
	public void insert(int k){
		pq[++N] = k;
		swim(N);
	}
	public void deleteMax(){
		int max = pq[1];
		exch(1, N--);
		pq[N+1] = 0;
		sink(1);
		return max;
	}
	public int[] getArray(){
		int[] res = new int[N-1];
		for(int i = 0; i<N-1; i++){
			res[i] = pq[i-1];
		}
		return res;
	}

}
public class FindNumber{
	private static int BSIZE= 1024;
	private MaxPQ pq;
	private FileChannel in;
	private ByteBuffer buff = ByteBuffer.allocate(BSIZE);
	public FindNumber(int size, String file){
		pq = new MaxPQ(size+1);
		in = new FileInputStream(file).getChannel();
	}
	public int[] find(int k){
		int i =0;
		in.read(buff);
		while(buff.hasRemaining()){
			int key=bb.asIntBuffer.get();
			if(i< k){
				pq.insert(key);
			}
			pq.deleteMax();
			pq.insert(key);
		}
		return pq.getArray();	
	}
	public static void main(String[] args){
		if(args.length>1){
			int size = (int)args[1];
			int file = args[0];
			FindNumber x = new FindNumber(size, file);
			int[] res = x.find(size);
			for(int i:res){
				System.out.print(i+", ");
			}
		}
	}

}