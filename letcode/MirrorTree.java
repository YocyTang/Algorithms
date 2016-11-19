public class MirrorTree{
	public void reverse(TreeNode root){
		if(root == null){
			return;
		}
		if(root.left==null && root.right == null){
			return;
		}

		
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		if(root.left != null){
			reverse(root.left);
		}
		if(root.right != null){
			reverse(root.right);
		}
	}
}