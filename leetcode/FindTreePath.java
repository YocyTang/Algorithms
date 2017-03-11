public class FindTreePath{
	//二叉树寻找和为固定数的路径（到底部）
	public <List<List<Integer>> find(TreeNode root, int sum){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null){
			return res;
		}
		List<Integer> tmp = new  ArrayList<Integer>();
		int curr = 0;
		int sum = 0;
		find(root, sum, res, tmp, curr);
		return res;
	}
	private void find(TreeNode root, int sum, List<List<Integer>> res, List<Integer> tmp, int curr){
		curr+= root.val;
		tmp.add(root.val);
		if(root.left == null && root.right == null && curr ==sum){
			res.add(new ArrayList<Integer>(tmp));
			return;
		}
		if(root.left!=null){
			find(root.left, sum, res, tmp, curr);
		}
		if(root.right != null){
			find(root.right, sum , res, tmp, curr);
		}
		tmp.remove(tmp.size()-1);
	}
}