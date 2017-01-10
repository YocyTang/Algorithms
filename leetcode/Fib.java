public class Fib{
	public int fibonacci(int n){
		return fibonacci(1, 0, n);
	}
	private int fibonacci(int a, int b, int count){
		if(count == 0){
			return b;
		}
		return fibonacci(a+b, a, count-1);
	}
}