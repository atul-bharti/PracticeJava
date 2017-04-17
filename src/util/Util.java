package util;

import ds.TreeNode;

public class Util {
	public static void print(TreeNode root) {
		if(root == null)
			return;
		else
		{
			System.out.print(root.data+" ");
			print(root.left);
			print(root.right);
		}
	}
	
	

}
