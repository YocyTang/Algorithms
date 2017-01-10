public class letcode20{
	public boolean validParentheses(String s){
		Stack<Character> stackA = new Stack<Character>();
		int n = s.length();
		for(int i = 0; i< n; i++){
			char c = s.charAt(i);
			if(c=='{'|| c == '(' || c== '['){
				stackA.push(c);
			}else {
				if(stackA.empty()){
					return false;
				}
				char top = stackA.pop();
				if(s.charAt(i)==')'&&top!='('){
					return false;
				}else if(s.charAt(i)==']'&&top!='['){
					return false;
				}else if(s.charAt(i)=='}'&& top!='{'){
					return false;
				}
			}
		}
		return stackA.empty();
	}
}