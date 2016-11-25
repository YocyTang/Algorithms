public class MoreThanHalfOfNum{
	public int findNumber(int[] nums){
		int n = nums.length-1;
		int index = partition(nums, 0, n);
		while(true){
			if(index<n/2){
				index = partition(nums, 0, j-1);
			}else if(index>n/2){
				index = partition(nums, j+1, n);
			}else {
				break;
			}
		}
		return nums[index];
		
	}
	private int partition(int[] nums, int lo, int hi){
		int i = lo;
		int j = hi+1;
		int key = nums[lo];
		while(true){
			while(nums[++i]<key){
				if(i == hi){
					break;
				}
			} 
			while(nums[--j]>key){
				if(j == lo){
					break;
				}
			}
			if(i>=j){
				break;
			}
			swap(nums, i, j);
		}
		swap(nums, lo, j);
		return j;
	}
	private swap(int[] nums, int i, int j){
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
}