//动态规划之切钢条
//求最大收益
public class CutSteel {
	public static List<Integer> cut(int[] price, int len){
		int n = price.length;
		int[] dp = new int[len+1];
		int[] first = new int[len+1];
		for(int i = 1; i<= len; i++){
			int q = -1;
			for(int j = 1; j<=i; j++){
				int tmp = dp[i-j]+price[j];
				if(q<tmp){
					q = tmp;
					first[i] = j;
				}
			}
			dp[i] = q;
			
		}	
		List<Integer> res= findPath(first);
		return res;
		
	}
	public static List<Integer> findPath(int[] first){
		List<Integer> res = new ArrayList<Integer>();
		int n = first.length-1;
		while(n>0){
			res.add(first[n]);
			n = n-first[n];
		}
		
		return res;
	}
	public static void main(String[] args){
		int[] p= {0, 1,5,8,9,10,17,17,20,24,30};
		List<Integer> res = cut(p, 7);
		for(int x: res){
			System.out.print(x+", ");
		}
	}
}