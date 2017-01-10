public class NumberBetween1AndN{
	public int howManyOne(int n){
		int number = 0;
		for(int i = 0; i<= n; i++){
			number+= help(n);
		}
		return number;
	}
	private int help(int n){
		int number = 0;
		while(n){
			if(n%10 == 1){
				number++;
			}
			n = n/10;
		}
		return number;
	}
}