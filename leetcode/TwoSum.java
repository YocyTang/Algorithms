public class TwoSum{
	
	public static int[] twoSum(int[] nums, target){
		int n = nums.length;
		int res[] = new int[2];
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i = 0; i< n; i++){
			if(map.containsKey(nums[i])){
				int index = map.get(nums[i]);
				res[0] = index;
				res[1] = i;
				return res;
			}else{
				map.put(target-nums[i], i);
			}
		}
		return res;
	}
}