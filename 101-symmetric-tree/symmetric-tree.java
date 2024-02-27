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
   
   static boolean isSymmetricUtil(TreeNode a,TreeNode b)
   {
     if(a==null || b==null) return a==b;
     return (a.val==b.val)&&isSymmetricUtil(a.left,b.right)&&isSymmetricUtil(
       a.right,b.left);
   }
    public boolean isSymmetric(TreeNode a){
        if(a==null) return true;
        return isSymmetricUtil(a.left,a.right);
    }
}