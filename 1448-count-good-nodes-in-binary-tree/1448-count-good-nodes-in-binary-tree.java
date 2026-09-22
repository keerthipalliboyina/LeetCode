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
    public int goodNodes(TreeNode root) {
        if(root == null)
        {
            return 0;
        }

        return dfs(root,root.val);
    }
    public int dfs(TreeNode root,int maxval)
    {
        if(root == null)
        {
            return 0;
        }
        int res;
        if(root.val>=maxval)
        {
            res=1;
        }
        else
        {
            res=0;
        }
        maxval=Math.max(maxval,root.val);
        res+=dfs(root.left,maxval);
        res+=dfs(root.right,maxval);
        return res;
    }
}