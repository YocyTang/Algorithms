public class Letcode_9{
	public boolean isPalindromeNumber(int x){
		return x == reverseInt(x);
	}
	private int  reverseInt(int x){
		int n = x;
		int deg = 0;
		int res = 0;
		while(n!=0){
			deg = n%10;
			res = res*10+deg;
			n=n/10;
		}
		return res;
	}
}