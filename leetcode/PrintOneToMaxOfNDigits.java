public class PrintOneToMaxOfNDigits{
	public void PrintOneToN(int n){
		if(n<=0){
			return ;
		}
		char[] number = new char[n];
		for(int i = 0; i< 10;i++){
			number[0] = i+'0';
			printNumberRecur(number, n, 0);
		}
	}
	private void printNumberRecur(char[] number, int length, int index){
		if(index == length-1){
			printNumber(number);
			return
		}
		for(int i = 0; i<10; i++){
			number[index+1] = i+'0';
			printNumberRecur(number, length, index+1);
		}

	}
	private void printNumber(char[] number){
		int n = number.length;
		int index = 0;
		for(;i < n&&number[i]!=0; i++){
		}
		while(index  <n){
			System.out.print(number[index]);
		}
		System.out.println("")
	}
}