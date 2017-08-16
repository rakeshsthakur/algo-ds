package dev.trees;

import java.util.Stack;

/**
 * Created by rthakur on 7/19/17.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }


    public static void printTree(TreeNode root) {
        //        System.out.println(root.left.right.right.val);
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
//        stack.add(root);
        while (cur != null || !stack.isEmpty()) {
//            stack.add(cur);
//            if(stack.peek().left!=null) {
//                cur = cur.left;
//                stack.add(cur.left);
//            }
//            if(stack.peek().right!=null && stack.peek().left == null) {
//
//                stack.add(cur.right);
//            }
//            cur = stack.pop();
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            System.out.println(cur.val);
            cur = cur.right;
        }
    }
}
