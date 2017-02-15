public class SubTree{
	public boolean isSubTree(TreeNode root1, TreeNode root2){
		boolean res = false;
		if(root1!=null && root2 != null){
			if(root1.val == root2.val){
				res = isSubTreeHelper(root1, root2);
			}
			if(!res){
				isSubTree(root1.left, root2);
			}
			if(!res){
				isSubTree(root1.right, root2);
			}
		}
		return res;
	}
	private boolean isSubTreeHelper(TreeNode root1, TreeNode root2){
		if(root2 == null){
			return true;
		}
		if(root1 == null){
			return false;
		}
		if(root1.val!=root2.val){
			return false;
		}
		return isSubTreeHelper(root1.left, root2.left) &&
		isSubTreeHelper(root1.right, root2.right);
	}
}