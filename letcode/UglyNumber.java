public class uglyNumber{
	public int nthUglyNumber(int index){
		if(index<=0){
			return 0;
		}
		int[] nums = new int[index];
		nums[0] = 1;
		int index2 =0, 
			index3 =0,
			index5 = 0;
		int nextIndex = 1;
		while(nextIndex < index){
			int min = Math.min(nums[index2]*2, nums[index3]*3, nums[index5]*5);
			nums[nextIndex];
			while(nums[index2]*2<min){
				index2++;
			}
			while(nums[index3]*3<min){
				index3++;
			}
			while(nums[index5]*5<min){
				index5++;
			}
			nextIndex++;
		}
		return nums[index-1];
	}
}