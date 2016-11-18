public class letcode20{
	public boolean validParentheses(String s){
		Stack stackA = new Stack();
		int n = s.length();
		for(int i = 0; i< n; i++){
			char c = s.charAt(i);
			if(c=='{'|| c == '(' || c== '['){
				stackA.push(c);
			}else if(c == ')'){
				if(!stackA.empty()){
					if(!stackA.pop().equals('(')){
						return false;
					}
				}
				return false;
			}else if(c==']'){
				if(!stackA.empty()){
					if(!stackA.pop().equals('[')){
						return false;

					}
				}
				return false;
			}else if(c == '}'){
				if(!stackA.empty()){
					if(!stackA.pop().equals('{')){
						return false;
					}
				}
				return false;
			}
		}
		return stackA.empty();
	}
}