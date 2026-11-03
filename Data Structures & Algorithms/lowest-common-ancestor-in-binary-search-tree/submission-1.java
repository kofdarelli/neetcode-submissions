class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if root is null, or we found either p or q
        if (root == null || root == p || root == q) {
            return root;
        }

        // Look for p and q in left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If p and q are found in different subtrees, current root is the LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return the non-null value (bubble up the found node)
        return left != null ? left : right;
    }
}
