/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        int leftside=0;
        int rightside=0;
        if (root==null) return 0;
        if (root.left!=null){
             leftside= maxDepth(root.left);
        }
        if (root.right!=null){
             rightside=maxDepth(root.right);
        }
        return 1+Math.max(leftside,rightside);
    }
}
