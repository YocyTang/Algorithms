public class Solution{
	public double findMid(int[] nums1, int[] nums2){
		int n = nums1.length;
		int m = nums2.length;
		int[] res = new int[m+n];
		int i = 0;
		int j = 0;
		for(int k = 0; k < i+j; k++){
			if(i>=n){
				res[k] = nums2[j++];
			}else if(j>=m){
				res[k] = nums1[i++];
			}else if(nums1[i] <nums2[j]){
				res[k] = nums1[i++];
			}else {
				res[k] = nums2[j++];
			}
		}
		int mid = (m+n-1)/2;
		double result = 0.0;
		if((m+n)%2 == 0){
			result = (res[mid]+res[mid+1])/2.0;
		}else {
			result = res[mid];
		}

		return result;
	}
}