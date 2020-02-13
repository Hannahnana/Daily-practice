package Tree;
//二叉树的前序遍历
//前序遍历：根左子树右子树
import java.util.ArrayList;
import java.util.Stack;

public class PreOrder {
	
	//首先我们构造一棵树
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		PreOrder po = new PreOrder();
		po.preOrder2(root);
	}
	//递归方式
	ArrayList<Integer> a = new ArrayList<Integer>();
	public void preOrder1(TreeNode root) {
		a.add(root.val);
		System.out.print(""+root.val+"->");
		if(root.left!=null) { //左子树不为空，则遍历左子树
			preOrder1(root.left);
		}
		if(root.right!=null) {
			preOrder1(root.right);
		}
	}
	//非递归方式
	public void preOrder2(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) { //边界条件注意一下
			TreeNode p = stack.pop();
			a.add(p.val);
			System.out.print(""+p.val+"->");
			if(p.right!=null) {
				stack.push(p.right);
			}
			if(p.left!=null) {
				stack.push(p.left);
			}
		}
		System.out.print(a);
	}
}
