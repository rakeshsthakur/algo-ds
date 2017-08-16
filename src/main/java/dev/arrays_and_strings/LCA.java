package dev.arrays_and_strings;

import dev.trees.TreeNode;

/**
 * Created by rthakur on 7/31/17.
 */
public class LCA {

    public TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || root == p || root == q)
            return root;


        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);

        if (left != null && right != null)
            return root;

        return left == null ? right : left;
    }
}
