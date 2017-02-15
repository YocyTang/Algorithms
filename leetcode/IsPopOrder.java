public boolean  isPopOrder(int[] push, int[] pop){
	if(push == null || pop == null){
		return false;
	}
	int n = push.length;
	LinkedList<Integer> stack = new LinkedList<Integer>();
	int popIndex = 0;
	for(int pushIndex = 0; pushIndex< n; i++){
		stack.addFirst(push[pushIndex]);
		while(!stack.isEmpty() && stack.getFirst() == pop[j]){
			stack.pop();
			j++;
		
		}
	}
	if(stack.isEmpty()){
		return true;
	}else{
		return false;
	}
}