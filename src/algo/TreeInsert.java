package algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import ds.TreeNode;
import util.Util;

public class TreeInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(6);
		
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		
		print(root);
		System.out.println("");
		
		

	}
	
	static void insert(TreeNode root, int data) {
		if(root == null)
			root = new TreeNode(data);
		else
		{
			insertNode( root,  data);
		}
	}
	static void insertNode(TreeNode node, int data) {
		if(node == null) {
			node = new TreeNode(data);
			return;
		}else {
			if(node.left == null) {
				node.left = new TreeNode(data);
				return;
			}
			if(node.right == null) {
				node.right = new TreeNode(data);
				return;
			}
			insertNode( node.left,  data);
		}
			
		}
		
		static void print(TreeNode node) {
			if(node == null) {
				return;
			}
			Queue<TreeNode> q = new LinkedList<TreeNode>();
			Stack<TreeNode> s = new Stack<TreeNode>();
			q.offer(node);
            while(!q.isEmpty()) {
            	TreeNode temp = q.poll();
            	if(temp.left != null)
            		q.offer(temp.left);
            	if(temp.right != null)
            		q.offer(temp.right);
            	
            	s.push(temp);
            }
            while(!s.isEmpty()) {
            	System.out.println(s.pop().data);
            }
	}
	

}


