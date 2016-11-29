public class FindNumberAppearOnce{
	public int[] find(int nums){
		int n = nums.length;
		int first =  0;
		for(int i = 0; i<n;i++){
			first = first^nums[i];
		}
		int index = findIndex(first);
		int num1 = 0;
		int num2 = 0;
		for(int i = 0; i< n; i++){
			if(isBitOne(index , nums[i])){
				num1 = num1^nums[i];
			}else{
				num2 = num2^nums[i];
			}
		}
		int[] res ={num1, num2};
		return res;
	}
	private int findIndex(int target){
		int index = 0;
		int flag = 1;
		while(flag<Math.pow(2, 7)+1){
			if(flag&target!=0){
				break;
			}
			index++;
			flag = flag<<1;
		}
		return index;
	}
	private int isBitOne(int index, int num){
		return index == findIndex(num);
	}
}