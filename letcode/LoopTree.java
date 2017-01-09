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
	LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
	/// queue;;
	stack.addFirst(root);
	while(!stack.isEmpty()){
		TreeNode tmp = stack.removeFirst();
		res.add(res.val);
		if(res.right!=null){
			stack.addFirst(res.right);
		}
		if(res.left!= null){
			stack.addFirst(res.left);
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
	LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
	while(root!=null||!stack.isEmpty()){
		while(root!=null){
			stack.addFirst(root);
			root = root.left;
		}
		if(!stack.isEmpty()){
			root = stack.removeFirst();
			res.add(root.val);
			root = root.right;
		}
	}
	return res;
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
	LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
	TreeNode pre = root;
	TreeNode node = root;
	while(node!=null|| !stack.isEmpty()){
		while(node!=null){
			stack.addFirst(node);
			node = node.left;
		}
		if(!stack.isEmpty()){
			TreeNode tmp= stack.peek().right;
			if(tmp== null|| tmp== pre){
				node= stack.removeFirst();
				res.add(node.val);
				pre = node;
				node= null;
			}else {
				node= tmp;
			}
		}
	}
	return res;
}


//层次遍历
public List<List<Integer>> levelLoop(TreeNode root){
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	if(root== null){
		return res;
	}
	List<Integer> tmp = new ArrayList<Integer>();
	Queue<TreeNode> curr = new LinkedList<TreeNode>();
	Queue<TreeNode> next = new LinkedList<TreeNode>();
	curr.add(root);
	while(!curr.isEmpty()){
		TreeNode node = curr.remove();
		tmp.add(root.val);
		if(node.left!=null){
			next.offer(node.left);
		}
		if(node.right!=null){
			next.offer(node.right)
		}
		if(curr.isEmpty()){
			curr = next;

			res.add(tmp);
			tmp = new ArrayList<Integer>();
			next = LinkedList<TreeNode>();
		}
	}
	return res;
}