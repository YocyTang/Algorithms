public class Letcode_7{
	public int reverseInt(int x){
		int deg = 0;
		double ret = 0;
		int n = x;
		while(n!=0){
			deg=n%10;
			ret = ret*10+deg;
			n=n/10;
		}
		if(ret >Integer.MAX_VALUE || ret< Integer.MIN_VALUE){
			return 0;
		}else{
			return (int) ret;
		}
	}
}