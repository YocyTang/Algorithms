public class Pascal{
	public List<List<Integer>> solution(int nums){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(nums <=0){
			return res;
		}
		List<Integer> tmp = new ArrayList<Integer>();
		tmp.add(1);
		for(int i = 2; i<= nums; i++){
			List<Integer> cur = new ArrayList<Integer>();
			cur.add(1);
			for(int j = 0; j < tmp.size()-1; j++){
				cur.add(tmp.get(j)+tmp.get(j+1));
			}
			cur.add(1);
			res.add(cur);
			tmp = cur;
		}
		return res;
	}
}