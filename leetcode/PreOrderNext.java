public TreeNode getNext(TreeNode node){
	if(node == null){
		return null;
	}
	TreeNode next = null;
	if(node.right!=null){
		TreeNode right = node.right;
		while(right.left!=null){
			right = right.left;
		}
		next = right;
	}else if(node.parent!=null){
		TreeNode parent = node.parent;
		TreeNode current = node;
		while(parent!=null&& current == parent.right){
			current = parent;
			parent = parent.parent;
		}
		next = parent;
	}
	return next;
}