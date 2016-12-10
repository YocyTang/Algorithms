//二叉树的遍历

//前序递归
public List<Integer> TreeLoopRe(TreeNode root){
	List<Integer> res = new ArrayList<Integer>();
	
	TreeLoopRe(root, res);
	return res;
}
public void TreeLoopRe(TreeNode root, List<Integer> res){
	if(root==null){
		return;
	}
	res.add(root.val);
	if(root.left!=null){
		TreeLoopRe(root.left, res);
	}
	if(root.right!= null){
		TreeLoopRe(root.right, res);
	}
}

//前序非递归
public List<Integer> TreeLoopRe(TreeNode root){
	List<Integer> res = new ArrayList<Integer>();
	if(root == null){
		return res;
	}
	List<TreeNode> stack = new LinkedList<TreeNode>();
	while(root!=null || !stack.isEmpty()){
		while(root!=null){
			res.add(root.val);
			stack.add(root);
			root = root.left;
		}
		if(!stack.isEmpty()){
			root = stack.remove(stack.size());
			root = root.right;
		}
	}
}

// 中序遍历递归
public List<Integer> Inorder(TreeNode root){
	List<Integer> res = new ArrayList<Integer>();
	
	Inorder(root, res);
	return res;
}
public void Inorder(TreeNode root, List<Integer> res){
	if(root == null){
		return;
	}
	if(root.left!=null){
		Inorder(root.left, res);
	}
	res.add(root.val);
	if(root.right!=null){
		Inorder(right.right, res);
	}
}

//中序遍历非递归
public List<Integer> Inorder(TreeNode root){
	List<Integer> res = new ArrayList<Integer>();
	if(root == null){
		return res;
	}
	List<TreeNode> stack = new LinkedList<TreeNode>();
	while(root!=null||!stack.isEmpty()){
		while(root!=null){
			stack.add(root);
			root = root.left;
		}
		if(!stack.isEmpty()){
			root = stack.remove(stack.size());
			res.add(root.val);
			root = root.right;
		}
	}
}


//后序遍历递归算法
public List<Integer> PostOrder(TreeNode root){
	List<Integer> res = new ArrayList<Integer>();
	PostOrder(root, res);
	return res;
}
private void PostOrder(TreeNode root, List<Integer> res){
	if(root == null)
		return res;
	if(root.left!=null){
		PostOrder(root.left, res);
	}
	if(root.right!=null){
		PostOrder(root.right, res);
	}
	res.add(root.val);
}

//后序遍历非递归

public List<Integer> PostOrder(TreeNode root){
	List<Integer> res = new ArrayList<Integer>();
	if(root== null){
		return res;
	}
	Integer i = new Integer(1);
	List<TreeNode> stackTree = new LinkedList<TreeNode>();
	List<Integer> stackInt = new LinkedList<Integer>();
	while(root!=null|| !stackTree.isEmpty()){
		while(root!=null){
			stackTree.add(root);
			stackInt.add(new Integer(0));
			root = root.left;
		}
		while(!stackTree.isEmpty() && stackInt.peek().eqauls(i)){
			stackInt.pop();
			res.add(stackTree.pop().val);
		}
		if(!stackTree.isEmpty()){
			stackInt.pop();
			stackInt.add(new Integer(1));
			root= stackTree.peek();
			root = root.right;
			root = stack.remove(stack.size());

		}
	}
}


//层次遍历
public List<List<Integer>> levelLoop(TreeNode root){
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	if(root== null){
		return res;
	}
	List<Integer> tmp = new ArrayList<Integer>();
	List<TreeNode> stack = new LinkedList<TreeNode>();
	stack.add(root);
	while(!stack.isEmpty()){
		root = stack.remove();
		tmp.add(root.val);
		if(stack.isEmpty()){
			stack.add(root.left);
			stack.add(root.right);
			res.add(new ArrayList(tmp));
		}
	}
	return res;
}