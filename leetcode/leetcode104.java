public class letcode104{
	public int maxDepthOfBT(TreeNode root){
		if(root == null)
			return 0;
		return depth(root, 0);
	}
	private int depth(TreeNode root, int count){
		if(root == null){
			return count;
		}
		count++;
		return Math.max(depth(root.left, count), depth(root.right, count));
	}
}