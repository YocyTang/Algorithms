public class LevelLoop{
	public List<List<Integer>> solution(TreeNode root){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null){
			return res;
		}
		List<Integer> tmp = new ArrayList<Integer>();
		Queue<TreeNode> curr = new LinkedList<TreeNode>();
		Queue<TreeNode> next = new LinkedList<TreeNode>();
		curr.offer(root);
		while(!curr.isEmpty()){
			TreeNode node = curr.remove();
			tmp.add(node.val);
			if(node.left!=null){
				next.offer(node.left);
			}
			if(node.right!=null){
				next.offer(node.right);
			}
			if(curr.isEmpty()){
				curr= next;
				res.add(tmp);
				tmp = new ArrayList<Integer>();
				next = new LinkedList<TreeNode>();
			}
		}
		return res;
	}
}