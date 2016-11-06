public class Solution{
	public int sumRootLeaf(TreeNode root){
		if(root == null){
			return 0;
		}
		return help(root, 0, 0);
	}
	private int help(TreeNode root, int num, int sum){
		if(root == null){
			return sum;
		}
		num = 10*num + root.val;
		if(root.left == null && root.right == null){
			sum += num;
			return sum;
		}
		return help(root.left, num, sum) + help(root.right, num, sum);
	}
}