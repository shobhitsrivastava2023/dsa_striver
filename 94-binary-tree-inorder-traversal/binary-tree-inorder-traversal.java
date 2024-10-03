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
    public static List<Integer> dfs(TreeNode root){ 
        List<Integer> nl = new ArrayList<>(); 
        if(root == null){ 
            return new ArrayList<>();
        }
        if(root!= null){
            nl.addAll(dfs(root.left));
            nl.add(root.val);
            nl.addAll(dfs(root.right));
        }
        return nl; 
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        return dfs(root); 
        
        
    }
}