public class PascalII{
	public List<List<Integer>> solution(int nums){
		Lis<List<Integer>> res = new ArrayList<List<Integer>>();
		if(nums <=0){
			return res;
		}
		res.add(1);
		for(int i = 1; i<= nums; i++){
			for(int j = res.size()-2; j>=0; j--){
				res.set(j+1, res.get(j)+res.get(j+1));
			}
			res.add(1);

		}
		return res;
	}
}