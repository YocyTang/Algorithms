public class PathSum{
	public List<List<Integer>> solution(TreeNode root, int sum){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> tmp = new ArrayList<Integer>();
		if(root == null){
			return res;
		}
		tmp.add(root.val);
		pathHelp(res, tmp, sum-root.val, root);
		return res;
	}
	private void pathHelp(List<List<Integer>> res, List<Integer> tmp, sum, TreeNode root){
		if(root.left == null&&root.right == null&&sum == 0){
			List<Integer> l = new ArrayList<Integer>();
			l.addAll(tmp);
			res.add(l);
		}
		if(root.left != null){
			tmp.add(root.left.val);
			pathHelp(res, tmp, sum-root.left.val, root.left);
			tmp.remove(tmp.size()-1);
		}
		if(root.right != null){
			tmp.add(root.right.val);
			pathHelp(res, tmp, sum-root.right.val, root.right);
			tmp.remove(tmp.size()-1);
		}
	}
}