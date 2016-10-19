public void theFirstTraversal(Node root){
	printRoot(root)
	if(root.left != null){
		theFirstTraversal(root.left)
	}
	if(root.right != null){
		theFirstTraversal(root.right)
	}
}
public void theInOrderTraversal(Node root){

	if(root.left!=null){
		theInOrderTraversal(root)
	}
	printRoot(root)
	if(root.right!=null){
		theInOrderTraversal(root)
	}
}
public void thePostOrderTraversal(Node root){
	if(root.left){
		thePostOrderTraversal(root.left)
	}
	if(root.right){
		thePostOrderTraversal(root.right)
	}
	printRoot(root)
}