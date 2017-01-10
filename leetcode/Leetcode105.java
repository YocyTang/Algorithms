public TreeNode buildTree(int[] preorder, int[] inorder){
	int n = preorder.length;
	if(n == 0){
		return null;
	}
	return help(0, n-1, 0, n-1, preorder, inorder);

}
private TreeNode help(int startA, int endA, int startB, int endB, int[] a, int[] b){
	if(startA>endA|| startB>endB){
		return null;
	}
	int key = a[endA];
	int order = 0; 
	for(int i =startB; i<=endB;i++){
		if(b[i] == key){
			order = i;
			break;
		}
	}
	TreeNode root = new TreeNode(key);
	int len = order-startB;
	root.left= help(startA, startA+len-1, startB, order-1, a,b);
	root.right = help(startA+len, endA-1, order+1, endB , a, b);
}