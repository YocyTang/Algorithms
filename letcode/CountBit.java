public class CountBit{
	//计算整数二进制1的个数
	public int solution1(int n){
		int count = 0;
		int flag= 1;
		while(flag!=Math.pow(2, 7)){
			if((flag & n) !=0){
				count++;
			}
			flag = flag<<1;
		}
		return count;
	}
	public int solution2(int n){
		int count =0;
		while(n>0){
			count++;
			n = (n-1)&n;
		}
		return count;
	}
}