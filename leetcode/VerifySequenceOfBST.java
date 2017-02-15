public class VerifySequenceOfBST{
	//后序遍历是否为二叉搜索树
	public boolean verify(int[] order){
		if(order== null || order.length == 0){
			return false;
		}
		int end= order.length;
		return core(order, 0, end);
	}
	private boolean core(int[] order, int start, int end){
		if(start == end){
			return true;
		}
		int root = order[end]; 
		int index = start;
		while(index<end+1){
			if(order[index]>root){
				break;
			}
			index++;
		}
		for(int i = index; i<= end; i++){
			if(order[i] < root){
				return false;
			}
		}
		boolean left = true;
		if(index >0){
			left = core(order, start,index-1);

		}
		boolean right = true;
		if(index<end){
			right = core(order, index, end);
		}
		return left&&end;
	}
}