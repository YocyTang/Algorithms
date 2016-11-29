public class FindNumberWithSumSequence{
	public List<List<Integer>> find(int target){
		List<List<Integer> res = new ArrayList<List<Integer>>();
		List<Integer> tmp = new ArrayList<Integer>();
		tmp.add(0);
		tmp.add(1);
		int sum = 1;
		int small = 0;
		int big = 1;
		while(small< target/2+1){
			if(sum == target){
				res.add(new ArrayList<Integer>(tmp));
			}
			while(sum< target && small<target/2+1){
				sum -=tmp.get(small);
				tmp.remove(small);
				small++;
				if(sum == target){
					res.add(new ArrayList<Integer>(tmp));
				}
			}
			big++;
			sum +=big;
			tmp.add(small[big]);
		}
		return res;
		for(int i = 0; i<target/2+1; i++){
			if(tmp.get(i))
		}
	}
}