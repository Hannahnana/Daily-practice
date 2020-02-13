package Tree;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
	public int getVal() {
		return this.val;
	}
	public void setVal(int val) {
		this.val = val;
	}
}
