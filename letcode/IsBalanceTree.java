public class IsBalanceTree{
	public boolean isBalance(TreeNode root){
		if(root == null){
			return true;
		}
		if(root.left == null && root.right == null)
			return true;
		if(Math.abs(depth(root.left)- root.right)>1){
			return false;
		}
		return isBalance(root.left)&&isBalance(root.right);
	}
	private int depth(TreeNode root){
		if(root == null)
			return 0;
		return 1+Math.max(depth(root.left), depth(root.right));
	}
}