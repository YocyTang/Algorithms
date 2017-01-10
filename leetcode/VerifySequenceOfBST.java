public class VerifySequenceOfBST{
	//后序遍历是否为二叉搜索树
	public boolean verify(int[] order){
		if(order == null || order.length == 0){
			return false;
		}
		int end = order.length-1;
		return verify(order, 0, end);
	}
	private boolean verify(int[] order,int start, int end){
		int root = order[end],
			index = start;
		while(index<end+1){
			if(order[index] > root)
				break;
			index++;
		}
		for(int i = index; i< end+1; i++){
			if(order[index] <root){
				return false;
			}
		}
		boolean left  = true;
		if(index > 0){
			left = verify(oder, start,index-1);
		}
		boolean right = true;
		if(index <end){
			right = verify(order, index, end);
		}
		return left&&right;
	}
}