public class CountBit{
	//计算整数二进制1的个数
	public int solution1(int n){
		int count = 0;
		int helper = 1;
		while(helper){
			if(n&helper){
				count++;
			}
			helper=helper<<1;
		}
		return count;
	}
}