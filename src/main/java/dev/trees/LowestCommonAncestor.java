package dev.trees;

/**
 * Created by rthakur on 7/19/17.
 */
public class LowestCommonAncestor {


    public static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || root == p || root == q)
            return root;

        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);
        if (left != null && right != null)
            return root;

        return left != null ? left : right;

    }

    public static void main(String[] args) {


        /**
         * Creates a tree like:
         *               1
         *              /  \
         *             /    \
         *            2      5
         *           / \     /
         *          /   \   /
         *         3     4 6
         */

        TreeNode root = new TreeNode(1);
        TreeNode left2 = new TreeNode(2);
        root.left = left2;
        TreeNode right5 = new TreeNode(5);
        root.right = right5;
        TreeNode left3 = new TreeNode(3);
        left2.left = left3;
        TreeNode right4 = new TreeNode(4);
        left2.right = right4;
        TreeNode left6 = new TreeNode(6);
        right5.left = left6;

        System.out.println("Printing tree");
        TreeNode.printTree(root);

        TreeNode res = lca(root, left6, right5);
        System.out.println("Result " + res.val);
    }
}
