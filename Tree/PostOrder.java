package Tree;

import java.util.ArrayList;
import java.util.Stack;

//二叉树的后序遍历
//左右根
public class PostOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		PostOrder poo = new PostOrder();
		poo.postOrder2(root);
	}
	//递归方式
	ArrayList<Integer> a = new ArrayList<Integer>();
	public void postOrder1(TreeNode root) {
		if(root.left!=null) {
			postOrder1(root.left);
		}
		if(root.right!=null) {
			postOrder1(root.right);
		}
		a.add(root.val);
		System.out.print(""+root.val+"->");
	}
	public void postOrder2(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode cur=null,pre = null;
		stack.push(root);
		while(!stack.isEmpty()) {
			cur = stack.peek();
			if((cur.left==null && cur.right==null)||(pre!=null &&(pre==cur.left||pre==cur.right))) {
				a.add(cur.val);
				System.out.print(""+cur.val+"->");
				stack.pop();
				pre = cur;
			}else {
				if(cur.right!=null) stack.push(cur.right);
				if(cur.left!=null) stack.push(cur.left);
			}
		}
	}
}
