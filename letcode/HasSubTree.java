public boolean isSubTree(TreeNode root1, TreeNode root2){
	boolean res = false;
	if(root1!=null && root2 !=null){
		if(root1.val == root2.val){
			res = hasSubTree(root1, root2);
		}
		if(!res){
			res = hasSubTree(roo1.left, root2);
		}
		if(!res){
			res = hasSubTree(root1.right, root2);
		}
	}
	return res;
}

private boolean hasSubTree(TreeNode root1, TreeNode root2){
	if(root2 == null){
		return true;
	}
	if(roo1 == null){
		return false;
	}
	if(root1.val!= root2.val){
		return false;
	}
	return hasSubTree(root1.right, root2.right)&&hasSubTree(root1.left, root2.left);
}