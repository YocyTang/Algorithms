public class Solution{
	public double findMid(int[] nums1, int[] nums2){
		int len = nums1.length+nums2.length;
		if(len%2 == 1){
			return (double)findkth(nums1, 0, nums2, 0, len/2+1);
		}
		else{
			double x = (double)findkth(nums1,0, nums2, 0, len/2);
			double y = (double)findkth(nums1, 0, nums2, 0, len/2+1);
			return (x+y)/2.0;
		}
	}
	private int findkth(int[] a, int startA, int[] b, int startB, int k){
		if(startA>a.length){
			return b[startB+k-1];
		}
		if(startB>b.length){
			return b[startB+k-1];
		}
		if(k == 1){
			return Math.min(a[startA], b[startB]);
		}
		int aKey = startA+k/2-1<a.length?a[startA+k/2-1]:Integer.MAX_VALUE;
		int bKey = startB+k/2-1<b.length?b[startB+k/2-1]:Integer.MAX_VALUE;
		if(aKey< bKey){
			return findkth(a, startA+k/2, b, startB, k-k/2);
		}else{
			return findkth(a, startA, b, startB+k/2, k-k/2);
		}
	}
}