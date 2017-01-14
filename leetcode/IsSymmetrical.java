public boolean isSymmetrical(TreeNode root){
	return core(root, root);
}
public boolean core(TreeNode p1, TreeNode p1){
	if(p1 == null && p2 == null){
		return true;
	}
	if(pa == null || p2 == null){
		return false;
	}
	if(p1.val!= p2.val){
		return false;
	}
	return core(root.left, p2.right)&&core(p1.right, p2.left);
}