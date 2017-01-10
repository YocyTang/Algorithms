public class FindNumberWithSum{
	public int[] find(int[] data, int target){
		int n = data.length;
		int lo = 0;
		int hi = n-1;
		int[] res = new int[2];
		while(lo< hi){
			if(data[lo]+data[hi]<target){
				lo++;
			}else if(data[lo] +data[hi]>target){
				hi++;
			}else{
				res[0] = data[lo];
				res[1] =data[hi];
				return res;
			}
		}
		return res;
	}
}