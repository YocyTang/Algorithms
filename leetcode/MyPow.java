public class MyPow{
	public double pow(double base, int exp){
		if(doubleEqual(base, 0.0)){
			return 0.0;
		}
		int absExp = Math.abs(exp);
		int res = helper(base, absExp);
		if(exp>=0){
			return res;
		}else{
			return 1/res;
		}
	}
	private double helper(double base, int exp){
		if(exp == 0){
			return 1;
		}
		if(exp == 1){
			return base;
		}
		if(exp& 0x1 ==1){
			return base*helper(base, exp-1)
		}else{
			return helper(base, exp>>1)*helper(base, exp>>2);
		}
	}
	private boolean doubleEqual(double a, double b){
		if(Math.abs(a-b)<0.000001){
			return true;
		}
		return false;
	}
}