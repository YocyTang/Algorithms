public class Letcode22{
	public List<String> generateParenthesis(int n){
		List<String> ret =new ArrayList<String>();
		helper(ret, "", n, n);
	}
	private void helper(List<String> ret, String s, int left, int right){
		if(left>right){
			return;
		}
		if(left == 0 && right == 0){
			ret.add(s);
			return;
		}
		if(left>0){
			helper(ret, s+"(", left-1, right);
		}
		if(right>0){
			helper(ret, s+")"+left+right-1);
		}
	}
}