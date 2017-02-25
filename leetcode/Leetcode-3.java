public class Solution{
	public int maxPrefix(String s){
		if(s == null || s.length() == 0){
			return 0;
		}
		int n = s.length();
		int left = 0;
		int res = 0;
		int[] prev = new int[256];
		for(int i = 0; i<256;i++){
			prev[i] = -1;
		}
		for(int i = 0; i<n;i++){
			if(prev[s.charAt(i)]>=left){
				left=prev[s.charAt(i)]+1;
			}
			prev[s.charAt(i)] = i;
			if(res<i-left+1){
				res = i-left+1;
			}
		}
		return res;
	}
	public String maxPrefixString(String s){
		if(s == null || s.length() ==0){
			return null;
		}
		int n = s.length();
		int R[] = new int[n];
		for(int i = 0; i< n; i++){
			R[i] = -1;
		}
		int left = 0;
		int len = 0;
		int start = 0;
		int end = 0;
		for(int i = 0; i< n; i++){
			if(R[s.charAt(i)]>=left){
				left = R[s.charAt(i)]+1;
			}
			R[s.charAt(i)] = i;
			if(res<i-left+1){
				start = left;
				end = i;
			}
		}
		return s.substring(start, end+1);
	}
}