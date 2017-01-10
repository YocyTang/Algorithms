public class Solution{
	public int singleNumber(int nums){
		int x = 0;
		for(int a:nums){
			x = x^a;
		}
		return x;
	}
	public int singleNumber(int nums){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int n:nums){
			if(!set.add(n)){
				set.remove(n);
			}
		}
		Iterator it = set.iterator();
		return it.next();
	}
}