//将二叉搜说是转换为双向排序链表

public TreeNode convertTree(TreeNode root){
	TreeNode tailOfList = null;
	convertTree(root, tailOfList);
	while(tailOfList!=null && tailOfList.left!=null){
		tailOfList = tailOfList.left;
	}
	return tailOfList;
}
private void convertTree(TreeNode root, TreeNode tailOfList){
	if(root == null){
		return null;

	}

	TreeNode current = root;
	if(root.left!=null){
		convertTree(root.left, tailOfList);
	}
	current.left = tailOfList;
	if(tailOfList!=null){
		tailOfList.right = current;
	}
	tailOfList = current;
	if(root.right!=null){
		convertTree(root.right, tailOfList);
	}
}