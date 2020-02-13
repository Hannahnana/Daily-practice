package Tree;

import java.util.ArrayList;
import java.util.Stack;

//中序遍历
public class MidOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
//		root.left.left = new TreeNode(4);
//		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
//		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		MidOrder mo = new MidOrder();
		mo.midOrder2(root);
	}
	//递归方式
	ArrayList<Integer> a = new ArrayList<Integer>();
	public void midOrder1(TreeNode root) {
		if(root.left!=null) { //左子树不为空，则遍历左子树
			midOrder1(root.left);
		}
		a.add(root.val);
		System.out.print(""+root.val+"->");
		if(root.right!=null) {
			midOrder1(root.right);
		}
	}
	//非递归方式
	public void midOrder2(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(root!=null || !stack.isEmpty()) {
			while(root!=null) {
				stack.push(root);
				root = root.left;
			}
			if(!stack.isEmpty()) {
				root = stack.pop();
				System.out.print(""+root.val+"->");
				a.add(root.val);
				root=root.right;
			}
		}
	}
}
