public class Solution{
	public int atoi(String str){
		str = str.trim();
		if(str == null || str.length()== 0){
			return 0;
		}
		int n = str.length();
		char key = '+';
		int i=0;
		if(str.charAt(0) == '-'){
			key = '-';
			i++;
		}else if(str.charAt(0) =='+'){
			i++;
		}
		double res = 0;
		while(i<n&& str.charAt(i)<='9'&&str.charAt(i)>='0'){
			res = res*10+(str.charAt(i) -'0');
			i++;
		}
		if(key='-'){
			res = -res;
		}
		if(res>Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		}else if(res<Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		return (int) res;

	}
}