public List<List<Integer>> loopTreeZ(TreeNode root){
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	if(root == null){
		return res;
	}
	List<Integer> tmp = new ArrayList<Integer>();
	LinkedList<TreeNode> current  = new LinkedList<TreeNode>();
	LinkedList<TreeNode> next = new LinkedList<TreeNode>();
	current.addFirst(root);
	boolean flag = true;
	while(!current.isEmpty()){
		TreeNode node = current.removeFirst();
		tmp.add(node.val);
		if(node.left!=null&&flag){
			next.addFirst(node.left);
		}else if(node.left!=null && !flag){
			next.addLast(node.left);
		}
		if(node.right!=null&&flag){
			next.addFirst(node.right);
		}else if(node.right!=null&&!flag){
			next.addLast(node.right);
		}
		if(current.isEmpty()){
			res.add(tmp);
			tmp = new ArrayList<Integer>();
			current = next;
			flag = !flag;
		}
		return res;
	}
}