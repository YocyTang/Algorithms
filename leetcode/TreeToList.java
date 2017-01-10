public class TreeToList{
	public TreeNode convert(TreeNode root){
		TreeNode lastOfList = null;
		convert(root, lastOfList);
		while(lastOfList!=null &&lastOfList.left !=null){
			lastOfList = lastOfList.left;
		}
		return lastOfList;
	}
	private void convert(TreeNode root, TreeNode lastOfList){
		if(root == null){
			return;
		}
		TreeNode current = root;
		if(current.left!=null){
			convert(root.left, lastOfList);
		}
		current.left = lastOfList;
		if(lastOfList !=null){
			lastOfList.right = current;
		}
		lastOfList = current;
		if(lastOfList.right!=null){
			convert(root.right, lastOfList);
		}
	}
}