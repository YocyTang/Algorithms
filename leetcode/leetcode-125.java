public class Solution{
	public boolean isPalindrome(String s){
		if(s.length()== 0){
			return true;
		}
		s = s.toUpperCase();
		int lo = 0, hi = s.length()-1;
		int low1 = 'A', high1 = 'Z';
		int low2 = '0', high2 = '9';
		while(lo<hi){
			if((s.charAt(lo)<low1|| s.charAt(lo)>high1)&&
				(s.charAt(lo)<low2|| s.charAt(lo)>high2)){
					lo++;
					continue;
			}
			if((s.charAt(hi)<low1|| s.charAt(hi)>high1)&&
				(s.charAt(hi)<low2|| s.charAt(hi)>high2)){
					hi--;
				continue;
			}
			if(s.charAt(lo) == s.charAt(hi)){
				lo++;
				hi--;
			}else{
				return false;
			}
		}
		return true;
	}
}