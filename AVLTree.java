package tree;

/**
 * Self-balancing AVL Tree
 * @author CS 2100 Team
 *
 * @param <T>
 */
 
 // Don't worry about this class for the first assignment in the module.
 // You WILL use this class in the second assignment on AVL trees.

public class AVLTree<T extends Comparable<T>> extends BinarySearchTree<T>{
	
	@Override
	public void insert(T data) {
		this.root = insert(data, this.root);
	}
	protected TreeNode<T> insert(T data, TreeNode<T> curNode) {
		//TODO: Implement this method
		if(curNode == null) {
			
			return new TreeNode<T>(data);
			
		} else if (data.compareTo(curNode.data) < 0) {

			curNode.left = insert(data, curNode.left);

	    } else if (data.compareTo(curNode.data) > 0) {
	        
	    	curNode.right = insert(data, curNode.right);

	    } else {

	    	return curNode;
	    }

	     curNode.height = Math.max(height(curNode.left), height(curNode.right))+1;
	     int balance = balanceFactor(curNode);

	     if (balance > 1 && (data.compareTo(curNode.left.data) < 0)) {
	    	 return rotateRight(curNode);
	    	 
	     }
	     if (balance < -1 && (data.compareTo(curNode.right.data) > 0)) {
	    	 return rotateLeft(curNode);
	    	 
	     } 
	     if (balance > 1 && (data.compareTo(curNode.left.data) > 0)) {
	    	 curNode.left = rotateLeft(curNode.left);
	    	 return rotateRight(curNode);
	    	 
	     } 
	     
	     if (balance < -1 && (data.compareTo(curNode.right.data) < 0)) {
	    	 curNode.right = rotateRight(curNode.right);
	    	 return rotateLeft(curNode);
	     
	     }
	     
	     return curNode;
	}

	private int max(int height, int height2) {
		// TODO Auto-generated method stub
		return (height > height2) ? height : height2;
	}
	
	@Override
	public void remove(T data) {
		/* Call remove starting at the root of the tree */
		this.root = remove(data, this.root);
	}
	protected TreeNode<T> remove(T data, TreeNode<T> curNode) {
		/* Call BST remove before balancing, use “super” to achieve this */
		curNode = super.remove(data,  curNode);
		
		/* Handle the case when remove returns null */
		if(curNode == null) return null;
		
		/* update the height of this node if necessary (if no change, that’s OK) */
		curNode.height = Math.max(height(curNode.left), height(curNode.right))+1;
		
		/* rotate if necessary (call balance() method to balance the node) */
		curNode = this.balance(curNode);
		
		return curNode;
	}
	
	/**
	 * Balances the given node. Assumes it is the lowest unbalanced node if unbalanced
	 * @param node
	 * @return
	 */
	private TreeNode<T> balance(TreeNode<T> curNode) {
		//TODO: Implement this method
		
		return null;
	}
	
	private TreeNode<T> rotateRight(TreeNode<T> curNode) {
		//TODO: Implement this method
		TreeNode<T> x = curNode.left;
		TreeNode<T> temp = x.right;
		x.right = curNode;
		curNode.left = temp;
		curNode.height = Math.max(height(curNode.left), height(curNode.right))+1;
		x.height = Math.max(height(x.left), height(x.right))+1;
		return x;
	}
	
	private TreeNode<T> rotateLeft(TreeNode<T> curNode){
		//TODO: Implement this method
		TreeNode<T> x = curNode.right;
		TreeNode<T> temp = x.left;
		x.left = curNode;
		curNode.right = temp;
		curNode.height = Math.max(height(curNode.left), height(curNode.right))+1;
		x.height = Math.max(height(x.left), height(x.right))+1;
		return x;
	}
	
	private int balanceFactor(TreeNode<T> node) {
		//TODO: Implement this method
		if (node == null) {
			
			return 0;
		}
		
		return height(node.left) - height(node.right);
	}
	
	
}
